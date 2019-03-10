/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class LocationBuilder {
    //the instance to build
    private Location location;

    /**
     * Default constructor to initialize the instance
     */
    public LocationBuilder() {
        location = new Location();
    }

    /**
     * The country of the location
     */
    public LocationBuilder country(String country) {
        location.setCountry(country);
        return this;
    }

    /**
     * The fully formatted address
     */
    public LocationBuilder address(String address) {
        location.setAddress(address);
        return this;
    }

    /**
     * The city of the location
     */
    public LocationBuilder city(String city) {
        location.setCity(city);
        return this;
    }

    /**
     * The ISO 2-letter country code of the location
     */
    public LocationBuilder countryCode(String countryCode) {
        location.setCountryCode(countryCode);
        return this;
    }

    /**
     * The ISO 3-letter country code of the location
     */
    public LocationBuilder countryCode3(String countryCode3) {
        location.setCountryCode3(countryCode3);
        return this;
    }

    /**
     * The location latitude
     */
    public LocationBuilder latitude(double latitude) {
        location.setLatitude(latitude);
        return this;
    }

    /**
     * The postal code for the location
     */
    public LocationBuilder postalCode(String postalCode) {
        location.setPostalCode(postalCode);
        return this;
    }

    /**
     * The location longitude
     */
    public LocationBuilder longitude(double longitude) {
        location.setLongitude(longitude);
        return this;
    }

    /**
     * The state of the location (if applicable)
     */
    public LocationBuilder state(String state) {
        location.setState(state);
        return this;
    }

    /**
     * The components which make up the address such as road, city, state etc. May also include additional metadata about the address
     */
    public LocationBuilder addressComponents(LinkedHashMap<String, String> addressComponents) {
        location.setAddressComponents(addressComponents);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Location build() {
        return location;
    }
}