/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

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
     * Is this a valid phone number
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