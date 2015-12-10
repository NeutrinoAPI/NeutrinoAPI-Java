/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhonePlaybackResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5729230898423250146L;
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
 