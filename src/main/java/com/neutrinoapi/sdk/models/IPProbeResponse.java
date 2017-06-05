/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class IPProbeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4952477846539426173L;
    private boolean valid;
    private String country;
    private String providerType;
    private String countryCode;
    private String hostname;
    private String providerDomain;
    private String city;
    private String providerWebsite;
    private String ip;
    private String region;
    private String providerDescription;
    /** GETTER
     * Is this a valid IPv4 or IPv6 address
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid IPv4 or IPv6 address
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
    /** GETTER
     * Full country name
     */
    @JsonGetter("country")
    public String getCountry ( ) { 
        return this.country;
    }
    
    /** SETTER
     * Full country name
     */
    @JsonSetter("country")
    public void setCountry (String value) { 
        this.country = value;
    }
 
    /** GETTER
     * The detected provider type. See API docs for specific provider type details
     */
    @JsonGetter("provider-type")
    public String getProviderType ( ) { 
        return this.providerType;
    }
    
    /** SETTER
     * The detected provider type. See API docs for specific provider type details
     */
    @JsonSetter("provider-type")
    public void setProviderType (String value) { 
        this.providerType = value;
    }
 
    /** GETTER
     * ISO 2-letter country code
     */
    @JsonGetter("country-code")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * ISO 2-letter country code
     */
    @JsonSetter("country-code")
    public void setCountryCode (String value) { 
        this.countryCode = value;
    }
 
    /** GETTER
     * The IPs hostname (PTR)
     */
    @JsonGetter("hostname")
    public String getHostname ( ) { 
        return this.hostname;
    }
    
    /** SETTER
     * The IPs hostname (PTR)
     */
    @JsonSetter("hostname")
    public void setHostname (String value) { 
        this.hostname = value;
    }
 
    /** GETTER
     * The domain name of the provider
     */
    @JsonGetter("provider-domain")
    public String getProviderDomain ( ) { 
        return this.providerDomain;
    }
    
    /** SETTER
     * The domain name of the provider
     */
    @JsonSetter("provider-domain")
    public void setProviderDomain (String value) { 
        this.providerDomain = value;
    }
 
    /** GETTER
     * Full city name (if detectable)
     */
    @JsonGetter("city")
    public String getCity ( ) { 
        return this.city;
    }
    
    /** SETTER
     * Full city name (if detectable)
     */
    @JsonSetter("city")
    public void setCity (String value) { 
        this.city = value;
    }
 
    /** GETTER
     * The website URL for the provider
     */
    @JsonGetter("provider-website")
    public String getProviderWebsite ( ) { 
        return this.providerWebsite;
    }
    
    /** SETTER
     * The website URL for the provider
     */
    @JsonSetter("provider-website")
    public void setProviderWebsite (String value) { 
        this.providerWebsite = value;
    }
 
    /** GETTER
     * The IP address
     */
    @JsonGetter("ip")
    public String getIp ( ) { 
        return this.ip;
    }
    
    /** SETTER
     * The IP address
     */
    @JsonSetter("ip")
    public void setIp (String value) { 
        this.ip = value;
    }
 
    /** GETTER
     * Full region name (if detectable)
     */
    @JsonGetter("region")
    public String getRegion ( ) { 
        return this.region;
    }
    
    /** SETTER
     * Full region name (if detectable)
     */
    @JsonSetter("region")
    public void setRegion (String value) { 
        this.region = value;
    }
 
    /** GETTER
     * A description of the provider, usually extracted from the providers website or WHOIS record
     */
    @JsonGetter("provider-description")
    public String getProviderDescription ( ) { 
        return this.providerDescription;
    }
    
    /** SETTER
     * A description of the provider, usually extracted from the providers website or WHOIS record
     */
    @JsonSetter("provider-description")
    public void setProviderDescription (String value) { 
        this.providerDescription = value;
    }
 
}
 