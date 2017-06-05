/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhoneVerifyResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4961748292580891932L;
    private boolean numberValid;
    private boolean calling;
    private String securityCode;
    /** GETTER
     * Is this a valid phone number
     */
    @JsonGetter("numberValid")
    public boolean getNumberValid ( ) { 
        return this.numberValid;
    }
    
    /** SETTER
     * Is this a valid phone number
     */
    @JsonSetter("numberValid")
    public void setNumberValid (boolean value) { 
        this.numberValid = value;
    }
 
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
     * The security code generated, you can save this code to perform your own verification or you can use the Verify Security Code API
     */
    @JsonGetter("securityCode")
    public String getSecurityCode ( ) { 
        return this.securityCode;
    }
    
    /** SETTER
     * The security code generated, you can save this code to perform your own verification or you can use the Verify Security Code API
     */
    @JsonSetter("securityCode")
    public void setSecurityCode (String value) { 
        this.securityCode = value;
    }
 
}
 