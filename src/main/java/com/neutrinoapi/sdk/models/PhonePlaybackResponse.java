/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhonePlaybackResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -1708508275636761100L;
    private boolean calling;
    private boolean numberValid;
    /** GETTER
     * True if the call is being made now
     */
    @JsonGetter("calling")
    public boolean getCalling ( ) { 
        return this.calling;
    }
    
    /** SETTER
     * True if the call is being made now
     */
    @JsonSetter("calling")
    public void setCalling (boolean value) { 
        this.calling = value;
    }
 
    /** GETTER
     * True if this a valid phone number
     */
    @JsonGetter("numberValid")
    public boolean getNumberValid ( ) { 
        return this.numberValid;
    }
    
    /** SETTER
     * True if this a valid phone number
     */
    @JsonSetter("numberValid")
    public void setNumberValid (boolean value) { 
        this.numberValid = value;
    }
 
}
