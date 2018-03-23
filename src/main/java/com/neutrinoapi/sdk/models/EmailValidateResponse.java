/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EmailValidateResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5445631352936809743L;
    private boolean valid;
    private boolean syntaxError;
    private String domain;
    private boolean domainError;
    private boolean isFreemail;
    private String email;
    private boolean isDisposable;
    private boolean typosFixed;
    private boolean isPersonal;
    private String provider;
    /** GETTER
     * Is this a valid email
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid email
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
    /** GETTER
     * True if this address has a syntax error
     */
    @JsonGetter("syntaxError")
    public boolean getSyntaxError ( ) { 
        return this.syntaxError;
    }
    
    /** SETTER
     * True if this address has a syntax error
     */
    @JsonSetter("syntaxError")
    public void setSyntaxError (boolean value) { 
        this.syntaxError = value;
    }
 
    /** GETTER
     * The email domain
     */
    @JsonGetter("domain")
    public String getDomain ( ) { 
        return this.domain;
    }
    
    /** SETTER
     * The email domain
     */
    @JsonSetter("domain")
    public void setDomain (String value) { 
        this.domain = value;
    }
 
    /** GETTER
     * True if this address has a domain error (e.g. no valid mail server records)
     */
    @JsonGetter("domainError")
    public boolean getDomainError ( ) { 
        return this.domainError;
    }
    
    /** SETTER
     * True if this address has a domain error (e.g. no valid mail server records)
     */
    @JsonSetter("domainError")
    public void setDomainError (boolean value) { 
        this.domainError = value;
    }
 
    /** GETTER
     * True if this address is a free-mail address
     */
    @JsonGetter("isFreemail")
    public boolean getIsFreemail ( ) { 
        return this.isFreemail;
    }
    
    /** SETTER
     * True if this address is a free-mail address
     */
    @JsonSetter("isFreemail")
    public void setIsFreemail (boolean value) { 
        this.isFreemail = value;
    }
 
    /** GETTER
     * The full email address (this could be different to the supplied address if fix-typos is used)
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * The full email address (this could be different to the supplied address if fix-typos is used)
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
    }
 
    /** GETTER
     * True if this address is a disposable, temporary or darknet related email address
     */
    @JsonGetter("isDisposable")
    public boolean getIsDisposable ( ) { 
        return this.isDisposable;
    }
    
    /** SETTER
     * True if this address is a disposable, temporary or darknet related email address
     */
    @JsonSetter("isDisposable")
    public void setIsDisposable (boolean value) { 
        this.isDisposable = value;
    }
 
    /** GETTER
     * True if typos have been fixed
     */
    @JsonGetter("typosFixed")
    public boolean getTyposFixed ( ) { 
        return this.typosFixed;
    }
    
    /** SETTER
     * True if typos have been fixed
     */
    @JsonSetter("typosFixed")
    public void setTyposFixed (boolean value) { 
        this.typosFixed = value;
    }
 
    /** GETTER
     * True if this address belongs to a person. False if this is a role based address, e.g. admin@, help@, office@, etc.
     */
    @JsonGetter("isPersonal")
    public boolean getIsPersonal ( ) { 
        return this.isPersonal;
    }
    
    /** SETTER
     * True if this address belongs to a person. False if this is a role based address, e.g. admin@, help@, office@, etc.
     */
    @JsonSetter("isPersonal")
    public void setIsPersonal (boolean value) { 
        this.isPersonal = value;
    }
 
    /** GETTER
     * The email service provider domain
     */
    @JsonGetter("provider")
    public String getProvider ( ) { 
        return this.provider;
    }
    
    /** SETTER
     * The email service provider domain
     */
    @JsonSetter("provider")
    public void setProvider (String value) { 
        this.provider = value;
    }
 
}
 