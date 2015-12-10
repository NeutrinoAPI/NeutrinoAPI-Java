/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PhoneVerifyResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5024523515950456362L;
    private boolean calling;
    private boolean numberValid;
    private String securityCode;
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
 