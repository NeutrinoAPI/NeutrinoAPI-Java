/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Environments {
    MULTICLOUD, //Multicloud endpoint
    AWS, //AWS endpoint
    GCP, //GCP endpoint
    MSA; //MS Azure endpoint

    private static TreeMap<String, Environments> valueMap = new TreeMap<String, Environments>();
    private String value;

    static {
        MULTICLOUD.value = "multicloud";
        AWS.value = "aws";
        GCP.value = "gcp";
        MSA.value = "msa";

        valueMap.put("multicloud", MULTICLOUD);
        valueMap.put("aws", AWS);
        valueMap.put("gcp", GCP);
        valueMap.put("msa", MSA);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Environments fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Environments values to list of string values
     * @param toConvert The list of Environments values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Environments> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Environments enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 