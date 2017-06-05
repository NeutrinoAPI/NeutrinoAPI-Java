/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GeocodeReverseResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5726071374409529756L;
    private String country;
    private boolean found;
    private String address;
    private String city;
    private String countryCode;
    private String postalCode;
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
     * The state of the location
     */
    @JsonGetter("state")
    public String getState ( ) { 
        return this.state;
    }
    
    /** SETTER
     * The state of the location
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
 