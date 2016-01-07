/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EmailValidateResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5718479112928496841L;
    private String domain;
    private boolean domainError;
    private String email;
    private boolean isFreemail;
    private boolean syntaxError;
    private boolean valid;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("domain")
    public String getDomain ( ) { 
        return this.domain;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("domain")
    public void setDomain (String value) { 
        this.domain = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("domainError")
    public boolean getDomainError ( ) { 
        return this.domainError;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("domainError")
    public void setDomainError (boolean value) { 
        this.domainError = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("isFreemail")
    public boolean getIsFreemail ( ) { 
        return this.isFreemail;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("isFreemail")
    public void setIsFreemail (boolean value) { 
        this.isFreemail = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("syntaxError")
    public boolean getSyntaxError ( ) { 
        return this.syntaxError;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("syntaxError")
    public void setSyntaxError (boolean value) { 
        this.syntaxError = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
}
 