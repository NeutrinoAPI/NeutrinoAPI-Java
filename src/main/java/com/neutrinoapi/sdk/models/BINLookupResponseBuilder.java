/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

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
     * The full country name of the issuer
     */
    public BINLookupResponseBuilder country(String country) {
        bINLookupResponse.setCountry(country);
        return this;
    }

    /**
     * The city of the customers IP (if detectable)
     */
    public BINLookupResponseBuilder ipCity(String ipCity) {
        bINLookupResponse.setIpCity(ipCity);
        return this;
    }

    /**
     * True if the customers IP country matches the BIN country
     */
    public BINLookupResponseBuilder ipMatchesBin(boolean ipMatchesBin) {
        bINLookupResponse.setIpMatchesBin(ipMatchesBin);
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
     * The card category. There are many different card categories the most common card categories are: CLASSIC, BUSINESS, CORPORATE, PLATINUM, PREPAID
     */
    public BINLookupResponseBuilder cardCategory(String cardCategory) {
        bINLookupResponse.setCardCategory(cardCategory);
        return this;
    }

    /**
     * The ISO 2-letter country code of the customers IP
     */
    public BINLookupResponseBuilder ipCountryCode(String ipCountryCode) {
        bINLookupResponse.setIpCountryCode(ipCountryCode);
        return this;
    }

    /**
     * The country of the customers IP
     */
    public BINLookupResponseBuilder ipCountry(String ipCountry) {
        bINLookupResponse.setIpCountry(ipCountry);
        return this;
    }

    /**
     * The card issuer
     */
    public BINLookupResponseBuilder issuer(String issuer) {
        bINLookupResponse.setIssuer(issuer);
        return this;
    }

    /**
     * True if the customers IP is listed on one of our blocklists, see the <a href="http://www.neutrinoapi.com/api/ip-blocklist/">IP Blocklist API</a>
     */
    public BINLookupResponseBuilder ipBlocklisted(boolean ipBlocklisted) {
        bINLookupResponse.setIpBlocklisted(ipBlocklisted);
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
     * An array of strings indicating which blocklists this IP is listed on
     */
    public BINLookupResponseBuilder ipBlocklists(List<String> ipBlocklists) {
        bINLookupResponse.setIpBlocklists(ipBlocklists);
        return this;
    }

    /**
     * The card issuers website
     */
    public BINLookupResponseBuilder issuerWebsite(String issuerWebsite) {
        bINLookupResponse.setIssuerWebsite(issuerWebsite);
        return this;
    }

    /**
     * The ISO 2-letter country code of the issuer
     */
    public BINLookupResponseBuilder countryCode(String countryCode) {
        bINLookupResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * The region of the customers IP (if detectable)
     */
    public BINLookupResponseBuilder ipRegion(String ipRegion) {
        bINLookupResponse.setIpRegion(ipRegion);
        return this;
    }

    /**
     * The card brand (e.g. Visa or Mastercard)
     */
    public BINLookupResponseBuilder cardBrand(String cardBrand) {
        bINLookupResponse.setCardBrand(cardBrand);
        return this;
    }

    /**
     * The card issuers phone number
     */
    public BINLookupResponseBuilder issuerPhone(String issuerPhone) {
        bINLookupResponse.setIssuerPhone(issuerPhone);
        return this;
    }

    /**
     * The ISO 3-letter country code of the issuer
     */
    public BINLookupResponseBuilder countryCode3(String countryCode3) {
        bINLookupResponse.setCountryCode3(countryCode3);
        return this;
    }

    /**
     * ISO 4217 currency code associated with the country of the issuer
     */
    public BINLookupResponseBuilder currencyCode(String currencyCode) {
        bINLookupResponse.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * The ISO 3-letter country code of the customers IP
     */
    public BINLookupResponseBuilder ipCountryCode3(String ipCountryCode3) {
        bINLookupResponse.setIpCountryCode3(ipCountryCode3);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BINLookupResponse build() {
        return bINLookupResponse;
    }
}