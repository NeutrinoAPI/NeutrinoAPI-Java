/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class VerifySecurityCodeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5474666132456236929L;
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
 