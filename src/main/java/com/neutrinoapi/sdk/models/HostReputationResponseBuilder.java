/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class HostReputationResponseBuilder {
    //the instance to build
    private HostReputationResponse hostReputationResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HostReputationResponseBuilder() {
        hostReputationResponse = new HostReputationResponse();
    }

    /**
     * Is this host blacklisted
     */
    public HostReputationResponseBuilder isListed(boolean isListed) {
        hostReputationResponse.setIsListed(isListed);
        return this;
    }

    /**
     * An array of objects for each DNSBL checked
     */
    public HostReputationResponseBuilder lists(List<Blacklist> lists) {
        hostReputationResponse.setLists(lists);
        return this;
    }

    /**
     * The number of DNSBL's the host is listed on
     */
    public HostReputationResponseBuilder listCount(int listCount) {
        hostReputationResponse.setListCount(listCount);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HostReputationResponse build() {
        return hostReputationResponse;
    }
}