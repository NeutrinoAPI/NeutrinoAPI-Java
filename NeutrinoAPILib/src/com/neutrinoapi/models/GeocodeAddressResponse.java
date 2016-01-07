/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class GeocodeAddressResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5151518353522095314L;
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
     * TODO: Write general description for this method
     */
    @JsonGetter("locations")
    public List<Location> getLocations ( ) { 
        return this.locations;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("locations")
    public void setLocations (List<Location> value) { 
        this.locations = value;
    }
 
}
 