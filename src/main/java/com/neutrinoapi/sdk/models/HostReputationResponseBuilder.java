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
     * An array of objects for each DNSBL checked, with the following keys: <ul> <li>is-listed - true if listed, false if not</li> <li>list-name - the name of the DNSBL</li> <li>list-host - the domain/hostname of the DNSBL</li> <li>list-rating - the list rating [1-3] with 1 being the best rating and 3 the lowest rating</li> <li>txt-record - the TXT record returned for this listing (if listed)</li> <li>return-code - the specific return code for this listing (if listed)</li> <li>response-time - the DNSBL server response time in milliseconds</li> </ul>
     */
    public HostReputationResponseBuilder lists(List<Blacklist> lists) {
        hostReputationResponse.setLists(lists);
        return this;
    }

    /**
     * The number of DNSBLs the host is listed on
     */
    public HostReputationResponseBuilder listCount(int listCount) {
        hostReputationResponse.setListCount(listCount);
        return this;
    }

    /**
     * The IP address or host name
     */
    public HostReputationResponseBuilder host(String host) {
        hostReputationResponse.setHost(host);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HostReputationResponse build() {
        return hostReputationResponse;
    }
}