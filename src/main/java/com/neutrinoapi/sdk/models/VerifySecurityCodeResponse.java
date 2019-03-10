/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifySecurityCodeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 116993190482534947L;
    private boolean verified;
    /** GETTER
     * True if the code is valid
     */
    @JsonGetter("verified")
    public boolean getVerified ( ) { 
        return this.verified;
    }
    
    /** SETTER
     * True if the code is valid
     */
    @JsonSetter("verified")
    public void setVerified (boolean value) { 
        this.verified = value;
    }
 
}
