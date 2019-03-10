/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class EmailVerifyResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 196147590924230381L;
    private boolean valid;
    private boolean verified;
    private String email;
    private boolean typosFixed;
    private boolean syntaxError;
    private boolean domainError;
    private String domain;
    private String provider;
    private boolean isFreemail;
    private boolean isDisposable;
    private boolean isPersonal;
    private String smtpStatus;
    private String smtpResponse;
    private boolean isCatchAll;
    private boolean isDeferred;
    /** GETTER
     * Is this a valid email address (syntax and domain is valid)
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid email address (syntax and domain is valid)
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
    /** GETTER
     * True if this address has passed SMTP verification. Check the smtp-status and smtp-response fields for specific verification details
     */
    @JsonGetter("verified")
    public boolean getVerified ( ) { 
        return this.verified;
    }
    
    /** SETTER
     * True if this address has passed SMTP verification. Check the smtp-status and smtp-response fields for specific verification details
     */
    @JsonSetter("verified")
    public void setVerified (boolean value) { 
        this.verified = value;
    }
 
    /** GETTER
     * The full email address (this could be different to the supplied address if typos-fixed is true)
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * The full email address (this could be different to the supplied address if typos-fixed is true)
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
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
     * True if this address is for a person. False if this is a role based address, e.g. admin@, help@, office@, etc.
     */
    @JsonGetter("isPersonal")
    public boolean getIsPersonal ( ) { 
        return this.isPersonal;
    }
    
    /** SETTER
     * True if this address is for a person. False if this is a role based address, e.g. admin@, help@, office@, etc.
     */
    @JsonSetter("isPersonal")
    public void setIsPersonal (boolean value) { 
        this.isPersonal = value;
    }
 
    /** GETTER
     * The SMTP verification status for the address:<br/><ul><li>ok - SMTP verification was successful, this is a real address that can receive mail</li><li>invalid - this is not a valid email address (has either a domain or syntax error)</li><li>absent - this address is not registered with the email service provider</li><li>unresponsive - the mail server(s) for this address timed-out or refused to open an SMTP connection</li><li>unknown - sorry, we could not reliably determine the real status of this address (this address may or may not exist)</li></ul>
     */
    @JsonGetter("smtpStatus")
    public String getSmtpStatus ( ) { 
        return this.smtpStatus;
    }
    
    /** SETTER
     * The SMTP verification status for the address:<br/><ul><li>ok - SMTP verification was successful, this is a real address that can receive mail</li><li>invalid - this is not a valid email address (has either a domain or syntax error)</li><li>absent - this address is not registered with the email service provider</li><li>unresponsive - the mail server(s) for this address timed-out or refused to open an SMTP connection</li><li>unknown - sorry, we could not reliably determine the real status of this address (this address may or may not exist)</li></ul>
     */
    @JsonSetter("smtpStatus")
    public void setSmtpStatus (String value) { 
        this.smtpStatus = value;
    }
 
    /** GETTER
     * The raw SMTP response message received during verification
     */
    @JsonGetter("smtpResponse")
    public String getSmtpResponse ( ) { 
        return this.smtpResponse;
    }
    
    /** SETTER
     * The raw SMTP response message received during verification
     */
    @JsonSetter("smtpResponse")
    public void setSmtpResponse (String value) { 
        this.smtpResponse = value;
    }
 
    /** GETTER
     * True if this email domain has a catch-all policy (it will accept mail for any username)
     */
    @JsonGetter("isCatchAll")
    public boolean getIsCatchAll ( ) { 
        return this.isCatchAll;
    }
    
    /** SETTER
     * True if this email domain has a catch-all policy (it will accept mail for any username)
     */
    @JsonSetter("isCatchAll")
    public void setIsCatchAll (boolean value) { 
        this.isCatchAll = value;
    }
 
    /** GETTER
     * True if the mail server responded with a temporary failure (either a 4xx response code or unresponsive server). You can retry this address later, we recommend waiting at least 15 minutes before retrying
     */
    @JsonGetter("isDeferred")
    public boolean getIsDeferred ( ) { 
        return this.isDeferred;
    }
    
    /** SETTER
     * True if the mail server responded with a temporary failure (either a 4xx response code or unresponsive server). You can retry this address later, we recommend waiting at least 15 minutes before retrying
     */
    @JsonSetter("isDeferred")
    public void setIsDeferred (boolean value) { 
        this.isDeferred = value;
    }
 
}
