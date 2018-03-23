/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class IPProbeResponseBuilder {
    //the instance to build
    private IPProbeResponse iPProbeResponse;

    /**
     * Default constructor to initialize the instance
     */
    public IPProbeResponseBuilder() {
        iPProbeResponse = new IPProbeResponse();
    }

    /**
     * Is this a valid IPv4 or IPv6 address
     */
    public IPProbeResponseBuilder valid(boolean valid) {
        iPProbeResponse.setValid(valid);
        return this;
    }

    /**
     * Full country name
     */
    public IPProbeResponseBuilder country(String country) {
        iPProbeResponse.setCountry(country);
        return this;
    }

    /**
     * The detected provider type. See online API docs for specific provider type details
     */
    public IPProbeResponseBuilder providerType(String providerType) {
        iPProbeResponse.setProviderType(providerType);
        return this;
    }

    /**
     * ISO 2-letter country code
     */
    public IPProbeResponseBuilder countryCode(String countryCode) {
        iPProbeResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * The IPs hostname (PTR)
     */
    public IPProbeResponseBuilder hostname(String hostname) {
        iPProbeResponse.setHostname(hostname);
        return this;
    }

    /**
     * The domain name of the provider
     */
    public IPProbeResponseBuilder providerDomain(String providerDomain) {
        iPProbeResponse.setProviderDomain(providerDomain);
        return this;
    }

    /**
     * Full city name (if detectable)
     */
    public IPProbeResponseBuilder city(String city) {
        iPProbeResponse.setCity(city);
        return this;
    }

    /**
     * The website URL for the provider
     */
    public IPProbeResponseBuilder providerWebsite(String providerWebsite) {
        iPProbeResponse.setProviderWebsite(providerWebsite);
        return this;
    }

    /**
     * The IP address
     */
    public IPProbeResponseBuilder ip(String ip) {
        iPProbeResponse.setIp(ip);
        return this;
    }

    /**
     * Full region name (if detectable)
     */
    public IPProbeResponseBuilder region(String region) {
        iPProbeResponse.setRegion(region);
        return this;
    }

    /**
     * A description of the provider, usually extracted from the providers website or WHOIS record
     */
    public IPProbeResponseBuilder providerDescription(String providerDescription) {
        iPProbeResponse.setProviderDescription(providerDescription);
        return this;
    }

    /**
     * ISO 2-letter continent code
     */
    public IPProbeResponseBuilder continentCode(String continentCode) {
        iPProbeResponse.setContinentCode(continentCode);
        return this;
    }

    /**
     * True if this IP belongs to a hosting company. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    public IPProbeResponseBuilder isHosting(boolean isHosting) {
        iPProbeResponse.setIsHosting(isHosting);
        return this;
    }

    /**
     * True if this IP belongs to an ISP. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    public IPProbeResponseBuilder isIsp(boolean isIsp) {
        iPProbeResponse.setIsIsp(isIsp);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public IPProbeResponse build() {
        return iPProbeResponse;
    }
}