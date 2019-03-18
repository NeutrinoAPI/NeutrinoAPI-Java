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
public class BINLookupResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 1942627665655600917L;
    private String country;
    private String ipCity;
    private boolean ipMatchesBin;
    private String cardType;
    private String cardCategory;
    private String ipCountryCode;
    private String ipCountry;
    private String issuer;
    private boolean ipBlocklisted;
    private boolean valid;
    private List<String> ipBlocklists;
    private String issuerWebsite;
    private String countryCode;
    private String ipRegion;
    private String cardBrand;
    private String issuerPhone;
    private String countryCode3;
    private String currencyCode;
    private String ipCountryCode3;
    /** GETTER
     * The full country name of the issuer
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * The full country name of the issuer
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * The city of the customers IP (if detectable)
     */
    @JsonGetter("ipCity")
    public String getIpCity ( ) { 
        return this.ipCity;
    }
    
    /** SETTER
     * The city of the customers IP (if detectable)
     */
    @JsonSetter("ipCity")
    public void setIpCity (String value) { 
        this.ipCity = value;
    }
 
    /** GETTER
     * True if the customers IP country matches the BIN country
     */
    @JsonGetter("ipMatchesBin")
    public boolean getIpMatchesBin ( ) { 
        return this.ipMatchesBin;
    }
    
    /** SETTER
     * True if the customers IP country matches the BIN country
     */
    @JsonSetter("ipMatchesBin")
    public void setIpMatchesBin (boolean value) { 
        this.ipMatchesBin = value;
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
     * The card category. There are many different card categories the most common card categories are: CLASSIC, BUSINESS, CORPORATE, PLATINUM, PREPAID
     */
    @JsonGetter("cardCategory")
    public String getCardCategory ( ) { 
        return this.cardCategory;
    }
    
    /** SETTER
     * The card category. There are many different card categories the most common card categories are: CLASSIC, BUSINESS, CORPORATE, PLATINUM, PREPAID
     */
    @JsonSetter("cardCategory")
    public void setCardCategory (String value) { 
        this.cardCategory = value;
    }
 
    /** GETTER
     * The ISO 2-letter country code of the customers IP
     */
    @JsonGetter("ipCountryCode")
    public String getIpCountryCode ( ) { 
        return this.ipCountryCode;
    }
    
    /** SETTER
     * The ISO 2-letter country code of the customers IP
     */
    @JsonSetter("ipCountryCode")
    public void setIpCountryCode (String value) { 
        this.ipCountryCode = value;
    }
 
    /** GETTER
     * The country of the customers IP
     */
    @JsonGetter("ipCountry")
    public String getIpCountry ( ) { 
        return this.ipCountry;
    }
    
    /** SETTER
     * The country of the customers IP
     */
    @JsonSetter("ipCountry")
    public void setIpCountry (String value) { 
        this.ipCountry = value;
    }
 
    /** GETTER
     * The card issuer
     */
    @JsonGetter("issuer")
    public String getIssuer ( ) { 
        return this.issuer;
    }
    
    /** SETTER
     * The card issuer
     */
    @JsonSetter("issuer")
    public void setIssuer (String value) { 
        this.issuer = value;
    }
 
    /** GETTER
     * True if the customers IP is listed on one of our blocklists, see the <a href="http://www.neutrinoapi.com/api/ip-blocklist/">IP Blocklist API</a>
     */
    @JsonGetter("ipBlocklisted")
    public boolean getIpBlocklisted ( ) { 
        return this.ipBlocklisted;
    }
    
    /** SETTER
     * True if the customers IP is listed on one of our blocklists, see the <a href="http://www.neutrinoapi.com/api/ip-blocklist/">IP Blocklist API</a>
     */
    @JsonSetter("ipBlocklisted")
    public void setIpBlocklisted (boolean value) { 
        this.ipBlocklisted = value;
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
     * The card issuers website
     */
    @JsonGetter("issuerWebsite")
    public String getIssuerWebsite ( ) { 
        return this.issuerWebsite;
    }
    
    /** SETTER
     * The card issuers website
     */
    @JsonSetter("issuerWebsite")
    public void setIssuerWebsite (String value) { 
        this.issuerWebsite = value;
    }
 
    /** GETTER
     * The ISO 2-letter country code of the issuer
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * The ISO 2-letter country code of the issuer
     */
    @JsonSetter("countryCode")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
    /** GETTER
     * The region of the customers IP (if detectable)
     */
    @JsonGetter("ipRegion")
    public String getIpRegion ( ) { 
        return this.ipRegion;
    }
    
    /** SETTER
     * The region of the customers IP (if detectable)
     */
    @JsonSetter("ipRegion")
    public void setIpRegion (String value) { 
        this.ipRegion = value;
    }
 
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
     * The card issuers phone number
     */
    @JsonGetter("issuerPhone")
    public String getIssuerPhone ( ) { 
        return this.issuerPhone;
    }
    
    /** SETTER
     * The card issuers phone number
     */
    @JsonSetter("issuerPhone")
    public void setIssuerPhone (String value) { 
        this.issuerPhone = value;
    }
 
    /** GETTER
     * The ISO 3-letter country code of the issuer
     */
    @JsonGetter("countryCode3")
    public String getCountryCode3 ( ) { 
        return this.countryCode3;
    }
    
    /** SETTER
     * The ISO 3-letter country code of the issuer
     */
    @JsonSetter("countryCode3")
    public void setCountryCode3 (String value) { 
        this.countryCode3 = value;
    }
 
    /** GETTER
     * ISO 4217 currency code associated with the country of the issuer
     */
    @JsonGetter("currencyCode")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * ISO 4217 currency code associated with the country of the issuer
     */
    @JsonSetter("currencyCode")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
    }
 
    /** GETTER
     * The ISO 3-letter country code of the customers IP
     */
    @JsonGetter("ipCountryCode3")
    public String getIpCountryCode3 ( ) { 
        return this.ipCountryCode3;
    }
    
    /** SETTER
     * The ISO 3-letter country code of the customers IP
     */
    @JsonSetter("ipCountryCode3")
    public void setIpCountryCode3 (String value) { 
        this.ipCountryCode3 = value;
    }
 
}
