/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class IPInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4212761328805676339L;
    private boolean valid;
    private String country;
    private String hostname;
    private String city;
    private String countryCode;
    private int latitude;
    private String region;
    private int longitude;
    private String continentCode;
    private String ip;
    private String countryCode3;
    private String currencyCode;
    /** GETTER
     * Is this a valid IPv4 or IPv6 address
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid IPv4 or IPv6 address
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
    /** GETTER
     * Full country name
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Full country name
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * The IPs hostname (only set if reverse-lookup has been used)
     */
    @JsonGetter("hostname")
    public String getHostname ( ) { 
        return this.hostname;
    }
    
    /** SETTER
     * The IPs hostname (only set if reverse-lookup has been used)
     */
    @JsonSetter("hostname")
    public void setHostname (String value) { 
        this.hostname = value;
    }
 
    /** GETTER
     * Full city name (if detectable)
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * Full city name (if detectable)
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * ISO 2-letter country code
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * ISO 2-letter country code
     */
    @JsonSetter("countryCode")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
    /** GETTER
     * Location latitude
     */
    @JsonGetter("latitude")
    public int getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * Location latitude
     */
    @JsonSetter("latitude")
    public void setLatitude (int value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * Full region name (if detectable)
     */
    @JsonGetter("region")
    public String getRegion ( ) { 
        return this.region;
    }
    
    /** SETTER
     * Full region name (if detectable)
     */
    @JsonSetter("region")
    public void setRegion (String value) { 
        this.region = value;
    }
 
    /** GETTER
     * Location longitude
     */
    @JsonGetter("longitude")
    public int getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * Location longitude
     */
    @JsonSetter("longitude")
    public void setLongitude (int value) { 
        this.longitude = value;
    }
 
    /** GETTER
     * ISO 2-letter continent code
     */
    @JsonGetter("continentCode")
    public String getContinentCode ( ) { 
        return this.continentCode;
    }
    
    /** SETTER
     * ISO 2-letter continent code
     */
    @JsonSetter("continentCode")
    public void setContinentCode (String value) { 
        this.continentCode = value;
    }
 
    /** GETTER
     * The IP address
     */
    @JsonGetter("ip")
    public String getIp ( ) { 
        return this.ip;
    }
    
    /** SETTER
     * The IP address
     */
    @JsonSetter("ip")
    public void setIp (String value) { 
        this.ip = value;
    }
 
    /** GETTER
     * ISO 3-letter country code
     */
    @JsonGetter("countryCode3")
    public String getCountryCode3 ( ) { 
        return this.countryCode3;
    }
    
    /** SETTER
     * ISO 3-letter country code
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
 
}
