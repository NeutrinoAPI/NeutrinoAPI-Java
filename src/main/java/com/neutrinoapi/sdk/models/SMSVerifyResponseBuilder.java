/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class SMSVerifyResponseBuilder {
    //the instance to build
    private SMSVerifyResponse sMSVerifyResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SMSVerifyResponseBuilder() {
        sMSVerifyResponse = new SMSVerifyResponse();
    }

    /**
     * Is this a valid phone number
     */
    public SMSVerifyResponseBuilder numberValid(boolean numberValid) {
        sMSVerifyResponse.setNumberValid(numberValid);
        return this;
    }

    /**
     * The security code generated, you can save this code to perform your own verification or you can use the Verify Security Code API
     */
    public SMSVerifyResponseBuilder securityCode(String securityCode) {
        sMSVerifyResponse.setSecurityCode(securityCode);
        return this;
    }

    /**
     * True if the SMS has been sent
     */
    public SMSVerifyResponseBuilder sent(boolean sent) {
        sMSVerifyResponse.setSent(sent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SMSVerifyResponse build() {
        return sMSVerifyResponse;
    }
}