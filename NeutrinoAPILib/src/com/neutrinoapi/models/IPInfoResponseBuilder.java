/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

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
     * Full city name (if detectable)
     */
    public IPInfoResponseBuilder city(String city) {
        iPInfoResponse.setCity(city);
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
     * ISO 2-letter country code
     */
    public IPInfoResponseBuilder countryCode(String countryCode) {
        iPInfoResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * IP hostname (if reverse-lookup has been used)
     */
    public IPInfoResponseBuilder hostname(String hostname) {
        iPInfoResponse.setHostname(hostname);
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
     * Location longitude
     */
    public IPInfoResponseBuilder longitude(double longitude) {
        iPInfoResponse.setLongitude(longitude);
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
     * Is this a valid IP address
     */
    public IPInfoResponseBuilder valid(boolean valid) {
        iPInfoResponse.setValid(valid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public IPInfoResponse build() {
        return iPInfoResponse;
    }
}