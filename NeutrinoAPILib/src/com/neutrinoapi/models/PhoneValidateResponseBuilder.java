/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;

public class PhoneValidateResponseBuilder {
    //the instance to build
    private PhoneValidateResponse phoneValidateResponse;

    /**
     * Default constructor to initialize the instance
     */
    public PhoneValidateResponseBuilder() {
        phoneValidateResponse = new PhoneValidateResponse();
    }

    /**
     * Number location ISO 2-letter country code
     */
    public PhoneValidateResponseBuilder countryCode(String countryCode) {
        phoneValidateResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * Numbers international calling code
     */
    public PhoneValidateResponseBuilder internationalCallingCode(String internationalCallingCode) {
        phoneValidateResponse.setInternationalCallingCode(internationalCallingCode);
        return this;
    }

    /**
     * Number represented in international format
     */
    public PhoneValidateResponseBuilder internationalNumber(String internationalNumber) {
        phoneValidateResponse.setInternationalNumber(internationalNumber);
        return this;
    }

    /**
     * Is this a mobile number
     */
    public PhoneValidateResponseBuilder isMobile(boolean isMobile) {
        phoneValidateResponse.setIsMobile(isMobile);
        return this;
    }

    /**
     * Number represented in local format
     */
    public PhoneValidateResponseBuilder localNumber(String localNumber) {
        phoneValidateResponse.setLocalNumber(localNumber);
        return this;
    }

    /**
     * Number location (could be a city, region or country)
     */
    public PhoneValidateResponseBuilder location(String location) {
        phoneValidateResponse.setLocation(location);
        return this;
    }

    /**
     * The number type, possible values are: mobile, fixed-line, premium-rate, toll-free, voip, unknown
     */
    public PhoneValidateResponseBuilder type(String type) {
        phoneValidateResponse.setType(type);
        return this;
    }

    /**
     * Is this a valid phone number
     */
    public PhoneValidateResponseBuilder valid(boolean valid) {
        phoneValidateResponse.setValid(valid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PhoneValidateResponse build() {
        return phoneValidateResponse;
    }
}