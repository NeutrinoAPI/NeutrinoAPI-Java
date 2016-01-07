/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Location 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4954028867122157558L;
    private String address;
    private String city;
    private String country;
    private String countryCode;
    private double latitude;
    private double longitude;
    private String postalCode;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("address")
    public String getAddress ( ) { 
        return this.address;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("address")
    public void setAddress (String value) { 
        this.address = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("countryCode")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("latitude")
    public double getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("latitude")
    public void setLatitude (double value) { 
        this.latitude = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("longitude")
    public double getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("longitude")
    public void setLongitude (double value) { 
        this.longitude = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("postalCode")
    public String getPostalCode ( ) { 
        return this.postalCode;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("postalCode")
    public void setPostalCode (String value) { 
        this.postalCode = value;
    }
 
}
 