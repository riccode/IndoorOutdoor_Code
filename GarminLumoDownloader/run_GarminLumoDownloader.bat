@echo off
set /p gid="Enter Garmin ID: "
set /p lid="Enter Lumo ID: "
set /p min_date="Enter MIN DATE: "
set /p max_date="Enter MAX DATE: "
cmd /c "cd /d C:\Users\Running Injury Clini\Desktop\IndoorOutdoor\GarminLumoDownloader & python GarminLumoDownloader.py %gid%  %lid% --min_date %min_date% --max_date %max_date% & pause"