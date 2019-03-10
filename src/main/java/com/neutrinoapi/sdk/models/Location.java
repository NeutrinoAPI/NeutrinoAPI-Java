/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Location 
        implements java.io.Serializable {
    private static final long serialVersionUID = 6552270703335674298L;
    private String country;
    private String address;
    private String city;
    private String countryCode;
    private String countryCode3;
    private double latitude;
    private String postalCode;
    private double longitude;
    private String state;
    private LinkedHashMap<String, String> addressComponents;
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
     * The ISO 3-letter country code of the location
     */
    @JsonGetter("countryCode3")
    public String getCountryCode3 ( ) { 
        return this.countryCode3;
    }
    
    /** SETTER
     * The ISO 3-letter country code of the location
     */
    @JsonSetter("countryCode3")
    public void setCountryCode3 (String value) { 
        this.countryCode3 = value;
    }
 
    /** GETTER
     * The location latitude
     */
    @JsonGetter("latitude")
    public double getLatitude ( ) { 
        return this.latitude;
    }
    
    /** SETTER
     * The location latitude
     */
    @JsonSetter("latitude")
    public void setLatitude (double value) { 
        this.latitude = value;
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
 
    /** GETTER
     * The location longitude
     */
    @JsonGetter("longitude")
    public double getLongitude ( ) { 
        return this.longitude;
    }
    
    /** SETTER
     * The location longitude
     */
    @JsonSetter("longitude")
    public void setLongitude (double value) { 
        this.longitude = value;
    }
 
    /** GETTER
     * The state of the location (if applicable)
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * The state of the location (if applicable)
     */
    @JsonSetter("state")
    public void setState (String value) { 
        this.state = value;
    }
 
    /** GETTER
     * The components which make up the address such as road, city, state etc. May also include additional metadata about the address
     */
    @JsonGetter("addressComponents")
    public LinkedHashMap<String, String> getAddressComponents ( ) { 
        return this.addressComponents;
    }
    
    /** SETTER
     * The components which make up the address such as road, city, state etc. May also include additional metadata about the address
     */
    @JsonSetter("addressComponents")
    public void setAddressComponents (LinkedHashMap<String, String> value) { 
        this.addressComponents = value;
    }
 
}
