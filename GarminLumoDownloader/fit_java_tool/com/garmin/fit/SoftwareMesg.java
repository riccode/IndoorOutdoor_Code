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
import java.math.BigInteger;


public class SoftwareMesg extends Mesg {

    
    public static final int MessageIndexFieldNum = 254;
    
    public static final int VersionFieldNum = 3;
    
    public static final int PartNumberFieldNum = 5;
    

    protected static final  Mesg softwareMesg;
    static {
        // software
        softwareMesg = new Mesg("software", MesgNum.SOFTWARE);
        softwareMesg.addField(new Field("message_index", MessageIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        
        softwareMesg.addField(new Field("version", VersionFieldNum, 132, 100, 0, "", false, Profile.Type.UINT16));
        
        softwareMesg.addField(new Field("part_number", PartNumberFieldNum, 7, 1, 0, "", false, Profile.Type.STRING));
        
    }

    public SoftwareMesg() {
        super(Factory.createMesg(MesgNum.SOFTWARE));
    }

    public SoftwareMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get message_index field
     *
     * @return message_index
     */
    public Integer getMessageIndex() {
        return getFieldIntegerValue(254, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set message_index field
     *
     * @param messageIndex
     */
    public void setMessageIndex(Integer messageIndex) {
        setFieldValue(254, 0, messageIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get version field
     *
     * @return version
     */
    public Float getVersion() {
        return getFieldFloatValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set version field
     *
     * @param version
     */
    public void setVersion(Float version) {
        setFieldValue(3, 0, version, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get part_number field
     *
     * @return part_number
     */
    public String getPartNumber() {
        return getFieldStringValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set part_number field
     *
     * @param partNumber
     */
    public void setPartNumber(String partNumber) {
        setFieldValue(5, 0, partNumber, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
