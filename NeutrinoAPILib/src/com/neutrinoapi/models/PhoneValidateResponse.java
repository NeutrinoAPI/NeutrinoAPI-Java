/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhoneValidateResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4653518567474180154L;
    private String countryCode;
    private String internationalCallingCode;
    private String internationalNumber;
    private boolean isMobile;
    private String localNumber;
    private String location;
    private String type;
    private boolean valid;
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
     * The number type, possible values are: mobile, fixed-line, premium-rate, toll-free, voip, unknown
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The number type, possible values are: mobile, fixed-line, premium-rate, toll-free, voip, unknown
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Is this a valid phone number
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid phone number
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
}
 