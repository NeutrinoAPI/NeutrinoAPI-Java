/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GeocodeAddressResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5498659045509203144L;
    private int found;
    private List<Location> locations;
    /** GETTER
     * The number of possible matching locations found
     */
    @JsonGetter("found")
    public int getFound ( ) { 
        return this.found;
    }
    
    /** SETTER
     * The number of possible matching locations found
     */
    @JsonSetter("found")
    public void setFound (int value) { 
        this.found = value;
    }
 
    /** GETTER
     * Array of matching location objects
     */
    @JsonGetter("locations")
    public List<Location> getLocations ( ) { 
        return this.locations;
    }
    
    /** SETTER
     * Array of matching location objects
     */
    @JsonSetter("locations")
    public void setLocations (List<Location> value) { 
        this.locations = value;
    }
 
}
 