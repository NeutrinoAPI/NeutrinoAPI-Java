/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

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
     * Is this a valid phone number
     */
    public PhoneValidateResponseBuilder valid(boolean valid) {
        phoneValidateResponse.setValid(valid);
        return this;
    }

    /**
     * The international calling code
     */
    public PhoneValidateResponseBuilder internationalCallingCode(int internationalCallingCode) {
        phoneValidateResponse.setInternationalCallingCode(internationalCallingCode);
        return this;
    }

    /**
     * The phone number country as an ISO 2-letter country code
     */
    public PhoneValidateResponseBuilder countryCode(String countryCode) {
        phoneValidateResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * The phone number location. Could be a city, region or country depending on the type of number
     */
    public PhoneValidateResponseBuilder location(String location) {
        phoneValidateResponse.setLocation(location);
        return this;
    }

    /**
     * True if this is a mobile number (only true with 100% certainty, if the number type is unknown this value will be false)
     */
    public PhoneValidateResponseBuilder isMobile(boolean isMobile) {
        phoneValidateResponse.setIsMobile(isMobile);
        return this;
    }

    /**
     * The predicted number type.<br/>Note: type detection is not possible in some countries which have no predictable prefix pattern (you can use the HLR Lookup API in these cases)<br/> Possible values are:<br/><ul><li>mobile</li><li>fixed-line</li><li>premium-rate</li><li>toll-free</li><li>voip</li><li>unknown (use HLR lookup instead)</li></ul>
     */
    public PhoneValidateResponseBuilder type(String type) {
        phoneValidateResponse.setType(type);
        return this;
    }

    /**
     * The number represented in full international format (E.164)
     */
    public PhoneValidateResponseBuilder internationalNumber(String internationalNumber) {
        phoneValidateResponse.setInternationalNumber(internationalNumber);
        return this;
    }

    /**
     * The number represented in local dialing format
     */
    public PhoneValidateResponseBuilder localNumber(String localNumber) {
        phoneValidateResponse.setLocalNumber(localNumber);
        return this;
    }

    /**
     * The phone number country
     */
    public PhoneValidateResponseBuilder country(String country) {
        phoneValidateResponse.setCountry(country);
        return this;
    }

    /**
     * The phone number country as an ISO 3-letter country code
     */
    public PhoneValidateResponseBuilder countryCode3(String countryCode3) {
        phoneValidateResponse.setCountryCode3(countryCode3);
        return this;
    }

    /**
     * ISO 4217 currency code associated with the country
     */
    public PhoneValidateResponseBuilder currencyCode(String currencyCode) {
        phoneValidateResponse.setCurrencyCode(currencyCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PhoneValidateResponse build() {
        return phoneValidateResponse;
    }
}