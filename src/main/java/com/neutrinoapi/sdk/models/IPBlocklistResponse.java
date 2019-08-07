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
public class IPBlocklistResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 1675862861759315019L;
    private String ip;
    private boolean isBot;
    private boolean isExploitBot;
    private boolean isMalware;
    private boolean isSpider;
    private boolean isDshield;
    private int listCount;
    private boolean isProxy;
    private boolean isHijacked;
    private boolean isTor;
    private boolean isSpyware;
    private boolean isSpamBot;
    private boolean isListed;
    private boolean isVpn;
    private int lastSeen;
    private List<String> blocklists;
    private List<String> sensors;
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
     * IP is hosting a malicious bot or is part of a botnet. Includes brute-force crackers
     */
    @JsonGetter("isBot")
    public boolean getIsBot ( ) { 
        return this.isBot;
    }
    
    /** SETTER
     * IP is hosting a malicious bot or is part of a botnet. Includes brute-force crackers
     */
    @JsonSetter("isBot")
    public void setIsBot (boolean value) { 
        this.isBot = value;
    }
 
    /** GETTER
     * IP is hosting an exploit finding bot or is running exploit scanning software
     */
    @JsonGetter("isExploitBot")
    public boolean getIsExploitBot ( ) { 
        return this.isExploitBot;
    }
    
    /** SETTER
     * IP is hosting an exploit finding bot or is running exploit scanning software
     */
    @JsonSetter("isExploitBot")
    public void setIsExploitBot (boolean value) { 
        this.isExploitBot = value;
    }
 
    /** GETTER
     * IP is involved in distributing or is running malware
     */
    @JsonGetter("isMalware")
    public boolean getIsMalware ( ) { 
        return this.isMalware;
    }
    
    /** SETTER
     * IP is involved in distributing or is running malware
     */
    @JsonSetter("isMalware")
    public void setIsMalware (boolean value) { 
        this.isMalware = value;
    }
 
    /** GETTER
     * IP is running a hostile web spider / web crawler
     */
    @JsonGetter("isSpider")
    public boolean getIsSpider ( ) { 
        return this.isSpider;
    }
    
    /** SETTER
     * IP is running a hostile web spider / web crawler
     */
    @JsonSetter("isSpider")
    public void setIsSpider (boolean value) { 
        this.isSpider = value;
    }
 
    /** GETTER
     * IP has been flagged as an attack source on DShield (dshield.org)
     */
    @JsonGetter("isDshield")
    public boolean getIsDshield ( ) { 
        return this.isDshield;
    }
    
    /** SETTER
     * IP has been flagged as an attack source on DShield (dshield.org)
     */
    @JsonSetter("isDshield")
    public void setIsDshield (boolean value) { 
        this.isDshield = value;
    }
 
    /** GETTER
     * The number of blocklists the IP is listed on
     */
    @JsonGetter("listCount")
    public int getListCount ( ) { 
        return this.listCount;
    }
    
    /** SETTER
     * The number of blocklists the IP is listed on
     */
    @JsonSetter("listCount")
    public void setListCount (int value) { 
        this.listCount = value;
    }
 
    /** GETTER
     * IP has been detected as an anonymous web proxy or anonymous HTTP proxy
     */
    @JsonGetter("isProxy")
    public boolean getIsProxy ( ) { 
        return this.isProxy;
    }
    
    /** SETTER
     * IP has been detected as an anonymous web proxy or anonymous HTTP proxy
     */
    @JsonSetter("isProxy")
    public void setIsProxy (boolean value) { 
        this.isProxy = value;
    }
 
    /** GETTER
     * IP is part of a hijacked netblock or a netblock controlled by a criminal organization
     */
    @JsonGetter("isHijacked")
    public boolean getIsHijacked ( ) { 
        return this.isHijacked;
    }
    
    /** SETTER
     * IP is part of a hijacked netblock or a netblock controlled by a criminal organization
     */
    @JsonSetter("isHijacked")
    public void setIsHijacked (boolean value) { 
        this.isHijacked = value;
    }
 
    /** GETTER
     * IP is a Tor node or running a Tor related service
     */
    @JsonGetter("isTor")
    public boolean getIsTor ( ) { 
        return this.isTor;
    }
    
    /** SETTER
     * IP is a Tor node or running a Tor related service
     */
    @JsonSetter("isTor")
    public void setIsTor (boolean value) { 
        this.isTor = value;
    }
 
    /** GETTER
     * IP is involved in distributing or is running spyware
     */
    @JsonGetter("isSpyware")
    public boolean getIsSpyware ( ) { 
        return this.isSpyware;
    }
    
    /** SETTER
     * IP is involved in distributing or is running spyware
     */
    @JsonSetter("isSpyware")
    public void setIsSpyware (boolean value) { 
        this.isSpyware = value;
    }
 
    /** GETTER
     * IP address is hosting a spam bot, comment spamming or any other spamming type software
     */
    @JsonGetter("isSpamBot")
    public boolean getIsSpamBot ( ) { 
        return this.isSpamBot;
    }
    
    /** SETTER
     * IP address is hosting a spam bot, comment spamming or any other spamming type software
     */
    @JsonSetter("isSpamBot")
    public void setIsSpamBot (boolean value) { 
        this.isSpamBot = value;
    }
 
    /** GETTER
     * Is this IP on a blocklist
     */
    @JsonGetter("isListed")
    public boolean getIsListed ( ) { 
        return this.isListed;
    }
    
    /** SETTER
     * Is this IP on a blocklist
     */
    @JsonSetter("isListed")
    public void setIsListed (boolean value) { 
        this.isListed = value;
    }
 
    /** GETTER
     * IP has been detected as belonging to a VPN provider
     */
    @JsonGetter("isVpn")
    public boolean getIsVpn ( ) { 
        return this.isVpn;
    }
    
    /** SETTER
     * IP has been detected as belonging to a VPN provider
     */
    @JsonSetter("isVpn")
    public void setIsVpn (boolean value) { 
        this.isVpn = value;
    }
 
    /** GETTER
     * The last time this IP was seen on a blocklist (in Unix time or 0 if not listed recently)
     */
    @JsonGetter("lastSeen")
    public int getLastSeen ( ) { 
        return this.lastSeen;
    }
    
    /** SETTER
     * The last time this IP was seen on a blocklist (in Unix time or 0 if not listed recently)
     */
    @JsonSetter("lastSeen")
    public void setLastSeen (int value) { 
        this.lastSeen = value;
    }
 
    /** GETTER
     * An array of strings indicating which blocklists this IP is listed on (empty if not listed)
     */
    @JsonGetter("blocklists")
    public List<String> getBlocklists ( ) { 
        return this.blocklists;
    }
    
    /** SETTER
     * An array of strings indicating which blocklists this IP is listed on (empty if not listed)
     */
    @JsonSetter("blocklists")
    public void setBlocklists (List<String> value) { 
        this.blocklists = value;
    }
 
    /** GETTER
     * An array of objects containing details on which sensors were used to detect this IP
     */
    @JsonGetter("sensors")
    public List<String> getSensors ( ) { 
        return this.sensors;
    }
    
    /** SETTER
     * An array of objects containing details on which sensors were used to detect this IP
     */
    @JsonSetter("sensors")
    public void setSensors (List<String> value) { 
        this.sensors = value;
    }
 
}
