/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

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
     * True if this a valid phone number
     */
    public PhoneVerifyResponseBuilder numberValid(boolean numberValid) {
        phoneVerifyResponse.setNumberValid(numberValid);
        return this;
    }

    /**
     * True if the call is being made now
     */
    public PhoneVerifyResponseBuilder calling(boolean calling) {
        phoneVerifyResponse.setCalling(calling);
        return this;
    }

    /**
     * The security code generated, you can save this code to perform your own verification or you can use the <a href='https://www.neutrinoapi.com/api/verify-security-code/'>Verify Security Code API</a>
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