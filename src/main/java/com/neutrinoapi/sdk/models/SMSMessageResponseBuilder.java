/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class SMSMessageResponseBuilder {
    //the instance to build
    private SMSMessageResponse sMSMessageResponse;

    /**
     * Default constructor to initialize the instance
     */
    public SMSMessageResponseBuilder() {
        sMSMessageResponse = new SMSMessageResponse();
    }

    /**
     * True if this a valid phone number
     */
    public SMSMessageResponseBuilder numberValid(boolean numberValid) {
        sMSMessageResponse.setNumberValid(numberValid);
        return this;
    }

    /**
     * True if the SMS has been sent
     */
    public SMSMessageResponseBuilder sent(boolean sent) {
        sMSMessageResponse.setSent(sent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SMSMessageResponse build() {
        return sMSMessageResponse;
    }
}