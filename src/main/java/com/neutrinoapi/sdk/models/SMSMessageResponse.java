/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class SMSMessageResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -2187702151476749904L;
    private boolean numberValid;
    private boolean sent;
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
