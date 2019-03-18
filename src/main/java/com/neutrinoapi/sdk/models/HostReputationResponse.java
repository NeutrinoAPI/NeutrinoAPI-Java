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
public class HostReputationResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2594551624965169793L;
    private boolean isListed;
    private List<Blacklist> lists;
    private int listCount;
    private String host;
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
     * An array of objects for each DNSBL checked, with the following keys:<ul><li>is-listed - true if listed, false if not</li><li>list-name - the name of the DNSBL</li><li>list-host - the domain/hostname of the DNSBL</li><li>list-rating - the list rating [1-3] with 1 being the best rating and 3 the lowest rating</li><li>txt-record - the TXT record returned for this listing (if listed)</li><li>return-code - the specific return code for this listing (if listed)</li><li>response-time - the DNSBL server response time in milliseconds</li></ul>
     */
    @JsonGetter("lists")
    public List<Blacklist> getLists ( ) { 
        return this.lists;
    }
    
    /** SETTER
     * An array of objects for each DNSBL checked, with the following keys:<ul><li>is-listed - true if listed, false if not</li><li>list-name - the name of the DNSBL</li><li>list-host - the domain/hostname of the DNSBL</li><li>list-rating - the list rating [1-3] with 1 being the best rating and 3 the lowest rating</li><li>txt-record - the TXT record returned for this listing (if listed)</li><li>return-code - the specific return code for this listing (if listed)</li><li>response-time - the DNSBL server response time in milliseconds</li></ul>
     */
    @JsonSetter("lists")
    public void setLists (List<Blacklist> value) { 
        this.lists = value;
    }
 
    /** GETTER
     * The number of DNSBLs the host is listed on
     */
    @JsonGetter("listCount")
    public int getListCount ( ) { 
        return this.listCount;
    }
    
    /** SETTER
     * The number of DNSBLs the host is listed on
     */
    @JsonSetter("listCount")
    public void setListCount (int value) { 
        this.listCount = value;
    }
 
    /** GETTER
     * The IP address or host name
     */
    @JsonGetter("host")
    public String getHost ( ) { 
        return this.host;
    }
    
    /** SETTER
     * The IP address or host name
     */
    @JsonSetter("host")
    public void setHost (String value) { 
        this.host = value;
    }
 
}
