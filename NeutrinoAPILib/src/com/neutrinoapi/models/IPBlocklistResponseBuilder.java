/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

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
     * IP is hosting a malicious bot or is part of a botnet
     */
    public IPBlocklistResponseBuilder isBot(boolean isBot) {
        iPBlocklistResponse.setIsBot(isBot);
        return this;
    }

    /**
     * IP has been flagged on DShield (dshield.org)
     */
    public IPBlocklistResponseBuilder isDshield(boolean isDshield) {
        iPBlocklistResponse.setIsDshield(isDshield);
        return this;
    }

    /**
     * IP is hosting an exploit finding bot or exploit scanning software
     */
    public IPBlocklistResponseBuilder isExploitBot(boolean isExploitBot) {
        iPBlocklistResponse.setIsExploitBot(isExploitBot);
        return this;
    }

    /**
     * hijacked netblocks or netblocks controlled by criminal organizations
     */
    public IPBlocklistResponseBuilder isHijacked(boolean isHijacked) {
        iPBlocklistResponse.setIsHijacked(isHijacked);
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
     * IP is involved in distributing malware
     */
    public IPBlocklistResponseBuilder isMalware(boolean isMalware) {
        iPBlocklistResponse.setIsMalware(isMalware);
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
     * IP address is hosting a spam bot, comment spamming or other spamming software
     */
    public IPBlocklistResponseBuilder isSpamBot(boolean isSpamBot) {
        iPBlocklistResponse.setIsSpamBot(isSpamBot);
        return this;
    }

    /**
     * IP is a hostile spider or crawler
     */
    public IPBlocklistResponseBuilder isSpider(boolean isSpider) {
        iPBlocklistResponse.setIsSpider(isSpider);
        return this;
    }

    /**
     * IP is being used by spyware, malware, botnets or for other malicious activities
     */
    public IPBlocklistResponseBuilder isSpyware(boolean isSpyware) {
        iPBlocklistResponse.setIsSpyware(isSpyware);
        return this;
    }

    /**
     * IP is coming from a Tor node
     */
    public IPBlocklistResponseBuilder isTor(boolean isTor) {
        iPBlocklistResponse.setIsTor(isTor);
        return this;
    }

    /**
     * IP has been detected as coming from a VPN hosting provider
     */
    public IPBlocklistResponseBuilder isVpn(boolean isVpn) {
        iPBlocklistResponse.setIsVpn(isVpn);
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
     * Build the instance with the given values
     */
    public IPBlocklistResponse build() {
        return iPBlocklistResponse;
    }
}