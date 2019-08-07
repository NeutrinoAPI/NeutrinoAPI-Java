/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class HLRLookupResponseBuilder {
    //the instance to build
    private HLRLookupResponse hLRLookupResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HLRLookupResponseBuilder() {
        hLRLookupResponse = new HLRLookupResponse();
    }

    /**
     * True if this a valid phone number
     */
    public HLRLookupResponseBuilder numberValid(boolean numberValid) {
        hLRLookupResponse.setNumberValid(numberValid);
        return this;
    }

    /**
     * The numbers international calling code
     */
    public HLRLookupResponseBuilder internationalCallingCode(int internationalCallingCode) {
        hLRLookupResponse.setInternationalCallingCode(internationalCallingCode);
        return this;
    }

    /**
     * The mobile MNC number (Mobile Network Code)
     */
    public HLRLookupResponseBuilder mnc(String mnc) {
        hLRLookupResponse.setMnc(mnc);
        return this;
    }

    /**
     * The number type, possible values are: <ul> <li>mobile</li> <li>fixed-line</li> <li>premium-rate</li> <li>toll-free</li> <li>voip</li> <li>unknown</li> </ul>
     */
    public HLRLookupResponseBuilder numberType(String numberType) {
        hLRLookupResponse.setNumberType(numberType);
        return this;
    }

    /**
     * Was the HLR lookup successful. If true then this is a working and registered cell-phone or mobile device (SMS and phone calls will be delivered)
     */
    public HLRLookupResponseBuilder hlrValid(boolean hlrValid) {
        hLRLookupResponse.setHlrValid(hlrValid);
        return this;
    }

    /**
     * The HLR lookup status, possible values are: <ul> <li>ok - the HLR lookup was successful and the device is connected</li> <li>absent - the number was once registered but the device has been switched off or out of network range for some time</li> <li>unknown - the number is not known by the mobile network</li> <li>invalid - the number is not a valid mobile MSISDN number</li> <li>fixed-line - the number is a registered fixed-line not mobile</li> <li>voip - the number has been detected as a VOIP line</li> <li>failed - the HLR lookup has failed, we could not determine the real status of this number</li> </ul>
     */
    public HLRLookupResponseBuilder hlrStatus(String hlrStatus) {
        hLRLookupResponse.setHlrStatus(hlrStatus);
        return this;
    }

    /**
     * If the number has been ported, the ported to carrier name
     */
    public HLRLookupResponseBuilder portedNetwork(String portedNetwork) {
        hLRLookupResponse.setPortedNetwork(portedNetwork);
        return this;
    }

    /**
     * The mobile IMSI number (International Mobile Subscriber Identity)
     */
    public HLRLookupResponseBuilder imsi(String imsi) {
        hLRLookupResponse.setImsi(imsi);
        return this;
    }

    /**
     * The mobile MCC number (Mobile Country Code)
     */
    public HLRLookupResponseBuilder mcc(String mcc) {
        hLRLookupResponse.setMcc(mcc);
        return this;
    }

    /**
     * The number represented in full international format
     */
    public HLRLookupResponseBuilder internationalNumber(String internationalNumber) {
        hLRLookupResponse.setInternationalNumber(internationalNumber);
        return this;
    }

    /**
     * The number represented in local dialing format
     */
    public HLRLookupResponseBuilder localNumber(String localNumber) {
        hLRLookupResponse.setLocalNumber(localNumber);
        return this;
    }

    /**
     * The number location as an ISO 2-letter country code
     */
    public HLRLookupResponseBuilder countryCode(String countryCode) {
        hLRLookupResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * Has this number been ported to another network
     */
    public HLRLookupResponseBuilder isPorted(boolean isPorted) {
        hLRLookupResponse.setIsPorted(isPorted);
        return this;
    }

    /**
     * The mobile MSIN number (Mobile Subscription Identification Number)
     */
    public HLRLookupResponseBuilder msin(String msin) {
        hLRLookupResponse.setMsin(msin);
        return this;
    }

    /**
     * The number location. Could be a city, region or country depending on the type of number
     */
    public HLRLookupResponseBuilder location(String location) {
        hLRLookupResponse.setLocation(location);
        return this;
    }

    /**
     * The origin mobile carrier name
     */
    public HLRLookupResponseBuilder originNetwork(String originNetwork) {
        hLRLookupResponse.setOriginNetwork(originNetwork);
        return this;
    }

    /**
     * True if this is a mobile number (only true with 100% certainty, if the number type is unknown this value will be false)
     */
    public HLRLookupResponseBuilder isMobile(boolean isMobile) {
        hLRLookupResponse.setIsMobile(isMobile);
        return this;
    }

    /**
     * Is this number currently roaming from its origin country
     */
    public HLRLookupResponseBuilder isRoaming(boolean isRoaming) {
        hLRLookupResponse.setIsRoaming(isRoaming);
        return this;
    }

    /**
     * The phone number country
     */
    public HLRLookupResponseBuilder country(String country) {
        hLRLookupResponse.setCountry(country);
        return this;
    }

    /**
     * The number location as an ISO 3-letter country code
     */
    public HLRLookupResponseBuilder countryCode3(String countryCode3) {
        hLRLookupResponse.setCountryCode3(countryCode3);
        return this;
    }

    /**
     * ISO 4217 currency code associated with the country
     */
    public HLRLookupResponseBuilder currencyCode(String currencyCode) {
        hLRLookupResponse.setCurrencyCode(currencyCode);
        return this;
    }

    /**
     * If the number is currently roaming, the ISO 2-letter country code of the roaming in country
     */
    public HLRLookupResponseBuilder roamingCountryCode(String roamingCountryCode) {
        hLRLookupResponse.setRoamingCountryCode(roamingCountryCode);
        return this;
    }

    /**
     * The mobile MSC number (Mobile Switching Center)
     */
    public HLRLookupResponseBuilder msc(String msc) {
        hLRLookupResponse.setMsc(msc);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HLRLookupResponse build() {
        return hLRLookupResponse;
    }
}