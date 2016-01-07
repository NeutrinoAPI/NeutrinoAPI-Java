/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;

public class PhoneVerifyResponseBuilder {
    //the instance to build
    private PhoneVerifyResponse phoneVerifyResponse;

    /**
     * Default constructor to initialize the instance
     */
    public PhoneVerifyResponseBuilder() {
        phoneVerifyResponse = new PhoneVerifyResponse();
    }

    /**
     * True if the call is being made now
     */
    public PhoneVerifyResponseBuilder calling(boolean calling) {
        phoneVerifyResponse.setCalling(calling);
        return this;
    }

    /**
     * Is this a valid phone number
     */
    public PhoneVerifyResponseBuilder numberValid(boolean numberValid) {
        phoneVerifyResponse.setNumberValid(numberValid);
        return this;
    }

    /**
     * The security code generated, you can save this code to perform your own verification or you can use the Verify Security Code API
     */
    public PhoneVerifyResponseBuilder securityCode(String securityCode) {
        phoneVerifyResponse.setSecurityCode(securityCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PhoneVerifyResponse build() {
        return phoneVerifyResponse;
    }
}