/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class BlacklistBuilder {
    //the instance to build
    private Blacklist blacklist;

    /**
     * Default constructor to initialize the instance
     */
    public BlacklistBuilder() {
        blacklist = new Blacklist();
    }

    /**
     * true if listed, false if not
     */
    public BlacklistBuilder isListed(boolean isListed) {
        blacklist.setIsListed(isListed);
        return this;
    }

    /**
     * the domain/hostname of the DNSBL
     */
    public BlacklistBuilder listHost(String listHost) {
        blacklist.setListHost(listHost);
        return this;
    }

    /**
     * the list rating [1-3] with 1 being the best rating and 3 the lowest rating
     */
    public BlacklistBuilder listRating(int listRating) {
        blacklist.setListRating(listRating);
        return this;
    }

    /**
     * the name of the DNSBL
     */
    public BlacklistBuilder listName(String listName) {
        blacklist.setListName(listName);
        return this;
    }

    /**
     * the TXT record returned for this listing (if listed)
     */
    public BlacklistBuilder txtRecord(String txtRecord) {
        blacklist.setTxtRecord(txtRecord);
        return this;
    }

    /**
     * the DNSBL server response time in milliseconds
     */
    public BlacklistBuilder responseTime(int responseTime) {
        blacklist.setResponseTime(responseTime);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Blacklist build() {
        return blacklist;
    }
}