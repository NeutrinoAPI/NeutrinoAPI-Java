/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;

public class HLRLookupResponseBuilder {
    //the instance to build
    private HLRLookupResponse hLRLookupResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HLRLookupResponseBuilder() {
        hLRLookupResponse = new HLRLookupResponse();
    }

    /**
     * Number location ISO 2-letter country code
     */
    public HLRLookupResponseBuilder countryCode(String countryCode) {
        hLRLookupResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * The HLR lookup status. See API docs for specific status details
     */
    public HLRLookupResponseBuilder hlrStatus(String hlrStatus) {
        hLRLookupResponse.setHlrStatus(hlrStatus);
        return this;
    }

    /**
     * Was the HLR lookup successful. If true then this is a working and registered cell-phone or mobile device (SMS and phone calls will be delivered)
     */
    public HLRLookupResponseBuilder hlrValid(boolean hlrValid) {
        hLRLookupResponse.setHlrValid(hlrValid);
        return this;
    }

    /**
     * The mobile IMSI number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder imsi(String imsi) {
        hLRLookupResponse.setImsi(imsi);
        return this;
    }

    /**
     * Numbers international calling code
     */
    public HLRLookupResponseBuilder internationalCallingCode(String internationalCallingCode) {
        hLRLookupResponse.setInternationalCallingCode(internationalCallingCode);
        return this;
    }

    /**
     * Number represented in international format
     */
    public HLRLookupResponseBuilder internationalNumber(String internationalNumber) {
        hLRLookupResponse.setInternationalNumber(internationalNumber);
        return this;
    }

    /**
     * Is this a mobile number
     */
    public HLRLookupResponseBuilder isMobile(boolean isMobile) {
        hLRLookupResponse.setIsMobile(isMobile);
        return this;
    }

    /**
     * Has this number been ported to another network
     */
    public HLRLookupResponseBuilder isPorted(boolean isPorted) {
        hLRLookupResponse.setIsPorted(isPorted);
        return this;
    }

    /**
     * Number represented in local format
     */
    public HLRLookupResponseBuilder localNumber(String localNumber) {
        hLRLookupResponse.setLocalNumber(localNumber);
        return this;
    }

    /**
     * Number location (could be a city, region or country)
     */
    public HLRLookupResponseBuilder location(String location) {
        hLRLookupResponse.setLocation(location);
        return this;
    }

    /**
     * The mobile MCC number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder mcc(String mcc) {
        hLRLookupResponse.setMcc(mcc);
        return this;
    }

    /**
     * The mobile MNC number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder mnc(String mnc) {
        hLRLookupResponse.setMnc(mnc);
        return this;
    }

    /**
     * The mobile MSIN number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder msin(String msin) {
        hLRLookupResponse.setMsin(msin);
        return this;
    }

    /**
     * The number type, possible values are: mobile, fixed-line, premium-rate, toll-free, voip, unknown
     */
    public HLRLookupResponseBuilder numberType(String numberType) {
        hLRLookupResponse.setNumberType(numberType);
        return this;
    }

    /**
     * Is this a valid phone number (mobile or otherwise)
     */
    public HLRLookupResponseBuilder numberValid(boolean numberValid) {
        hLRLookupResponse.setNumberValid(numberValid);
        return this;
    }

    /**
     * The origin mobile carrier name (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder originNetwork(String originNetwork) {
        hLRLookupResponse.setOriginNetwork(originNetwork);
        return this;
    }

    /**
     * If the number has been ported, the ported to mobile carrier name (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder portedNetwork(String portedNetwork) {
        hLRLookupResponse.setPortedNetwork(portedNetwork);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HLRLookupResponse build() {
        return hLRLookupResponse;
    }
}