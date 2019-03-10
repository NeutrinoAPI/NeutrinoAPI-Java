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
     * The detected provider type, possible values are:<br/><ul><li>isp - IP belongs to an internet service provider. This includes both mobile, home and business internet providers</li><li>hosting - IP belongs to a hosting company. This includes website hosting, cloud computing platforms and colocation facilities</li><li>vpn - IP belongs to a VPN provider</li><li>proxy - IP belongs to a proxy service. This includes HTTP/SOCKS proxies and browser based proxies</li><li>university - IP belongs to a university/college/campus</li><li>government - IP belongs to a government department. This includes military facilities</li><li>commercial - IP belongs to a commercial entity such as a corporate headquarters or company office</li><li>unknown - could not identify the provider type</li></ul>
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
     * A description of the provider (usually extracted from the providers website)
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
     * True if this IP belongs to an internet service provider. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    public IPProbeResponseBuilder isIsp(boolean isIsp) {
        iPProbeResponse.setIsIsp(isIsp);
        return this;
    }

    /**
     * ISO 3-letter country code
     */
    public IPProbeResponseBuilder countryCode3(String countryCode3) {
        iPProbeResponse.setCountryCode3(countryCode3);
        return this;
    }

    /**
     * ISO 4217 currency code associated with the country
     */
    public IPProbeResponseBuilder currencyCode(String currencyCode) {
        iPProbeResponse.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * True if this IP ia a VPN
     */
    public IPProbeResponseBuilder isVpn(boolean isVpn) {
        iPProbeResponse.setIsVpn(isVpn);
        return this;
    }

    /**
     * True if this IP ia a proxy
     */
    public IPProbeResponseBuilder isProxy(boolean isProxy) {
        iPProbeResponse.setIsProxy(isProxy);
        return this;
    }

    /**
     * The autonomous system (AS) number
     */
    public IPProbeResponseBuilder asn(String asn) {
        iPProbeResponse.setAsn(asn);
        return this;
    }

    /**
     * The autonomous system (AS) CIDR range
     */
    public IPProbeResponseBuilder asCidr(String asCidr) {
        iPProbeResponse.setAsCidr(asCidr);
        return this;
    }

    /**
     * The autonomous system (AS) ISO 2-letter country code
     */
    public IPProbeResponseBuilder asCountryCode(String asCountryCode) {
        iPProbeResponse.setAsCountryCode(asCountryCode);
        return this;
    }

    /**
     * The autonomous system (AS) ISO 3-letter country code
     */
    public IPProbeResponseBuilder asCountryCode3(String asCountryCode3) {
        iPProbeResponse.setAsCountryCode3(asCountryCode3);
        return this;
    }

    /**
     * Array of all the domains associated with the autonomous system (AS)
     */
    public IPProbeResponseBuilder asDomains(List<String> asDomains) {
        iPProbeResponse.setAsDomains(asDomains);
        return this;
    }

    /**
     * The autonomous system (AS) description / company name
     */
    public IPProbeResponseBuilder asDescription(String asDescription) {
        iPProbeResponse.setAsDescription(asDescription);
        return this;
    }

    /**
     * The age of the autonomous system (AS) in number of years since registration
     */
    public IPProbeResponseBuilder asAge(int asAge) {
        iPProbeResponse.setAsAge(asAge);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public IPProbeResponse build() {
        return iPProbeResponse;
    }
}