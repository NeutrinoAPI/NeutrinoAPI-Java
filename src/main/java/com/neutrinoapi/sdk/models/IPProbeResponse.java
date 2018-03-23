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
    private static final long serialVersionUID = 4823612807837523341L;
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
    private String continentCode;
    private boolean isHosting;
    private boolean isIsp;
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
     * The detected provider type. See online API docs for specific provider type details
     */
    @JsonGetter("providerType")
    public String getProviderType ( ) { 
        return this.providerType;
    }
    
    /** SETTER
     * The detected provider type. See online API docs for specific provider type details
     */
    @JsonSetter("providerType")
    public void setProviderType (String value) { 
        this.providerType = value;
    }
 
    /** GETTER
     * ISO 2-letter country code
     */
    @JsonGetter("countryCode")
    public String getCountryCode ( ) { 
        return this.countryCode;
    }
    
    /** SETTER
     * ISO 2-letter country code
     */
    @JsonSetter("countryCode")
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
    @JsonGetter("providerDomain")
    public String getProviderDomain ( ) { 
        return this.providerDomain;
    }
    
    /** SETTER
     * The domain name of the provider
     */
    @JsonSetter("providerDomain")
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
    @JsonGetter("providerWebsite")
    public String getProviderWebsite ( ) { 
        return this.providerWebsite;
    }
    
    /** SETTER
     * The website URL for the provider
     */
    @JsonSetter("providerWebsite")
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
    @JsonGetter("providerDescription")
    public String getProviderDescription ( ) { 
        return this.providerDescription;
    }
    
    /** SETTER
     * A description of the provider, usually extracted from the providers website or WHOIS record
     */
    @JsonSetter("providerDescription")
    public void setProviderDescription (String value) { 
        this.providerDescription = value;
    }
 
    /** GETTER
     * ISO 2-letter continent code
     */
    @JsonGetter("continentCode")
    public String getContinentCode ( ) { 
        return this.continentCode;
    }
    
    /** SETTER
     * ISO 2-letter continent code
     */
    @JsonSetter("continentCode")
    public void setContinentCode (String value) { 
        this.continentCode = value;
    }
 
    /** GETTER
     * True if this IP belongs to a hosting company. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    @JsonGetter("isHosting")
    public boolean getIsHosting ( ) { 
        return this.isHosting;
    }
    
    /** SETTER
     * True if this IP belongs to a hosting company. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    @JsonSetter("isHosting")
    public void setIsHosting (boolean value) { 
        this.isHosting = value;
    }
 
    /** GETTER
     * True if this IP belongs to an ISP. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    @JsonGetter("isIsp")
    public boolean getIsIsp ( ) { 
        return this.isIsp;
    }
    
    /** SETTER
     * True if this IP belongs to an ISP. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    @JsonSetter("isIsp")
    public void setIsIsp (boolean value) { 
        this.isIsp = value;
    }
 
}
 