/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;

public class GeocodeReverseResponseBuilder {
    //the instance to build
    private GeocodeReverseResponse geocodeReverseResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GeocodeReverseResponseBuilder() {
        geocodeReverseResponse = new GeocodeReverseResponse();
    }

    /**
     * The fully formatted address
     */
    public GeocodeReverseResponseBuilder address(String address) {
        geocodeReverseResponse.setAddress(address);
        return this;
    }

    /**
     * The city of the location
     */
    public GeocodeReverseResponseBuilder city(String city) {
        geocodeReverseResponse.setCity(city);
        return this;
    }

    /**
     * The country of the location
     */
    public GeocodeReverseResponseBuilder country(String country) {
        geocodeReverseResponse.setCountry(country);
        return this;
    }

    /**
     * The ISO 2-letter country code of the location
     */
    public GeocodeReverseResponseBuilder countryCode(String countryCode) {
        geocodeReverseResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * True if these coordinates map to a real location
     */
    public GeocodeReverseResponseBuilder found(boolean found) {
        geocodeReverseResponse.setFound(found);
        return this;
    }

    /**
     * The postal code for the location
     */
    public GeocodeReverseResponseBuilder postalCode(String postalCode) {
        geocodeReverseResponse.setPostalCode(postalCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GeocodeReverseResponse build() {
        return geocodeReverseResponse;
    }
}