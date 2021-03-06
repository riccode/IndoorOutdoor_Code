import argparse
import logging
import pandas as pd
import datetime
import time
import os
import re
from subprocess import Popen

from garminexport.garminclient import GarminClient
import garminexport.backup as bkp
from garminexport.retryer import (Retryer, ExponentialBackoffDelayStrategy, MaxRetriesStopStrategy)
import cleangarmindata.cleangarmin as cleanGarmin

from lumoexport.lumoclient import list_activities
from lumoexport.lumoclient import download_session

PATH = os.path.dirname(os.path.realpath(__file__))

logging.basicConfig(level=logging.INFO, format="%(asctime)-15s [%(levelname)s] %(message)s")
log = logging.getLogger(__name__)


if __name__ == "__main__":
    parser = argparse.ArgumentParser(
        description="Download Garmin and Lumo activities")
    # positional args
    parser.add_argument(
        "Garmin_id", metavar="<Garmin ID>", type=str, help="Garmin_id")
    parser.add_argument(
        "Lumo_id", metavar="<Lumo ID>", type = str, help="Lumo_ID")
    #optional args
    parser.add_argument(
        "--min_date", type=str, help="Minimum search date.")

    parser.add_argument(
        "--max_date", type=str, help="Max search date.")

    args = parser.parse_args()

    if not args.min_date:
        args.min_date = input("Provide Minimum search date: ")

    if not args.max_date:
        args.max_date = input("Provide Maximum search date: ")



    garmin_uname = "ricmrs"+args.Garmin_id+"@ucalgary.ca"
    print(garmin_uname)
    garmin_pwd = "Fall.1010"

    lumo_unmae = "ricmrs" + args.Lumo_id +"@ucalgary.ca"
    lumo_pwd = "Fall.1010"

    log.info("Garmin login = %s Lumo Login = %s" %(garmin_uname, lumo_unmae))
    PARTICIPANT_ID = "Garmin"+ args.Garmin_id+"_Lumo" + args.Lumo_id
    ###### GARMIN DOWNLOAD #####
    log.info('Getting Garmin Files...')

    retryer = Retryer(
        delay_strategy=ExponentialBackoffDelayStrategy(
            initial_delay=datetime.timedelta(seconds=1)),
        stop_strategy=MaxRetriesStopStrategy(5))

    PARTICIPANT_DIR = PATH +"/IO_GarminLumoFiles/" + PARTICIPANT_ID

    DOWNLOAD_GARMIN = input('Download Garmin (y/n)?')
    while DOWNLOAD_GARMIN not in ['y', 'n']:
        print("Incorrect Input.  enter either (y/n)")
        DOWNLOAD_GARMIN = input('Download Garmin (y/n)?')

    if DOWNLOAD_GARMIN == 'y':
        try:
            with GarminClient(garmin_uname, garmin_pwd) as gar_client:
                log.info("activities:")
                activities = retryer.call(gar_client.list_activities)
                log.info("Account has a total of %d activities total", len(activities))
                # Loop through activities here....

                activity_dates = [int(str(act[1].date()).replace("-", "")) for act in activities]

                for i in range(0, len(activities) - 1):
                    activity_id = activities[i][0]
                    activity = gar_client.get_activity_summary(activity_id)
                    activity_type = activity["activityTypeDTO"]["typeKey"]
                    print("Activity_type = %s" %(activity_type))
                    if activity_type in ('running', 'treadmill_running'):  # only download running activities
                        activity_date = activities[i][1]
                        activity_date = str(activity_date.date())
                        activity_date = activity_date.replace("-", "")
                        print("Activity_date = %s" %(activity_date))

                        if int(activity_date) >= int(args.min_date) and int(activity_date) <= int(args.max_date):

                            if not os.path.exists(PARTICIPANT_DIR + "/" + str(activity_date)):
                                os.makedirs(PARTICIPANT_DIR + "/" + str(activity_date))
                                os.makedirs(PARTICIPANT_DIR + "/" + str(activity_date) + '/Garmin')
                                os.makedirs(PARTICIPANT_DIR + "/" + str(activity_date) + '/Lumo')
                                os.makedirs(PARTICIPANT_DIR + "/" + str(activity_date) + '/Upload')

                            directory = PARTICIPANT_DIR + '/' + str(activity_date) + '/Garmin'
                            log.info("Downloading run from {}".format(activity_date))

                            if sum([a == int(activity_date) for a in activity_dates])>1:
                                log.info('Multiple activities...')
                                fit_filename = str(activity_date) + '_' +str(activity_id) + '_'+activity_type +'_Garmin.fit'
                            else:
                                fit_filename = str(activity_date) +  '_'+activity_type +'_Garmin.fit'

                            bkp.download(gar_client, activities[i], retryer, directory, fit_filename, 'fit')
                            log.info('Download Complete')

                            fit_file_location = directory + '/' + fit_filename

                            csv_file_name = fit_file_location.replace('.fit', '_data.csv')
                            if not os.path.exists(csv_file_name):
                                log.info('Converting to CSV....')
                                fit_conversion = Popen(['run_FIT_Converter.bat', fit_file_location])
                                fit_conversion.wait(20)
                                log.info('Conversion successful!')

                            log.info('Reformating csv file...')

                            cleanGarmin.clean_garmin_fit_data(csv_file_name)

        except Exception as e:
            log.error(u"failed with exception: %s", e)

        log.info("GARMIN IMPORT COMPLETE")

    DOWNLOAD_LUMO = input('Download Lumo (y/n)?')
    while DOWNLOAD_LUMO not in ['y', 'n']:
        print("Incorrect Input.  enter either (y/n)")
        DOWNLOAD_LUMO = input('Download Lumo (y/n)?')

    if DOWNLOAD_LUMO =='y':
        log.info('GETTING LUMO ACTIVITIES')
        activities = list_activities(username_input=lumo_unmae, password_input=lumo_pwd)
        print(activities.run_date)
        if activities is not None:
            mask = [int(run_date) >= int(args.min_date) and int(run_date) <= int(args.max_date) for run_date in activities.run_date]
            activities = activities[mask]
            n_activities = activities.shape
            log.info('Activities retrieved')
            log.info("Account has a total of %d activities in range", n_activities[0])
            for run_date in set(activities.run_date):
                log.info('##### New run: {0} #####'.format(run_date))
                activities_subset = activities[activities.run_date.values == int(run_date)]

                if not os.path.exists(PARTICIPANT_DIR + "/" + str(run_date)):
                    os.makedirs(PARTICIPANT_DIR + "/" + str(run_date))
                    os.makedirs(PARTICIPANT_DIR + "/" + str(run_date) + '/Garmin')
                    os.makedirs(PARTICIPANT_DIR + "/" + str(run_date) + '/Lumo')
                    os.makedirs(PARTICIPANT_DIR + "/" + str(run_date) + '/Upload')

                elif not os.path.exists(PARTICIPANT_DIR + "/" + str(run_date) + '/Lumo'):
                    os.makedirs(PARTICIPANT_DIR + "/" + str(run_date) + '/Lumo')
                activity_id = activities_subset['activity_id'].values

                if len(activity_id) == 1: #single run
                    activity_id = activities_subset['activity_id'].values
                    activity_id = activity_id[0]
                    log.info('Downloading activity {0}.  Recorded {1}....'.format(activity_id, run_date))
                    directory = PARTICIPANT_DIR + '/' + str(run_date) + '/Lumo'
                    filename =  str(run_date) + '_Lumo.csv'
                    full_filename = directory + '/' + filename
                    if not os.path.exists(full_filename):
                        try:
                            download_session(lumo_unmae, lumo_pwd, activity_id, directory, filename)
                            log.info('Download Complete  ....')
                        except Exception as e:
                            log.error(u"failed with exception: %s", e)
                            Popen(['kill_chromedriver.bat'])
                    else:
                        log.info('File already exists for this activity')

                else: # multiple runs
                    log.info('Multiple activities!!!')
                    for i in range(len(activity_id)):
                        activity_id_input = activity_id[i]

                        log.info('Downloading activity {0}.  Recorded {1}....'.format(activity_id_input, run_date))
                        directory = PARTICIPANT_DIR + '/' + str(run_date) + '/Lumo'
                        filename = str(run_date) + '_' + str(i+1) + '_Lumo.csv'
                        full_filename = directory + '/' + filename
                        if not os.path.exists(full_filename):
                            try:
                                download_session(username=lumo_unmae, password=lumo_pwd, activity_id=activity_id_input, filedir=directory, filename=filename)
                                log.info('Download Complete :) ....')
                            except Exception as e:
                                log.error(u"failed with exception: %s", e)
                                Popen(['kill_chromedriver.bat'])
                        else:
                            log.info('File already exists for this activity')
                Popen(['kill_chromedriver.bat'])

            log.info("LUMO IMPORT COMPLETE")

    print("SESSION COMPLETE....")