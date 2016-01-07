/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifySecurityCodeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5061949081902949377L;
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
 