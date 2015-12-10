/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;

public class ConvertResponseBuilder {
    //the instance to build
    private ConvertResponse convertResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ConvertResponseBuilder() {
        convertResponse = new ConvertResponse();
    }

    /**
     * The type of the value being converted from
     */
    public ConvertResponseBuilder fromType(String fromType) {
        convertResponse.setFromType(fromType);
        return this;
    }

    /**
     * The value being converted from
     */
    public ConvertResponseBuilder fromValue(String fromValue) {
        convertResponse.setFromValue(fromValue);
        return this;
    }

    /**
     * The result of the conversion
     */
    public ConvertResponseBuilder result(String result) {
        convertResponse.setResult(result);
        return this;
    }

    /**
     * The type being converted to
     */
    public ConvertResponseBuilder toType(String toType) {
        convertResponse.setToType(toType);
        return this;
    }

    /**
     * Was the coversion successful and produced a valid result
     */
    public ConvertResponseBuilder valid(boolean valid) {
        convertResponse.setValid(valid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ConvertResponse build() {
        return convertResponse;
    }
}