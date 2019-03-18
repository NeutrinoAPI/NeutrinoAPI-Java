/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class GeocodeReverseResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2542010768122043690L;
    private String country;
    private boolean found;
    private String address;
    private String city;
    private String countryCode;
    private String postalCode;
    private String state;
    private LinkedHashMap<String, String> addressComponents;
    private String countryCode3;
    private String currencyCode;
    private String locationType;
    private List<String> locationTags;
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
     * The components which make up the address such as road, city, state, etc
     */
    @JsonGetter("addressComponents")
    public LinkedHashMap<String, String> getAddressComponents ( ) { 
        return this.addressComponents;
    }
    
    /** SETTER
     * The components which make up the address such as road, city, state, etc
     */
    @JsonSetter("addressComponents")
    public void setAddressComponents (LinkedHashMap<String, String> value) { 
        this.addressComponents = value;
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
     * The detected location type ordered roughly from most to least precise, possible values are:<br/><ul><li>address - indicates a precise street address</li><li>street - accurate to the street level but may not point to the exact location of the house/building number</li><li>city - accurate to the city level, this includes villages, towns, suburbs, etc</li><li>postal-code - indicates a postal code area (no house or street information present)</li><li>railway - location is part of a rail network such as a station or railway track</li><li>natural - indicates a natural feature, for example a mountain peak or a waterway</li><li>island - location is an island or archipelago</li><li>administrative - indicates an administrative boundary such as a country, state or province</li></ul>
     */
    @JsonGetter("locationType")
    public String getLocationType ( ) { 
        return this.locationType;
    }
    
    /** SETTER
     * The detected location type ordered roughly from most to least precise, possible values are:<br/><ul><li>address - indicates a precise street address</li><li>street - accurate to the street level but may not point to the exact location of the house/building number</li><li>city - accurate to the city level, this includes villages, towns, suburbs, etc</li><li>postal-code - indicates a postal code area (no house or street information present)</li><li>railway - location is part of a rail network such as a station or railway track</li><li>natural - indicates a natural feature, for example a mountain peak or a waterway</li><li>island - location is an island or archipelago</li><li>administrative - indicates an administrative boundary such as a country, state or province</li></ul>
     */
    @JsonSetter("locationType")
    public void setLocationType (String value) { 
        this.locationType = value;
    }
 
    /** GETTER
     * Array of strings containing any location tags associated with the address. Tags are additional pieces of metadata about a specific location, there are thousands of different tags. Some examples of tags: shop, office, cafe, bank, pub
     */
    @JsonGetter("locationTags")
    public List<String> getLocationTags ( ) { 
        return this.locationTags;
    }
    
    /** SETTER
     * Array of strings containing any location tags associated with the address. Tags are additional pieces of metadata about a specific location, there are thousands of different tags. Some examples of tags: shop, office, cafe, bank, pub
     */
    @JsonSetter("locationTags")
    public void setLocationTags (List<String> value) { 
        this.locationTags = value;
    }
 
}
