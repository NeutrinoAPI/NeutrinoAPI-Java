/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HostReputationResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4903947687555187897L;
    private boolean isListed;
    private List<Blacklist> lists;
    private int listCount;
    /** GETTER
     * Is this host blacklisted
     */
    @JsonGetter("isListed")
    public boolean getIsListed ( ) { 
        return this.isListed;
    }
    
    /** SETTER
     * Is this host blacklisted
     */
    @JsonSetter("isListed")
    public void setIsListed (boolean value) { 
        this.isListed = value;
    }
 
    /** GETTER
     * An array of objects for each DNSBL checked
     */
    @JsonGetter("lists")
    public List<Blacklist> getLists ( ) { 
        return this.lists;
    }
    
    /** SETTER
     * An array of objects for each DNSBL checked
     */
    @JsonSetter("lists")
    public void setLists (List<Blacklist> value) { 
        this.lists = value;
    }
 
    /** GETTER
     * The number of DNSBL's the host is listed on
     */
    @JsonGetter("listCount")
    public int getListCount ( ) { 
        return this.listCount;
    }
    
    /** SETTER
     * The number of DNSBL's the host is listed on
     */
    @JsonSetter("listCount")
    public void setListCount (int value) { 
        this.listCount = value;
    }
 
}
 