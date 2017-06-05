/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class IPInfoResponseBuilder {
    //the instance to build
    private IPInfoResponse iPInfoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public IPInfoResponseBuilder() {
        iPInfoResponse = new IPInfoResponse();
    }

    /**
     * Is this a valid IP address
     */
    public IPInfoResponseBuilder valid(boolean valid) {
        iPInfoResponse.setValid(valid);
        return this;
    }

    /**
     * Full country name
     */
    public IPInfoResponseBuilder country(String country) {
        iPInfoResponse.setCountry(country);
        return this;
    }

    /**
     * The IPs hostname (only set if reverse-lookup has been used)
     */
    public IPInfoResponseBuilder hostname(String hostname) {
        iPInfoResponse.setHostname(hostname);
        return this;
    }

    /**
     * Full city name (if detectable)
     */
    public IPInfoResponseBuilder city(String city) {
        iPInfoResponse.setCity(city);
        return this;
    }

    /**
     * ISO 2-letter country code
     */
    public IPInfoResponseBuilder countryCode(String countryCode) {
        iPInfoResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * Location latitude
     */
    public IPInfoResponseBuilder latitude(double latitude) {
        iPInfoResponse.setLatitude(latitude);
        return this;
    }

    /**
     * Full region name (if detectable)
     */
    public IPInfoResponseBuilder region(String region) {
        iPInfoResponse.setRegion(region);
        return this;
    }

    /**
     * Location longitude
     */
    public IPInfoResponseBuilder longitude(double longitude) {
        iPInfoResponse.setLongitude(longitude);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public IPInfoResponse build() {
        return iPInfoResponse;
    }
}