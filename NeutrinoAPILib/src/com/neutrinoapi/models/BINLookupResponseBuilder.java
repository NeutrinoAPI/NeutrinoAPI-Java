/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;

public class BINLookupResponseBuilder {
    //the instance to build
    private BINLookupResponse bINLookupResponse;

    /**
     * Default constructor to initialize the instance
     */
    public BINLookupResponseBuilder() {
        bINLookupResponse = new BINLookupResponse();
    }

    /**
     * The card brand (e.g. Visa or Mastercard)
     */
    public BINLookupResponseBuilder cardBrand(String cardBrand) {
        bINLookupResponse.setCardBrand(cardBrand);
        return this;
    }

    /**
     * The card category (if known)
     */
    public BINLookupResponseBuilder cardCategory(String cardCategory) {
        bINLookupResponse.setCardCategory(cardCategory);
        return this;
    }

    /**
     * The card type, will always be one of: DEBIT, CREDIT, CHARGE CARD
     */
    public BINLookupResponseBuilder cardType(String cardType) {
        bINLookupResponse.setCardType(cardType);
        return this;
    }

    /**
     * Full country name of the issuer
     */
    public BINLookupResponseBuilder country(String country) {
        bINLookupResponse.setCountry(country);
        return this;
    }

    /**
     * ISO 2-letter country code of the issuer
     */
    public BINLookupResponseBuilder countryCode(String countryCode) {
        bINLookupResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * True if the customer IP is listed on one of our blocklists, see the IP Blocklist API for more details
     */
    public BINLookupResponseBuilder ipBlocklisted(boolean ipBlocklisted) {
        bINLookupResponse.setIpBlocklisted(ipBlocklisted);
        return this;
    }

    /**
     * An array of strings indicating which blocklists this IP is listed on
     */
    public BINLookupResponseBuilder ipBlocklists(List<String> ipBlocklists) {
        bINLookupResponse.setIpBlocklists(ipBlocklists);
        return this;
    }

    /**
     * The city name (if detectable) from the customer IP
     */
    public BINLookupResponseBuilder ipCity(String ipCity) {
        bINLookupResponse.setIpCity(ipCity);
        return this;
    }

    /**
     * The country detected from the customer IP
     */
    public BINLookupResponseBuilder ipCountry(String ipCountry) {
        bINLookupResponse.setIpCountry(ipCountry);
        return this;
    }

    /**
     * The ISO 2-letter country code detected from the customer IP
     */
    public BINLookupResponseBuilder ipCountryCode(String ipCountryCode) {
        bINLookupResponse.setIpCountryCode(ipCountryCode);
        return this;
    }

    /**
     * True if the customer IP address country matches the BIN country
     */
    public BINLookupResponseBuilder ipMatchesBin(boolean ipMatchesBin) {
        bINLookupResponse.setIpMatchesBin(ipMatchesBin);
        return this;
    }

    /**
     * The region name (if detectable) from the customer IP
     */
    public BINLookupResponseBuilder ipRegion(String ipRegion) {
        bINLookupResponse.setIpRegion(ipRegion);
        return this;
    }

    /**
     * The card issuer (if known)
     */
    public BINLookupResponseBuilder issuer(String issuer) {
        bINLookupResponse.setIssuer(issuer);
        return this;
    }

    /**
     * The card issuer phone number (if known)
     */
    public BINLookupResponseBuilder issuerPhone(String issuerPhone) {
        bINLookupResponse.setIssuerPhone(issuerPhone);
        return this;
    }

    /**
     * The card issuer website (if known)
     */
    public BINLookupResponseBuilder issuerWebsite(String issuerWebsite) {
        bINLookupResponse.setIssuerWebsite(issuerWebsite);
        return this;
    }

    /**
     * Is this a valid BIN or IIN number
     */
    public BINLookupResponseBuilder valid(boolean valid) {
        bINLookupResponse.setValid(valid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BINLookupResponse build() {
        return bINLookupResponse;
    }
}