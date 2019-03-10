/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HLRLookupResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5590493695433213319L;
    private boolean numberValid;
    private int internationalCallingCode;
    private String mnc;
    private String numberType;
    private boolean hlrValid;
    private String hlrStatus;
    private String portedNetwork;
    private String imsi;
    private String mcc;
    private String internationalNumber;
    private String localNumber;
    private String countryCode;
    private boolean isPorted;
    private String msin;
    private String location;
    private String originNetwork;
    private boolean isMobile;
    private boolean isRoaming;
    private String country;
    private String countryCode3;
    private String currencyCode;
    private String roamingCountryCode;
    /** GETTER
     * True if this a valid phone number
     */
    @JsonGetter("numberValid")
    public boolean getNumberValid ( ) { 
        return this.numberValid;
    }
    
    /** SETTER
     * True if this a valid phone number
     */
    @JsonSetter("numberValid")
    public void setNumberValid (boolean value) { 
        this.numberValid = value;
    }
 
    /** GETTER
     * The numbers international calling code
     */
    @JsonGetter("internationalCallingCode")
    public int getInternationalCallingCode ( ) { 
        return this.internationalCallingCode;
    }
    
    /** SETTER
     * The numbers international calling code
     */
    @JsonSetter("internationalCallingCode")
    public void setInternationalCallingCode (int value) { 
        this.internationalCallingCode = value;
    }
 
    /** GETTER
     * The mobile MNC number
     */
    @JsonGetter("mnc")
    public String getMnc ( ) { 
        return this.mnc;
    }
    
    /** SETTER
     * The mobile MNC number
     */
    @JsonSetter("mnc")
    public void setMnc (String value) { 
        this.mnc = value;
    }
 
    /** GETTER
     * The number type, possible values are:<br/><ul><li>mobile</li><li>fixed-line</li><li>premium-rate</li><li>toll-free</li><li>voip</li><li>unknown</li></ul>
     */
    @JsonGetter("numberType")
    public String getNumberType ( ) { 
        return this.numberType;
    }
    
    /** SETTER
     * The number type, possible values are:<br/><ul><li>mobile</li><li>fixed-line</li><li>premium-rate</li><li>toll-free</li><li>voip</li><li>unknown</li></ul>
     */
    @JsonSetter("numberType")
    public void setNumberType (String value) { 
        this.numberType = value;
    }
 
    /** GETTER
     * Was the HLR lookup successful. If true then this is a working and registered cell-phone or mobile device (SMS and phone calls will be delivered)
     */
    @JsonGetter("hlrValid")
    public boolean getHlrValid ( ) { 
        return this.hlrValid;
    }
    
    /** SETTER
     * Was the HLR lookup successful. If true then this is a working and registered cell-phone or mobile device (SMS and phone calls will be delivered)
     */
    @JsonSetter("hlrValid")
    public void setHlrValid (boolean value) { 
        this.hlrValid = value;
    }
 
    /** GETTER
     * The HLR lookup status, possible values are:<br/><ul><li>ok - the HLR lookup was successful and the device is connected</li><li>absent - the number was once registered but the device has been switched off or out of network range for some time</li><li>unknown - the number is not known by the mobile network</li><li>invalid  - the number is not a valid mobile MSISDN number</li><li>fixed-line - the number is a registered fixed-line not mobile</li><li>voip - the number has been detected as a VOIP line</li><li>failed - the HLR lookup has failed, we could not determine the real status of this number</li></ul>
     */
    @JsonGetter("hlrStatus")
    public String getHlrStatus ( ) { 
        return this.hlrStatus;
    }
    
    /** SETTER
     * The HLR lookup status, possible values are:<br/><ul><li>ok - the HLR lookup was successful and the device is connected</li><li>absent - the number was once registered but the device has been switched off or out of network range for some time</li><li>unknown - the number is not known by the mobile network</li><li>invalid  - the number is not a valid mobile MSISDN number</li><li>fixed-line - the number is a registered fixed-line not mobile</li><li>voip - the number has been detected as a VOIP line</li><li>failed - the HLR lookup has failed, we could not determine the real status of this number</li></ul>
     */
    @JsonSetter("hlrStatus")
    public void setHlrStatus (String value) { 
        this.hlrStatus = value;
    }
 
    /** GETTER
     * If the number has been ported, the ported to carrier name
     */
    @JsonGetter("portedNetwork")
    public String getPortedNetwork ( ) { 
        return this.portedNetwork;
    }
    
    /** SETTER
     * If the number has been ported, the ported to carrier name
     */
    @JsonSetter("portedNetwork")
    public void setPortedNetwork (String value) { 
        this.portedNetwork = value;
    }
 
    /** GETTER
     * The mobile IMSI number
     */
    @JsonGetter("imsi")
    public String getImsi ( ) { 
        return this.imsi;
    }
    
    /** SETTER
     * The mobile IMSI number
     */
    @JsonSetter("imsi")
    public void setImsi (String value) { 
        this.imsi = value;
    }
 
    /** GETTER
     * The mobile MCC number
     */
    @JsonGetter("mcc")
    public String getMcc ( ) { 
        return this.mcc;
    }
    
    /** SETTER
     * The mobile MCC number
     */
    @JsonSetter("mcc")
    public void setMcc (String value) { 
        this.mcc = value;
    }
 
    /** GETTER
     * The number represented in full international format
     */
    @JsonGetter("internationalNumber")
    public String getInternationalNumber ( ) { 
        return this.internationalNumber;
    }
    
    /** SETTER
     * The number represented in full international format
     */
    @JsonSetter("internationalNumber")
    public void setInternationalNumber (String value) { 
        this.internationalNumber = value;
    }
 
    /** GETTER
     * The number represented in local dialing format
     */
    @JsonGetter("localNumber")
    public String getLocalNumber ( ) { 
        return this.localNumber;
    }
    
    /** SETTER
     * The number represented in local dialing format
     */
    @JsonSetter("localNumber")
    public void setLocalNumber (String value) { 
        this.localNumber = value;
    }
 
    /** GETTER
     * The number location as an ISO 2-letter country code
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * The number location as an ISO 2-letter country code
     */
    @JsonSetter("countryCode")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
    /** GETTER
     * Has this number been ported to another network
     */
    @JsonGetter("isPorted")
    public boolean getIsPorted ( ) { 
        return this.isPorted;
    }
    
    /** SETTER
     * Has this number been ported to another network
     */
    @JsonSetter("isPorted")
    public void setIsPorted (boolean value) { 
        this.isPorted = value;
    }
 
    /** GETTER
     * The mobile MSIN number
     */
    @JsonGetter("msin")
    public String getMsin ( ) { 
        return this.msin;
    }
    
    /** SETTER
     * The mobile MSIN number
     */
    @JsonSetter("msin")
    public void setMsin (String value) { 
        this.msin = value;
    }
 
    /** GETTER
     * The number location. Could be a city, region or country depending on the type of number
     */
    @JsonGetter("location")
    public String getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * The number location. Could be a city, region or country depending on the type of number
     */
    @JsonSetter("location")
    public void setLocation (String value) { 
        this.location = value;
    }
 
    /** GETTER
     * The origin mobile carrier name
     */
    @JsonGetter("originNetwork")
    public String getOriginNetwork ( ) { 
        return this.originNetwork;
    }
    
    /** SETTER
     * The origin mobile carrier name
     */
    @JsonSetter("originNetwork")
    public void setOriginNetwork (String value) { 
        this.originNetwork = value;
    }
 
    /** GETTER
     * True if this is a mobile number (only true with 100% certainty, if the number type is unknown this value will be false)
     */
    @JsonGetter("isMobile")
    public boolean getIsMobile ( ) { 
        return this.isMobile;
    }
    
    /** SETTER
     * True if this is a mobile number (only true with 100% certainty, if the number type is unknown this value will be false)
     */
    @JsonSetter("isMobile")
    public void setIsMobile (boolean value) { 
        this.isMobile = value;
    }
 
    /** GETTER
     * Is this number currently roaming from its origin country
     */
    @JsonGetter("isRoaming")
    public boolean getIsRoaming ( ) { 
        return this.isRoaming;
    }
    
    /** SETTER
     * Is this number currently roaming from its origin country
     */
    @JsonSetter("isRoaming")
    public void setIsRoaming (boolean value) { 
        this.isRoaming = value;
    }
 
    /** GETTER
     * The phone number country
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * The phone number country
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * The number location as an ISO 3-letter country code
     */
    @JsonGetter("countryCode3")
    public String getCountryCode3 ( ) { 
        return this.countryCode3;
    }
    
    /** SETTER
     * The number location as an ISO 3-letter country code
     */
    @JsonSetter("countryCode3")
    public void setCountryCode3 (String value) { 
        this.countryCode3 = value;
    }
 
    /** GETTER
     * ISO 4217 currency code associated with the country
     */
    @JsonGetter("currencyCode")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * ISO 4217 currency code associated with the country
     */
    @JsonSetter("currencyCode")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
    }
 
    /** GETTER
     * If the number is currently roaming, the ISO 2-letter country code of the roaming in country
     */
    @JsonGetter("roamingCountryCode")
    public String getRoamingCountryCode ( ) { 
        return this.roamingCountryCode;
    }
    
    /** SETTER
     * If the number is currently roaming, the ISO 2-letter country code of the roaming in country
     */
    @JsonSetter("roamingCountryCode")
    public void setRoamingCountryCode (String value) { 
        this.roamingCountryCode = value;
    }
 
}
