/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

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
     * True if the coversion was successful and produced a valid result
     */
    public ConvertResponseBuilder valid(boolean valid) {
        convertResponse.setValid(valid);
        return this;
    }

    /**
     * The result of the conversion in string format
     */
    public ConvertResponseBuilder result(String result) {
        convertResponse.setResult(result);
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
     * The type being converted to
     */
    public ConvertResponseBuilder toType(String toType) {
        convertResponse.setToType(toType);
        return this;
    }

    /**
     * The type of the value being converted from
     */
    public ConvertResponseBuilder fromType(String fromType) {
        convertResponse.setFromType(fromType);
        return this;
    }

    /**
     * The result of the conversion as a floating-point number
     */
    public ConvertResponseBuilder resultFloat(int resultFloat) {
        convertResponse.setResultFloat(resultFloat);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ConvertResponse build() {
        return convertResponse;
    }
}