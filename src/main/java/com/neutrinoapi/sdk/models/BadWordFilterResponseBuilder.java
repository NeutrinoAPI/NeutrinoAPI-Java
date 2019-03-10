/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class BadWordFilterResponseBuilder {
    //the instance to build
    private BadWordFilterResponse badWordFilterResponse;

    /**
     * Default constructor to initialize the instance
     */
    public BadWordFilterResponseBuilder() {
        badWordFilterResponse = new BadWordFilterResponse();
    }

    /**
     * An array of the bad words found
     */
    public BadWordFilterResponseBuilder badWordsList(List<String> badWordsList) {
        badWordFilterResponse.setBadWordsList(badWordsList);
        return this;
    }

    /**
     * Total number of bad words detected
     */
    public BadWordFilterResponseBuilder badWordsTotal(int badWordsTotal) {
        badWordFilterResponse.setBadWordsTotal(badWordsTotal);
        return this;
    }

    /**
     * The censored content (only set if censor-character has been set)
     */
    public BadWordFilterResponseBuilder censoredContent(String censoredContent) {
        badWordFilterResponse.setCensoredContent(censoredContent);
        return this;
    }

    /**
     * Does the text contain bad words
     */
    public BadWordFilterResponseBuilder isBad(boolean isBad) {
        badWordFilterResponse.setIsBad(isBad);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BadWordFilterResponse build() {
        return badWordFilterResponse;
    }
}