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

public class ChopExerciseName {
    public static final int CABLE_PULL_THROUGH = 0;
    public static final int CABLE_ROTATIONAL_LIFT = 1;
    public static final int CABLE_WOODCHOP = 2;
    public static final int CROSS_CHOP_TO_KNEE = 3;
    public static final int WEIGHTED_CROSS_CHOP_TO_KNEE = 4;
    public static final int DUMBBELL_CHOP = 5;
    public static final int HALF_KNEELING_ROTATION = 6;
    public static final int WEIGHTED_HALF_KNEELING_ROTATION = 7;
    public static final int HALF_KNEELING_ROTATIONAL_CHOP = 8;
    public static final int HALF_KNEELING_ROTATIONAL_REVERSE_CHOP = 9;
    public static final int HALF_KNEELING_STABILITY_CHOP = 10;
    public static final int HALF_KNEELING_STABILITY_REVERSE_CHOP = 11;
    public static final int KNEELING_ROTATIONAL_CHOP = 12;
    public static final int KNEELING_ROTATIONAL_REVERSE_CHOP = 13;
    public static final int KNEELING_STABILITY_CHOP = 14;
    public static final int KNEELING_WOODCHOPPER = 15;
    public static final int MEDICINE_BALL_WOOD_CHOPS = 16;
    public static final int POWER_SQUAT_CHOPS = 17;
    public static final int WEIGHTED_POWER_SQUAT_CHOPS = 18;
    public static final int STANDING_ROTATIONAL_CHOP = 19;
    public static final int STANDING_SPLIT_ROTATIONAL_CHOP = 20;
    public static final int STANDING_SPLIT_ROTATIONAL_REVERSE_CHOP = 21;
    public static final int STANDING_STABILITY_REVERSE_CHOP = 22;
    public static final int INVALID = Fit.UINT16_INVALID;

    private static final Map<Integer, String> stringMap;

    static {
        stringMap = new HashMap<Integer, String>();
        stringMap.put(CABLE_PULL_THROUGH, "CABLE_PULL_THROUGH");
        stringMap.put(CABLE_ROTATIONAL_LIFT, "CABLE_ROTATIONAL_LIFT");
        stringMap.put(CABLE_WOODCHOP, "CABLE_WOODCHOP");
        stringMap.put(CROSS_CHOP_TO_KNEE, "CROSS_CHOP_TO_KNEE");
        stringMap.put(WEIGHTED_CROSS_CHOP_TO_KNEE, "WEIGHTED_CROSS_CHOP_TO_KNEE");
        stringMap.put(DUMBBELL_CHOP, "DUMBBELL_CHOP");
        stringMap.put(HALF_KNEELING_ROTATION, "HALF_KNEELING_ROTATION");
        stringMap.put(WEIGHTED_HALF_KNEELING_ROTATION, "WEIGHTED_HALF_KNEELING_ROTATION");
        stringMap.put(HALF_KNEELING_ROTATIONAL_CHOP, "HALF_KNEELING_ROTATIONAL_CHOP");
        stringMap.put(HALF_KNEELING_ROTATIONAL_REVERSE_CHOP, "HALF_KNEELING_ROTATIONAL_REVERSE_CHOP");
        stringMap.put(HALF_KNEELING_STABILITY_CHOP, "HALF_KNEELING_STABILITY_CHOP");
        stringMap.put(HALF_KNEELING_STABILITY_REVERSE_CHOP, "HALF_KNEELING_STABILITY_REVERSE_CHOP");
        stringMap.put(KNEELING_ROTATIONAL_CHOP, "KNEELING_ROTATIONAL_CHOP");
        stringMap.put(KNEELING_ROTATIONAL_REVERSE_CHOP, "KNEELING_ROTATIONAL_REVERSE_CHOP");
        stringMap.put(KNEELING_STABILITY_CHOP, "KNEELING_STABILITY_CHOP");
        stringMap.put(KNEELING_WOODCHOPPER, "KNEELING_WOODCHOPPER");
        stringMap.put(MEDICINE_BALL_WOOD_CHOPS, "MEDICINE_BALL_WOOD_CHOPS");
        stringMap.put(POWER_SQUAT_CHOPS, "POWER_SQUAT_CHOPS");
        stringMap.put(WEIGHTED_POWER_SQUAT_CHOPS, "WEIGHTED_POWER_SQUAT_CHOPS");
        stringMap.put(STANDING_ROTATIONAL_CHOP, "STANDING_ROTATIONAL_CHOP");
        stringMap.put(STANDING_SPLIT_ROTATIONAL_CHOP, "STANDING_SPLIT_ROTATIONAL_CHOP");
        stringMap.put(STANDING_SPLIT_ROTATIONAL_REVERSE_CHOP, "STANDING_SPLIT_ROTATIONAL_REVERSE_CHOP");
        stringMap.put(STANDING_STABILITY_REVERSE_CHOP, "STANDING_STABILITY_REVERSE_CHOP");
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
