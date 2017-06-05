/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class HTMLExtractResponseBuilder {
    //the instance to build
    private HTMLExtractResponse hTMLExtractResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HTMLExtractResponseBuilder() {
        hTMLExtractResponse = new HTMLExtractResponse();
    }

    /**
     * The total number of values extracted
     */
    public HTMLExtractResponseBuilder total(int total) {
        hTMLExtractResponse.setTotal(total);
        return this;
    }

    /**
     * Array of extracted values
     */
    public HTMLExtractResponseBuilder values(List<String> values) {
        hTMLExtractResponse.setValues(values);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HTMLExtractResponse build() {
        return hTMLExtractResponse;
    }
}