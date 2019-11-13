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
public class IPProbeResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = -361431626173355651L;
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
    private String countryCode3;
    private String currencyCode;
    private boolean isVpn;
    private boolean isProxy;
    private String asn;
    private String asCidr;
    private String asCountryCode;
    private String asCountryCode3;
    private List<String> asDomains;
    private String asDescription;
    private int asAge;
    private String hostDomain;
    private String vpnDomain;
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
     * The detected provider type, possible values are: <ul> <li>isp - IP belongs to an internet service provider. This includes both mobile, home and business internet providers</li> <li>hosting - IP belongs to a hosting company. This includes website hosting, cloud computing platforms and colocation facilities</li> <li>vpn - IP belongs to a VPN provider</li> <li>proxy - IP belongs to a proxy service. This includes HTTP/SOCKS proxies and browser based proxies</li> <li>university - IP belongs to a university/college/campus</li> <li>government - IP belongs to a government department. This includes military facilities</li> <li>commercial - IP belongs to a commercial entity such as a corporate headquarters or company office</li> <li>unknown - could not identify the provider type</li> </ul>
     */
    @JsonGetter("providerType")
    public String getProviderType ( ) { 
        return this.providerType;
    }
    
    /** SETTER
     * The detected provider type, possible values are: <ul> <li>isp - IP belongs to an internet service provider. This includes both mobile, home and business internet providers</li> <li>hosting - IP belongs to a hosting company. This includes website hosting, cloud computing platforms and colocation facilities</li> <li>vpn - IP belongs to a VPN provider</li> <li>proxy - IP belongs to a proxy service. This includes HTTP/SOCKS proxies and browser based proxies</li> <li>university - IP belongs to a university/college/campus</li> <li>government - IP belongs to a government department. This includes military facilities</li> <li>commercial - IP belongs to a commercial entity such as a corporate headquarters or company office</li> <li>unknown - could not identify the provider type</li> </ul>
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
     * The IPs full hostname (PTR)
     */
    @JsonGetter("hostname")
    public String getHostname ( ) { 
        return this.hostname;
    }
    
    /** SETTER
     * The IPs full hostname (PTR)
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
     * A description of the provider (usually extracted from the providers website)
     */
    @JsonGetter("providerDescription")
    public String getProviderDescription ( ) { 
        return this.providerDescription;
    }
    
    /** SETTER
     * A description of the provider (usually extracted from the providers website)
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
     * True if this IP belongs to an internet service provider. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    @JsonGetter("isIsp")
    public boolean getIsIsp ( ) { 
        return this.isIsp;
    }
    
    /** SETTER
     * True if this IP belongs to an internet service provider. Note that this can still be true even if the provider type is VPN/proxy, this occurs in the case that the IP is detected as both types
     */
    @JsonSetter("isIsp")
    public void setIsIsp (boolean value) { 
        this.isIsp = value;
    }
 
    /** GETTER
     * ISO 3-letter country code
     */
    @JsonGetter("countryCode3")
    public String getCountryCode3 ( ) { 
        return this.countryCode3;
    }
    
    /** SETTER
     * ISO 3-letter country code
     */
    @JsonSetter("countryCode3")
    public void setCountryCode3 (String value) { 
        this.countryCode3 = value;
    }
 
    /** GETTER
     * ISO 4217 currency code associated with the country
     */
    @JsonGetter("currencyCode")
    public String getCurrencyCode ( ) { 
        return this.currencyCode;
    }
    
    /** SETTER
     * ISO 4217 currency code associated with the country
     */
    @JsonSetter("currencyCode")
    public void setCurrencyCode (String value) { 
        this.currencyCode = value;
    }
 
    /** GETTER
     * True if this IP ia a VPN
     */
    @JsonGetter("isVpn")
    public boolean getIsVpn ( ) { 
        return this.isVpn;
    }
    
    /** SETTER
     * True if this IP ia a VPN
     */
    @JsonSetter("isVpn")
    public void setIsVpn (boolean value) { 
        this.isVpn = value;
    }
 
    /** GETTER
     * True if this IP ia a proxy
     */
    @JsonGetter("isProxy")
    public boolean getIsProxy ( ) { 
        return this.isProxy;
    }
    
    /** SETTER
     * True if this IP ia a proxy
     */
    @JsonSetter("isProxy")
    public void setIsProxy (boolean value) { 
        this.isProxy = value;
    }
 
    /** GETTER
     * The autonomous system (AS) number
     */
    @JsonGetter("asn")
    public String getAsn ( ) { 
        return this.asn;
    }
    
    /** SETTER
     * The autonomous system (AS) number
     */
    @JsonSetter("asn")
    public void setAsn (String value) { 
        this.asn = value;
    }
 
    /** GETTER
     * The autonomous system (AS) CIDR range
     */
    @JsonGetter("asCidr")
    public String getAsCidr ( ) { 
        return this.asCidr;
    }
    
    /** SETTER
     * The autonomous system (AS) CIDR range
     */
    @JsonSetter("asCidr")
    public void setAsCidr (String value) { 
        this.asCidr = value;
    }
 
    /** GETTER
     * The autonomous system (AS) ISO 2-letter country code
     */
    @JsonGetter("asCountryCode")
    public String getAsCountryCode ( ) { 
        return this.asCountryCode;
    }
    
    /** SETTER
     * The autonomous system (AS) ISO 2-letter country code
     */
    @JsonSetter("asCountryCode")
    public void setAsCountryCode (String value) { 
        this.asCountryCode = value;
    }
 
    /** GETTER
     * The autonomous system (AS) ISO 3-letter country code
     */
    @JsonGetter("asCountryCode3")
    public String getAsCountryCode3 ( ) { 
        return this.asCountryCode3;
    }
    
    /** SETTER
     * The autonomous system (AS) ISO 3-letter country code
     */
    @JsonSetter("asCountryCode3")
    public void setAsCountryCode3 (String value) { 
        this.asCountryCode3 = value;
    }
 
    /** GETTER
     * Array of all the domains associated with the autonomous system (AS)
     */
    @JsonGetter("asDomains")
    public List<String> getAsDomains ( ) { 
        return this.asDomains;
    }
    
    /** SETTER
     * Array of all the domains associated with the autonomous system (AS)
     */
    @JsonSetter("asDomains")
    public void setAsDomains (List<String> value) { 
        this.asDomains = value;
    }
 
    /** GETTER
     * The autonomous system (AS) description / company name
     */
    @JsonGetter("asDescription")
    public String getAsDescription ( ) { 
        return this.asDescription;
    }
    
    /** SETTER
     * The autonomous system (AS) description / company name
     */
    @JsonSetter("asDescription")
    public void setAsDescription (String value) { 
        this.asDescription = value;
    }
 
    /** GETTER
     * The age of the autonomous system (AS) in number of years since registration
     */
    @JsonGetter("asAge")
    public int getAsAge ( ) { 
        return this.asAge;
    }
    
    /** SETTER
     * The age of the autonomous system (AS) in number of years since registration
     */
    @JsonSetter("asAge")
    public void setAsAge (int value) { 
        this.asAge = value;
    }
 
    /** GETTER
     * The IPs host domain
     */
    @JsonGetter("hostDomain")
    public String getHostDomain ( ) { 
        return this.hostDomain;
    }
    
    /** SETTER
     * The IPs host domain
     */
    @JsonSetter("hostDomain")
    public void setHostDomain (String value) { 
        this.hostDomain = value;
    }
 
    /** GETTER
     * The domain of the VPN provider (may be empty if the VPN domain is not detectable)
     */
    @JsonGetter("vpnDomain")
    public String getVpnDomain ( ) { 
        return this.vpnDomain;
    }
    
    /** SETTER
     * The domain of the VPN provider (may be empty if the VPN domain is not detectable)
     */
    @JsonSetter("vpnDomain")
    public void setVpnDomain (String value) { 
        this.vpnDomain = value;
    }
 
}
