/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GeocodeReverseResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5338155811230203317L;
    private String address;
    private String city;
    private String country;
    private String countryCode;
    private boolean found;
    private String postalCode;
    /** GETTER
     * The fully formatted address
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * The fully formatted address
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
    }
 
    /** GETTER
     * The city of the location
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * The city of the location
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * The country of the location
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * The country of the location
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * The ISO 2-letter country code of the location
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * The ISO 2-letter country code of the location
     */
    @JsonSetter("countryCode")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
    /** GETTER
     * True if these coordinates map to a real location
     */
    @JsonGetter("found")
    public boolean getFound ( ) { 
        return this.found;
    }
    
    /** SETTER
     * True if these coordinates map to a real location
     */
    @JsonSetter("found")
    public void setFound (boolean value) { 
        this.found = value;
    }
 
    /** GETTER
     * The postal code for the location
     */
    @JsonGetter("postalCode")
    public String getPostalCode ( ) { 
        return this.postalCode;
    }
    
    /** SETTER
     * The postal code for the location
     */
    @JsonSetter("postalCode")
    public void setPostalCode (String value) { 
        this.postalCode = value;
    }
 
}
 