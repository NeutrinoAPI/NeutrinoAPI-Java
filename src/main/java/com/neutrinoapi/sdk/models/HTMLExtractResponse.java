/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HTMLExtractResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5654901580289257635L;
    private int total;
    private List<String> values;
    /** GETTER
     * The total number of values extracted
     */
    @JsonGetter("total")
    public int getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * The total number of values extracted
     */
    @JsonSetter("total")
    public void setTotal (int value) { 
        this.total = value;
    }
 
    /** GETTER
     * Array of extracted values
     */
    @JsonGetter("values")
    public List<String> getValues ( ) { 
        return this.values;
    }
    
    /** SETTER
     * Array of extracted values
     */
    @JsonSetter("values")
    public void setValues (List<String> value) { 
        this.values = value;
    }
 
}
 