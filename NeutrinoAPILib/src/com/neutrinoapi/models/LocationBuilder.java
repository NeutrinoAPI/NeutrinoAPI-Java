/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

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

    public LocationBuilder address(String address) {
        location.setAddress(address);
        return this;
    }

    public LocationBuilder city(String city) {
        location.setCity(city);
        return this;
    }

    public LocationBuilder country(String country) {
        location.setCountry(country);
        return this;
    }

    public LocationBuilder countryCode(String countryCode) {
        location.setCountryCode(countryCode);
        return this;
    }

    public LocationBuilder latitude(double latitude) {
        location.setLatitude(latitude);
        return this;
    }

    public LocationBuilder longitude(double longitude) {
        location.setLongitude(longitude);
        return this;
    }

    public LocationBuilder postalCode(String postalCode) {
        location.setPostalCode(postalCode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Location build() {
        return location;
    }
}