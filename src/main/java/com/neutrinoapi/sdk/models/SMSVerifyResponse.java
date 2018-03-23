/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SMSVerifyResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5071573803899839045L;
    private boolean numberValid;
    private String securityCode;
    private boolean sent;
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
 
    /** GETTER
     * True if the SMS has been sent
     */
    @JsonGetter("sent")
    public boolean getSent ( ) { 
        return this.sent;
    }
    
    /** SETTER
     * True if the SMS has been sent
     */
    @JsonSetter("sent")
    public void setSent (boolean value) { 
        this.sent = value;
    }
 
}
 