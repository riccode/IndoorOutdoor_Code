////////////////////////////////////////////////////////////////////////////////
// The following FIT Protocol software provided may be used with FIT protocol
// devices only and remains the copyrighted property of Dynastream Innovations Inc.
// The software is being provided on an "as-is" basis and as an accommodation,
// and therefore all warranties, representations, or guarantees of any kind
// (whether express, implied or statutory) including, without limitation,
// warranties of merchantability, non-infringement, or fitness for a particular
// purpose, are specifically disclaimed.
//
// Copyright 2018 Dynastream Innovations Inc.
////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 20.66Release
// Tag = production/akw/20.66.00-0-gc7b345b
////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;

import java.util.HashMap;
import java.util.Map;

public class CoreExerciseName {
    public static final int ABS_JABS = 0;
    public static final int WEIGHTED_ABS_JABS = 1;
    public static final int ALTERNATING_PLATE_REACH = 2;
    public static final int BARBELL_ROLLOUT = 3;
    public static final int WEIGHTED_BARBELL_ROLLOUT = 4;
    public static final int BODY_BAR_OBLIQUE_TWIST = 5;
    public static final int CABLE_CORE_PRESS = 6;
    public static final int CABLE_SIDE_BEND = 7;
    public static final int SIDE_BEND = 8;
    public static final int WEIGHTED_SIDE_BEND = 9;
    public static final int CRESCENT_CIRCLE = 10;
    public static final int WEIGHTED_CRESCENT_CIRCLE = 11;
    public static final int CYCLING_RUSSIAN_TWIST = 12;
    public static final int WEIGHTED_CYCLING_RUSSIAN_TWIST = 13;
    public static final int ELEVATED_FEET_RUSSIAN_TWIST = 14;
    public static final int WEIGHTED_ELEVATED_FEET_RUSSIAN_TWIST = 15;
    public static final int HALF_TURKISH_GET_UP = 16;
    public static final int KETTLEBELL_WINDMILL = 17;
    public static final int KNEELING_AB_WHEEL = 18;
    public static final int WEIGHTED_KNEELING_AB_WHEEL = 19;
    public static final int MODIFIED_FRONT_LEVER = 20;
    public static final int OPEN_KNEE_TUCKS = 21;
    public static final int WEIGHTED_OPEN_KNEE_TUCKS = 22;
    public static final int SIDE_ABS_LEG_LIFT = 23;
    public static final int WEIGHTED_SIDE_ABS_LEG_LIFT = 24;
    public static final int SWISS_BALL_JACKKNIFE = 25;
    public static final int WEIGHTED_SWISS_BALL_JACKKNIFE = 26;
    public static final int SWISS_BALL_PIKE = 27;
    public static final int WEIGHTED_SWISS_BALL_PIKE = 28;
    public static final int SWISS_BALL_ROLLOUT = 29;
    public static final int WEIGHTED_SWISS_BALL_ROLLOUT = 30;
    public static final int TRIANGLE_HIP_PRESS = 31;
    public static final int WEIGHTED_TRIANGLE_HIP_PRESS = 32;
    public static final int TRX_SUSPENDED_JACKKNIFE = 33;
    public static final int WEIGHTED_TRX_SUSPENDED_JACKKNIFE = 34;
    public static final int U_BOAT = 35;
    public static final int WEIGHTED_U_BOAT = 36;
    public static final int WINDMILL_SWITCHES = 37;
    public static final int WEIGHTED_WINDMILL_SWITCHES = 38;
    public static final int ALTERNATING_SLIDE_OUT = 39;
    public static final int WEIGHTED_ALTERNATING_SLIDE_OUT = 40;
    public static final int GHD_BACK_EXTENSIONS = 41;
    public static final int WEIGHTED_GHD_BACK_EXTENSIONS = 42;
    public static final int OVERHEAD_WALK = 43;
    public static final int INCHWORM = 44;
    public static final int WEIGHTED_MODIFIED_FRONT_LEVER = 45;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(ABS_JABS, "ABS_JABS");
        stringMap.put(WEIGHTED_ABS_JABS, "WEIGHTED_ABS_JABS");
        stringMap.put(ALTERNATING_PLATE_REACH, "ALTERNATING_PLATE_REACH");
        stringMap.put(BARBELL_ROLLOUT, "BARBELL_ROLLOUT");
        stringMap.put(WEIGHTED_BARBELL_ROLLOUT, "WEIGHTED_BARBELL_ROLLOUT");
        stringMap.put(BODY_BAR_OBLIQUE_TWIST, "BODY_BAR_OBLIQUE_TWIST");
        stringMap.put(CABLE_CORE_PRESS, "CABLE_CORE_PRESS");
        stringMap.put(CABLE_SIDE_BEND, "CABLE_SIDE_BEND");
        stringMap.put(SIDE_BEND, "SIDE_BEND");
        stringMap.put(WEIGHTED_SIDE_BEND, "WEIGHTED_SIDE_BEND");
        stringMap.put(CRESCENT_CIRCLE, "CRESCENT_CIRCLE");
        stringMap.put(WEIGHTED_CRESCENT_CIRCLE, "WEIGHTED_CRESCENT_CIRCLE");
        stringMap.put(CYCLING_RUSSIAN_TWIST, "CYCLING_RUSSIAN_TWIST");
        stringMap.put(WEIGHTED_CYCLING_RUSSIAN_TWIST, "WEIGHTED_CYCLING_RUSSIAN_TWIST");
        stringMap.put(ELEVATED_FEET_RUSSIAN_TWIST, "ELEVATED_FEET_RUSSIAN_TWIST");
        stringMap.put(WEIGHTED_ELEVATED_FEET_RUSSIAN_TWIST, "WEIGHTED_ELEVATED_FEET_RUSSIAN_TWIST");
        stringMap.put(HALF_TURKISH_GET_UP, "HALF_TURKISH_GET_UP");
        stringMap.put(KETTLEBELL_WINDMILL, "KETTLEBELL_WINDMILL");
        stringMap.put(KNEELING_AB_WHEEL, "KNEELING_AB_WHEEL");
        stringMap.put(WEIGHTED_KNEELING_AB_WHEEL, "WEIGHTED_KNEELING_AB_WHEEL");
        stringMap.put(MODIFIED_FRONT_LEVER, "MODIFIED_FRONT_LEVER");
        stringMap.put(OPEN_KNEE_TUCKS, "OPEN_KNEE_TUCKS");
        stringMap.put(WEIGHTED_OPEN_KNEE_TUCKS, "WEIGHTED_OPEN_KNEE_TUCKS");
        stringMap.put(SIDE_ABS_LEG_LIFT, "SIDE_ABS_LEG_LIFT");
        stringMap.put(WEIGHTED_SIDE_ABS_LEG_LIFT, "WEIGHTED_SIDE_ABS_LEG_LIFT");
        stringMap.put(SWISS_BALL_JACKKNIFE, "SWISS_BALL_JACKKNIFE");
        stringMap.put(WEIGHTED_SWISS_BALL_JACKKNIFE, "WEIGHTED_SWISS_BALL_JACKKNIFE");
        stringMap.put(SWISS_BALL_PIKE, "SWISS_BALL_PIKE");
        stringMap.put(WEIGHTED_SWISS_BALL_PIKE, "WEIGHTED_SWISS_BALL_PIKE");
        stringMap.put(SWISS_BALL_ROLLOUT, "SWISS_BALL_ROLLOUT");
        stringMap.put(WEIGHTED_SWISS_BALL_ROLLOUT, "WEIGHTED_SWISS_BALL_ROLLOUT");
        stringMap.put(TRIANGLE_HIP_PRESS, "TRIANGLE_HIP_PRESS");
        stringMap.put(WEIGHTED_TRIANGLE_HIP_PRESS, "WEIGHTED_TRIANGLE_HIP_PRESS");
        stringMap.put(TRX_SUSPENDED_JACKKNIFE, "TRX_SUSPENDED_JACKKNIFE");
        stringMap.put(WEIGHTED_TRX_SUSPENDED_JACKKNIFE, "WEIGHTED_TRX_SUSPENDED_JACKKNIFE");
        stringMap.put(U_BOAT, "U_BOAT");
        stringMap.put(WEIGHTED_U_BOAT, "WEIGHTED_U_BOAT");
        stringMap.put(WINDMILL_SWITCHES, "WINDMILL_SWITCHES");
        stringMap.put(WEIGHTED_WINDMILL_SWITCHES, "WEIGHTED_WINDMILL_SWITCHES");
        stringMap.put(ALTERNATING_SLIDE_OUT, "ALTERNATING_SLIDE_OUT");
        stringMap.put(WEIGHTED_ALTERNATING_SLIDE_OUT, "WEIGHTED_ALTERNATING_SLIDE_OUT");
        stringMap.put(GHD_BACK_EXTENSIONS, "GHD_BACK_EXTENSIONS");
        stringMap.put(WEIGHTED_GHD_BACK_EXTENSIONS, "WEIGHTED_GHD_BACK_EXTENSIONS");
        stringMap.put(OVERHEAD_WALK, "OVERHEAD_WALK");
        stringMap.put(INCHWORM, "INCHWORM");
        stringMap.put(WEIGHTED_MODIFIED_FRONT_LEVER, "WEIGHTED_MODIFIED_FRONT_LEVER");
    }


    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value, or empty if unknown
     */
    public static String getStringFromValue( Integer value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Retrieves a value given a string representation
     * @return The value or INVALID if unkwown
     */
    public static Integer getValueFromString( String value ) {
        for( Map.Entry<Integer, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
