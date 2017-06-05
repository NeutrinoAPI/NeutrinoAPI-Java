/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class GeocodeAddressResponseBuilder {
    //the instance to build
    private GeocodeAddressResponse geocodeAddressResponse;

    /**
     * Default constructor to initialize the instance
     */
    public GeocodeAddressResponseBuilder() {
        geocodeAddressResponse = new GeocodeAddressResponse();
    }

    /**
     * The number of possible matching locations found
     */
    public GeocodeAddressResponseBuilder found(int found) {
        geocodeAddressResponse.setFound(found);
        return this;
    }

    /**
     * Array of matching location objects
     */
    public GeocodeAddressResponseBuilder locations(List<Location> locations) {
        geocodeAddressResponse.setLocations(locations);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GeocodeAddressResponse build() {
        return geocodeAddressResponse;
    }
}