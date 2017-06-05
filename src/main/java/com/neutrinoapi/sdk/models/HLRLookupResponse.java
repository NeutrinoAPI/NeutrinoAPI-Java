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
    private static final long serialVersionUID = 5060967663204612266L;
    private boolean numberValid;
    private String internationalCallingCode;
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
    /** GETTER
     * Is this a valid phone number (mobile or otherwise)
     */
    @JsonGetter("numberValid")
    public boolean getNumberValid ( ) { 
        return this.numberValid;
    }
    
    /** SETTER
     * Is this a valid phone number (mobile or otherwise)
     */
    @JsonSetter("numberValid")
    public void setNumberValid (boolean value) { 
        this.numberValid = value;
    }
 
    /** GETTER
     * Numbers international calling code
     */
    @JsonGetter("internationalCallingCode")
    public String getInternationalCallingCode ( ) { 
        return this.internationalCallingCode;
    }
    
    /** SETTER
     * Numbers international calling code
     */
    @JsonSetter("internationalCallingCode")
    public void setInternationalCallingCode (String value) { 
        this.internationalCallingCode = value;
    }
 
    /** GETTER
     * The mobile MNC number (only set if HLR lookup valid)
     */
    @JsonGetter("mnc")
    public String getMnc ( ) { 
        return this.mnc;
    }
    
    /** SETTER
     * The mobile MNC number (only set if HLR lookup valid)
     */
    @JsonSetter("mnc")
    public void setMnc (String value) { 
        this.mnc = value;
    }
 
    /** GETTER
     * The number type, possible values are: mobile, fixed-line, premium-rate, toll-free, voip, unknown
     */
    @JsonGetter("numberType")
    public String getNumberType ( ) { 
        return this.numberType;
    }
    
    /** SETTER
     * The number type, possible values are: mobile, fixed-line, premium-rate, toll-free, voip, unknown
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
     * The HLR lookup status. See API docs for specific status details
     */
    @JsonGetter("hlrStatus")
    public String getHlrStatus ( ) { 
        return this.hlrStatus;
    }
    
    /** SETTER
     * The HLR lookup status. See API docs for specific status details
     */
    @JsonSetter("hlrStatus")
    public void setHlrStatus (String value) { 
        this.hlrStatus = value;
    }
 
    /** GETTER
     * If the number has been ported, the ported to mobile carrier name (only set if HLR lookup valid)
     */
    @JsonGetter("portedNetwork")
    public String getPortedNetwork ( ) { 
        return this.portedNetwork;
    }
    
    /** SETTER
     * If the number has been ported, the ported to mobile carrier name (only set if HLR lookup valid)
     */
    @JsonSetter("portedNetwork")
    public void setPortedNetwork (String value) { 
        this.portedNetwork = value;
    }
 
    /** GETTER
     * The mobile IMSI number (only set if HLR lookup valid)
     */
    @JsonGetter("imsi")
    public String getImsi ( ) { 
        return this.imsi;
    }
    
    /** SETTER
     * The mobile IMSI number (only set if HLR lookup valid)
     */
    @JsonSetter("imsi")
    public void setImsi (String value) { 
        this.imsi = value;
    }
 
    /** GETTER
     * The mobile MCC number (only set if HLR lookup valid)
     */
    @JsonGetter("mcc")
    public String getMcc ( ) { 
        return this.mcc;
    }
    
    /** SETTER
     * The mobile MCC number (only set if HLR lookup valid)
     */
    @JsonSetter("mcc")
    public void setMcc (String value) { 
        this.mcc = value;
    }
 
    /** GETTER
     * Number represented in international format
     */
    @JsonGetter("internationalNumber")
    public String getInternationalNumber ( ) { 
        return this.internationalNumber;
    }
    
    /** SETTER
     * Number represented in international format
     */
    @JsonSetter("internationalNumber")
    public void setInternationalNumber (String value) { 
        this.internationalNumber = value;
    }
 
    /** GETTER
     * Number represented in local format
     */
    @JsonGetter("localNumber")
    public String getLocalNumber ( ) { 
        return this.localNumber;
    }
    
    /** SETTER
     * Number represented in local format
     */
    @JsonSetter("localNumber")
    public void setLocalNumber (String value) { 
        this.localNumber = value;
    }
 
    /** GETTER
     * Number location ISO 2-letter country code
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * Number location ISO 2-letter country code
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
     * The mobile MSIN number (only set if HLR lookup valid)
     */
    @JsonGetter("msin")
    public String getMsin ( ) { 
        return this.msin;
    }
    
    /** SETTER
     * The mobile MSIN number (only set if HLR lookup valid)
     */
    @JsonSetter("msin")
    public void setMsin (String value) { 
        this.msin = value;
    }
 
    /** GETTER
     * Number location (could be a city, region or country)
     */
    @JsonGetter("location")
    public String getLocation ( ) { 
        return this.location;
    }
    
    /** SETTER
     * Number location (could be a city, region or country)
     */
    @JsonSetter("location")
    public void setLocation (String value) { 
        this.location = value;
    }
 
    /** GETTER
     * The origin mobile carrier name (only set if HLR lookup valid)
     */
    @JsonGetter("originNetwork")
    public String getOriginNetwork ( ) { 
        return this.originNetwork;
    }
    
    /** SETTER
     * The origin mobile carrier name (only set if HLR lookup valid)
     */
    @JsonSetter("originNetwork")
    public void setOriginNetwork (String value) { 
        this.originNetwork = value;
    }
 
    /** GETTER
     * Is this a mobile number
     */
    @JsonGetter("isMobile")
    public boolean getIsMobile ( ) { 
        return this.isMobile;
    }
    
    /** SETTER
     * Is this a mobile number
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
 
}
 