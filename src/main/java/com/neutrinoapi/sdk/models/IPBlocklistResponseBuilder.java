/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class IPBlocklistResponseBuilder {
    //the instance to build
    private IPBlocklistResponse iPBlocklistResponse;

    /**
     * Default constructor to initialize the instance
     */
    public IPBlocklistResponseBuilder() {
        iPBlocklistResponse = new IPBlocklistResponse();
    }

    /**
     * The IP address
     */
    public IPBlocklistResponseBuilder ip(String ip) {
        iPBlocklistResponse.setIp(ip);
        return this;
    }

    /**
     * IP is hosting a malicious bot or is part of a botnet. Includes brute-force crackers
     */
    public IPBlocklistResponseBuilder isBot(boolean isBot) {
        iPBlocklistResponse.setIsBot(isBot);
        return this;
    }

    /**
     * IP is hosting an exploit finding bot or is running exploit scanning software
     */
    public IPBlocklistResponseBuilder isExploitBot(boolean isExploitBot) {
        iPBlocklistResponse.setIsExploitBot(isExploitBot);
        return this;
    }

    /**
     * IP is involved in distributing or is running malware
     */
    public IPBlocklistResponseBuilder isMalware(boolean isMalware) {
        iPBlocklistResponse.setIsMalware(isMalware);
        return this;
    }

    /**
     * IP is running a hostile web spider / web crawler
     */
    public IPBlocklistResponseBuilder isSpider(boolean isSpider) {
        iPBlocklistResponse.setIsSpider(isSpider);
        return this;
    }

    /**
     * IP has been flagged as an attack source on DShield (dshield.org)
     */
    public IPBlocklistResponseBuilder isDshield(boolean isDshield) {
        iPBlocklistResponse.setIsDshield(isDshield);
        return this;
    }

    /**
     * The number of blocklists the IP is listed on
     */
    public IPBlocklistResponseBuilder listCount(int listCount) {
        iPBlocklistResponse.setListCount(listCount);
        return this;
    }

    /**
     * IP has been detected as an anonymous web proxy or anonymous HTTP proxy
     */
    public IPBlocklistResponseBuilder isProxy(boolean isProxy) {
        iPBlocklistResponse.setIsProxy(isProxy);
        return this;
    }

    /**
     * IP is part of a hijacked netblock or a netblock controlled by a criminal organization
     */
    public IPBlocklistResponseBuilder isHijacked(boolean isHijacked) {
        iPBlocklistResponse.setIsHijacked(isHijacked);
        return this;
    }

    /**
     * IP is a Tor node or running a Tor related service
     */
    public IPBlocklistResponseBuilder isTor(boolean isTor) {
        iPBlocklistResponse.setIsTor(isTor);
        return this;
    }

    /**
     * IP is involved in distributing or is running spyware
     */
    public IPBlocklistResponseBuilder isSpyware(boolean isSpyware) {
        iPBlocklistResponse.setIsSpyware(isSpyware);
        return this;
    }

    /**
     * IP address is hosting a spam bot, comment spamming or any other spamming type software
     */
    public IPBlocklistResponseBuilder isSpamBot(boolean isSpamBot) {
        iPBlocklistResponse.setIsSpamBot(isSpamBot);
        return this;
    }

    /**
     * Is this IP on a blocklist
     */
    public IPBlocklistResponseBuilder isListed(boolean isListed) {
        iPBlocklistResponse.setIsListed(isListed);
        return this;
    }

    /**
     * IP belongs to a VPN provider. This field is only kept for backward compatibility, for VPN detection use the <a href="https://www.neutrinoapi.com/api/ip-probe/">IP Probe</a> API
     */
    public IPBlocklistResponseBuilder isVpn(boolean isVpn) {
        iPBlocklistResponse.setIsVpn(isVpn);
        return this;
    }

    /**
     * The last time this IP was seen on a blocklist (in Unix time or 0 if not listed recently)
     */
    public IPBlocklistResponseBuilder lastSeen(int lastSeen) {
        iPBlocklistResponse.setLastSeen(lastSeen);
        return this;
    }

    /**
     * An array of strings indicating which blocklists this IP is listed on (empty if not listed)
     */
    public IPBlocklistResponseBuilder blocklists(List<String> blocklists) {
        iPBlocklistResponse.setBlocklists(blocklists);
        return this;
    }

    /**
     * An array of objects containing details on which sensors were used to detect this IP
     */
    public IPBlocklistResponseBuilder sensors(List<String> sensors) {
        iPBlocklistResponse.setSensors(sensors);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public IPBlocklistResponse build() {
        return iPBlocklistResponse;
    }
}