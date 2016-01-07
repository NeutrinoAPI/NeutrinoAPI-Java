/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BINLookupResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5709707485912116808L;
    private String cardBrand;
    private String cardCategory;
    private String cardType;
    private String country;
    private String countryCode;
    private boolean ipBlocklisted;
    private List<String> ipBlocklists;
    private String ipCity;
    private String ipCountry;
    private String ipCountryCode;
    private boolean ipMatchesBin;
    private String ipRegion;
    private String issuer;
    private String issuerPhone;
    private String issuerWebsite;
    private boolean valid;
    /** GETTER
     * The card brand (e.g. Visa or Mastercard)
     */
    @JsonGetter("cardBrand")
    public String getCardBrand ( ) { 
        return this.cardBrand;
    }
    
    /** SETTER
     * The card brand (e.g. Visa or Mastercard)
     */
    @JsonSetter("cardBrand")
    public void setCardBrand (String value) { 
        this.cardBrand = value;
    }
 
    /** GETTER
     * The card category (if known)
     */
    @JsonGetter("cardCategory")
    public String getCardCategory ( ) { 
        return this.cardCategory;
    }
    
    /** SETTER
     * The card category (if known)
     */
    @JsonSetter("cardCategory")
    public void setCardCategory (String value) { 
        this.cardCategory = value;
    }
 
    /** GETTER
     * The card type, will always be one of: DEBIT, CREDIT, CHARGE CARD
     */
    @JsonGetter("cardType")
    public String getCardType ( ) { 
        return this.cardType;
    }
    
    /** SETTER
     * The card type, will always be one of: DEBIT, CREDIT, CHARGE CARD
     */
    @JsonSetter("cardType")
    public void setCardType (String value) { 
        this.cardType = value;
    }
 
    /** GETTER
     * Full country name of the issuer
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Full country name of the issuer
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * ISO 2-letter country code of the issuer
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * ISO 2-letter country code of the issuer
     */
    @JsonSetter("countryCode")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
    /** GETTER
     * True if the customer IP is listed on one of our blocklists, see the IP Blocklist API for more details
     */
    @JsonGetter("ipBlocklisted")
    public boolean getIpBlocklisted ( ) { 
        return this.ipBlocklisted;
    }
    
    /** SETTER
     * True if the customer IP is listed on one of our blocklists, see the IP Blocklist API for more details
     */
    @JsonSetter("ipBlocklisted")
    public void setIpBlocklisted (boolean value) { 
        this.ipBlocklisted = value;
    }
 
    /** GETTER
     * An array of strings indicating which blocklists this IP is listed on
     */
    @JsonGetter("ipBlocklists")
    public List<String> getIpBlocklists ( ) { 
        return this.ipBlocklists;
    }
    
    /** SETTER
     * An array of strings indicating which blocklists this IP is listed on
     */
    @JsonSetter("ipBlocklists")
    public void setIpBlocklists (List<String> value) { 
        this.ipBlocklists = value;
    }
 
    /** GETTER
     * The city name (if detectable) from the customer IP
     */
    @JsonGetter("ipCity")
    public String getIpCity ( ) { 
        return this.ipCity;
    }
    
    /** SETTER
     * The city name (if detectable) from the customer IP
     */
    @JsonSetter("ipCity")
    public void setIpCity (String value) { 
        this.ipCity = value;
    }
 
    /** GETTER
     * The country detected from the customer IP
     */
    @JsonGetter("ipCountry")
    public String getIpCountry ( ) { 
        return this.ipCountry;
    }
    
    /** SETTER
     * The country detected from the customer IP
     */
    @JsonSetter("ipCountry")
    public void setIpCountry (String value) { 
        this.ipCountry = value;
    }
 
    /** GETTER
     * The ISO 2-letter country code detected from the customer IP
     */
    @JsonGetter("ipCountryCode")
    public String getIpCountryCode ( ) { 
        return this.ipCountryCode;
    }
    
    /** SETTER
     * The ISO 2-letter country code detected from the customer IP
     */
    @JsonSetter("ipCountryCode")
    public void setIpCountryCode (String value) { 
        this.ipCountryCode = value;
    }
 
    /** GETTER
     * True if the customer IP address country matches the BIN country
     */
    @JsonGetter("ipMatchesBin")
    public boolean getIpMatchesBin ( ) { 
        return this.ipMatchesBin;
    }
    
    /** SETTER
     * True if the customer IP address country matches the BIN country
     */
    @JsonSetter("ipMatchesBin")
    public void setIpMatchesBin (boolean value) { 
        this.ipMatchesBin = value;
    }
 
    /** GETTER
     * The region name (if detectable) from the customer IP
     */
    @JsonGetter("ipRegion")
    public String getIpRegion ( ) { 
        return this.ipRegion;
    }
    
    /** SETTER
     * The region name (if detectable) from the customer IP
     */
    @JsonSetter("ipRegion")
    public void setIpRegion (String value) { 
        this.ipRegion = value;
    }
 
    /** GETTER
     * The card issuer (if known)
     */
    @JsonGetter("issuer")
    public String getIssuer ( ) { 
        return this.issuer;
    }
    
    /** SETTER
     * The card issuer (if known)
     */
    @JsonSetter("issuer")
    public void setIssuer (String value) { 
        this.issuer = value;
    }
 
    /** GETTER
     * The card issuer phone number (if known)
     */
    @JsonGetter("issuerPhone")
    public String getIssuerPhone ( ) { 
        return this.issuerPhone;
    }
    
    /** SETTER
     * The card issuer phone number (if known)
     */
    @JsonSetter("issuerPhone")
    public void setIssuerPhone (String value) { 
        this.issuerPhone = value;
    }
 
    /** GETTER
     * The card issuer website (if known)
     */
    @JsonGetter("issuerWebsite")
    public String getIssuerWebsite ( ) { 
        return this.issuerWebsite;
    }
    
    /** SETTER
     * The card issuer website (if known)
     */
    @JsonSetter("issuerWebsite")
    public void setIssuerWebsite (String value) { 
        this.issuerWebsite = value;
    }
 
    /** GETTER
     * Is this a valid BIN or IIN number
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid BIN or IIN number
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
}
 