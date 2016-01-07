/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class IPInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5288883751010880524L;
    private String city;
    private String country;
    private String countryCode;
    private String hostname;
    private double latitude;
    private double longitude;
    private String region;
    private boolean valid;
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
     * IP hostname (if reverse-lookup has been used)
     */
    @JsonGetter("hostname")
    public String getHostname ( ) { 
        return this.hostname;
    }
    
    /** SETTER
     * IP hostname (if reverse-lookup has been used)
     */
    @JsonSetter("hostname")
    public void setHostname (String value) { 
        this.hostname = value;
    }
 
    /** GETTER
     * Location latitude
     */
    @JsonGetter("latitude")
    public double getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * Location latitude
     */
    @JsonSetter("latitude")
    public void setLatitude (double value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * Location longitude
     */
    @JsonGetter("longitude")
    public double getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * Location longitude
     */
    @JsonSetter("longitude")
    public void setLongitude (double value) { 
        this.longitude = value;
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
     * Is this a valid IP address
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid IP address
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
}
 