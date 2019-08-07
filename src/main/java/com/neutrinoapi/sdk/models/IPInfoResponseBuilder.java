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
     * Is this a valid IPv4 or IPv6 address
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
     * The IPs full hostname (only set if reverse-lookup has been used)
     */
    public IPInfoResponseBuilder hostname(String hostname) {
        iPInfoResponse.setHostname(hostname);
        return this;
    }

    /**
     * Name of the city (if detectable)
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
    public IPInfoResponseBuilder latitude(int latitude) {
        iPInfoResponse.setLatitude(latitude);
        return this;
    }

    /**
     * Name of the region (if detectable)
     */
    public IPInfoResponseBuilder region(String region) {
        iPInfoResponse.setRegion(region);
        return this;
    }

    /**
     * Location longitude
     */
    public IPInfoResponseBuilder longitude(int longitude) {
        iPInfoResponse.setLongitude(longitude);
        return this;
    }

    /**
     * ISO 2-letter continent code
     */
    public IPInfoResponseBuilder continentCode(String continentCode) {
        iPInfoResponse.setContinentCode(continentCode);
        return this;
    }

    /**
     * The IP address
     */
    public IPInfoResponseBuilder ip(String ip) {
        iPInfoResponse.setIp(ip);
        return this;
    }

    /**
     * ISO 3-letter country code
     */
    public IPInfoResponseBuilder countryCode3(String countryCode3) {
        iPInfoResponse.setCountryCode3(countryCode3);
        return this;
    }

    /**
     * ISO 4217 currency code associated with the country
     */
    public IPInfoResponseBuilder currencyCode(String currencyCode) {
        iPInfoResponse.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * The IPs host domain (only set if reverse-lookup has been used)
     */
    public IPInfoResponseBuilder hostDomain(String hostDomain) {
        iPInfoResponse.setHostDomain(hostDomain);
        return this;
    }

    /**
     * Map containing timezone details for the location: <ul> <li>id - the time zone ID as per the IANA time zone database (tzdata)</li> <li>name - the time zone name</li> <li>abbr - the time zone abbreviation</li> <li>date - the current date within the time zone (ISO format)</li> <li>time - the current time within the time zone (ISO format)</li> </ul>
     */
    public IPInfoResponseBuilder timezone(LinkedHashMap<String, String> timezone) {
        iPInfoResponse.setTimezone(timezone);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public IPInfoResponse build() {
        return iPInfoResponse;
    }
}