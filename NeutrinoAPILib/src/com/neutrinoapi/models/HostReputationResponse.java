/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class HostReputationResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5496226400711889356L;
    private boolean isListed;
    private int listCount;
    private List<Blacklist> lists;
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
 
}
 