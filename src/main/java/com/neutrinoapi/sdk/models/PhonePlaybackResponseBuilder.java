/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class PhonePlaybackResponseBuilder {
    //the instance to build
    private PhonePlaybackResponse phonePlaybackResponse;

    /**
     * Default constructor to initialize the instance
     */
    public PhonePlaybackResponseBuilder() {
        phonePlaybackResponse = new PhonePlaybackResponse();
    }

    /**
     * True if the call is being made now
     */
    public PhonePlaybackResponseBuilder calling(boolean calling) {
        phonePlaybackResponse.setCalling(calling);
        return this;
    }

    /**
     * True if this a valid phone number
     */
    public PhonePlaybackResponseBuilder numberValid(boolean numberValid) {
        phonePlaybackResponse.setNumberValid(numberValid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PhonePlaybackResponse build() {
        return phonePlaybackResponse;
    }
}