/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

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
     * The country of the location
     */
    public GeocodeReverseResponseBuilder country(String country) {
        geocodeReverseResponse.setCountry(country);
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
     * The ISO 2-letter country code of the location
     */
    public GeocodeReverseResponseBuilder countryCode(String countryCode) {
        geocodeReverseResponse.setCountryCode(countryCode);
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
     * The state of the location
     */
    public GeocodeReverseResponseBuilder state(String state) {
        geocodeReverseResponse.setState(state);
        return this;
    }

    /**
     * The components which make up the address such as road, city, state etc. May also include additional metadata about the address
     */
    public GeocodeReverseResponseBuilder addressComponents(LinkedHashMap<String, String> addressComponents) {
        geocodeReverseResponse.setAddressComponents(addressComponents);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GeocodeReverseResponse build() {
        return geocodeReverseResponse;
    }
}