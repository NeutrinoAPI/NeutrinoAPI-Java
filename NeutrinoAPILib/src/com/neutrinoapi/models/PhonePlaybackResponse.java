/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhonePlaybackResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4620749783134688811L;
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
     * Is this a valid phone number
     */
    @JsonGetter("number-valid")
    public boolean getNumberValid ( ) { 
        return this.numberValid;
    }
    
    /** SETTER
     * Is this a valid phone number
     */
    @JsonSetter("number-valid")
    public void setNumberValid (boolean value) { 
        this.numberValid = value;
    }
 
}
 