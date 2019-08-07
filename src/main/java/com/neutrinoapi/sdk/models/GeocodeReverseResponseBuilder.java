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
     * The components which make up the address such as road, city, state, etc
     */
    public GeocodeReverseResponseBuilder addressComponents(LinkedHashMap<String, String> addressComponents) {
        geocodeReverseResponse.setAddressComponents(addressComponents);
        return this;
    }

    /**
     * The ISO 3-letter country code of the location
     */
    public GeocodeReverseResponseBuilder countryCode3(String countryCode3) {
        geocodeReverseResponse.setCountryCode3(countryCode3);
        return this;
    }

    /**
     * ISO 4217 currency code associated with the country
     */
    public GeocodeReverseResponseBuilder currencyCode(String currencyCode) {
        geocodeReverseResponse.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * The detected location type ordered roughly from most to least precise, possible values are: <ul> <li>address - indicates a precise street address</li> <li>street - accurate to the street level but may not point to the exact location of the house/building number</li> <li>city - accurate to the city level, this includes villages, towns, suburbs, etc</li> <li>postal-code - indicates a postal code area (no house or street information present)</li> <li>railway - location is part of a rail network such as a station or railway track</li> <li>natural - indicates a natural feature, for example a mountain peak or a waterway</li> <li>island - location is an island or archipelago</li> <li>administrative - indicates an administrative boundary such as a country, state or province</li> </ul>
     */
    public GeocodeReverseResponseBuilder locationType(String locationType) {
        geocodeReverseResponse.setLocationType(locationType);
        return this;
    }

    /**
     * Array of strings containing any location tags associated with the address. Tags are additional pieces of metadata about a specific location, there are thousands of different tags. Some examples of tags: shop, office, cafe, bank, pub
     */
    public GeocodeReverseResponseBuilder locationTags(List<String> locationTags) {
        geocodeReverseResponse.setLocationTags(locationTags);
        return this;
    }

    /**
     * The location latitude
     */
    public GeocodeReverseResponseBuilder latitude(int latitude) {
        geocodeReverseResponse.setLatitude(latitude);
        return this;
    }

    /**
     * The location longitude
     */
    public GeocodeReverseResponseBuilder longitude(int longitude) {
        geocodeReverseResponse.setLongitude(longitude);
        return this;
    }

    /**
     * Map containing timezone details for the location: <ul> <li>id - the time zone ID as per the IANA time zone database (tzdata)</li> <li>name - the time zone name</li> <li>abbr - the time zone abbreviation</li> <li>date - the current date within the time zone (ISO format)</li> <li>time - the current time within the time zone (ISO format)</li> </ul>
     */
    public GeocodeReverseResponseBuilder timezone(LinkedHashMap<String, String> timezone) {
        geocodeReverseResponse.setTimezone(timezone);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GeocodeReverseResponse build() {
        return geocodeReverseResponse;
    }
}