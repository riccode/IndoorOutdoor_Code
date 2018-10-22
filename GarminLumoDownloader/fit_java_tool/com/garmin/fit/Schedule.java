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


public enum Schedule {
    WORKOUT((short)0),
    COURSE((short)1),
    INVALID((short)255);

    protected short value;

    private Schedule(short value) {
        this.value = value;
    }

    public static Schedule getByValue(final Short value) {
        for (final Schedule type : Schedule.values()) {
            if (value == type.value)
                return type;
        }

        return Schedule.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @return The string representation of the value
     */
    public static String getStringFromValue( Schedule value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
