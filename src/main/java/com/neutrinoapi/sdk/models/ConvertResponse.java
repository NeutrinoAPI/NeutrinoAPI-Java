/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConvertResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4642375330402174929L;
    private boolean valid;
    private String result;
    private String fromValue;
    private String toType;
    private String fromType;
    /** GETTER
     * Was the coversion successful and produced a valid result
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Was the coversion successful and produced a valid result
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
    /** GETTER
     * The result of the conversion
     */
    @JsonGetter("result")
    public String getResult ( ) { 
        return this.result;
    }
    
    /** SETTER
     * The result of the conversion
     */
    @JsonSetter("result")
    public void setResult (String value) { 
        this.result = value;
    }
 
    /** GETTER
     * The value being converted from
     */
    @JsonGetter("fromValue")
    public String getFromValue ( ) { 
        return this.fromValue;
    }
    
    /** SETTER
     * The value being converted from
     */
    @JsonSetter("fromValue")
    public void setFromValue (String value) { 
        this.fromValue = value;
    }
 
    /** GETTER
     * The type being converted to
     */
    @JsonGetter("toType")
    public String getToType ( ) { 
        return this.toType;
    }
    
    /** SETTER
     * The type being converted to
     */
    @JsonSetter("toType")
    public void setToType (String value) { 
        this.toType = value;
    }
 
    /** GETTER
     * The type of the value being converted from
     */
    @JsonGetter("fromType")
    public String getFromType ( ) { 
        return this.fromType;
    }
    
    /** SETTER
     * The type of the value being converted from
     */
    @JsonSetter("fromType")
    public void setFromType (String value) { 
        this.fromType = value;
    }
 
}
 