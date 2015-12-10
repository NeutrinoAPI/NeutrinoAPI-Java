/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

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
     * The number of DNSBL's the host is listed on
     */
    public HostReputationResponseBuilder listCount(int listCount) {
        hostReputationResponse.setListCount(listCount);
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
     * Build the instance with the given values
     */
    public HostReputationResponse build() {
        return hostReputationResponse;
    }
}