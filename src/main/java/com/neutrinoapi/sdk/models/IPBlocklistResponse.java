/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class IPBlocklistResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4954316217036140533L;
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
     * IP is hosting a malicious bot or is part of a botnet
     */
    @JsonGetter("isBot")
    public boolean getIsBot ( ) { 
        return this.isBot;
    }
    
    /** SETTER
     * IP is hosting a malicious bot or is part of a botnet
     */
    @JsonSetter("isBot")
    public void setIsBot (boolean value) { 
        this.isBot = value;
    }
 
    /** GETTER
     * IP is hosting an exploit finding bot or exploit scanning software
     */
    @JsonGetter("isExploitBot")
    public boolean getIsExploitBot ( ) { 
        return this.isExploitBot;
    }
    
    /** SETTER
     * IP is hosting an exploit finding bot or exploit scanning software
     */
    @JsonSetter("isExploitBot")
    public void setIsExploitBot (boolean value) { 
        this.isExploitBot = value;
    }
 
    /** GETTER
     * IP is involved in distributing malware
     */
    @JsonGetter("isMalware")
    public boolean getIsMalware ( ) { 
        return this.isMalware;
    }
    
    /** SETTER
     * IP is involved in distributing malware
     */
    @JsonSetter("isMalware")
    public void setIsMalware (boolean value) { 
        this.isMalware = value;
    }
 
    /** GETTER
     * IP is a hostile spider or crawler
     */
    @JsonGetter("isSpider")
    public boolean getIsSpider ( ) { 
        return this.isSpider;
    }
    
    /** SETTER
     * IP is a hostile spider or crawler
     */
    @JsonSetter("isSpider")
    public void setIsSpider (boolean value) { 
        this.isSpider = value;
    }
 
    /** GETTER
     * IP has been flagged on DShield (dshield.org)
     */
    @JsonGetter("isDshield")
    public boolean getIsDshield ( ) { 
        return this.isDshield;
    }
    
    /** SETTER
     * IP has been flagged on DShield (dshield.org)
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
     * hijacked netblocks or netblocks controlled by criminal organizations
     */
    @JsonGetter("isHijacked")
    public boolean getIsHijacked ( ) { 
        return this.isHijacked;
    }
    
    /** SETTER
     * hijacked netblocks or netblocks controlled by criminal organizations
     */
    @JsonSetter("isHijacked")
    public void setIsHijacked (boolean value) { 
        this.isHijacked = value;
    }
 
    /** GETTER
     * IP is coming from a Tor node
     */
    @JsonGetter("isTor")
    public boolean getIsTor ( ) { 
        return this.isTor;
    }
    
    /** SETTER
     * IP is coming from a Tor node
     */
    @JsonSetter("isTor")
    public void setIsTor (boolean value) { 
        this.isTor = value;
    }
 
    /** GETTER
     * IP is being used by spyware, malware, botnets or for other malicious activities
     */
    @JsonGetter("isSpyware")
    public boolean getIsSpyware ( ) { 
        return this.isSpyware;
    }
    
    /** SETTER
     * IP is being used by spyware, malware, botnets or for other malicious activities
     */
    @JsonSetter("isSpyware")
    public void setIsSpyware (boolean value) { 
        this.isSpyware = value;
    }
 
    /** GETTER
     * IP address is hosting a spam bot, comment spamming or other spamming software
     */
    @JsonGetter("isSpamBot")
    public boolean getIsSpamBot ( ) { 
        return this.isSpamBot;
    }
    
    /** SETTER
     * IP address is hosting a spam bot, comment spamming or other spamming software
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
     * IP has been detected as coming from a VPN hosting provider
     */
    @JsonGetter("isVpn")
    public boolean getIsVpn ( ) { 
        return this.isVpn;
    }
    
    /** SETTER
     * IP has been detected as coming from a VPN hosting provider
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
 
}
 