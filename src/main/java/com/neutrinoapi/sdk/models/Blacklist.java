/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Blacklist 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2235891723137896456L;
    private boolean isListed;
    private String listHost;
    private int listRating;
    private String listName;
    private String txtRecord;
    private String returnCode;
    private int responseTime;
    /** GETTER
     * true if listed, false if not
     */
    @JsonGetter("isListed")
    public boolean getIsListed ( ) { 
        return this.isListed;
    }
    
    /** SETTER
     * true if listed, false if not
     */
    @JsonSetter("isListed")
    public void setIsListed (boolean value) { 
        this.isListed = value;
    }
 
    /** GETTER
     * the domain/hostname of the DNSBL
     */
    @JsonGetter("listHost")
    public String getListHost ( ) { 
        return this.listHost;
    }
    
    /** SETTER
     * the domain/hostname of the DNSBL
     */
    @JsonSetter("listHost")
    public void setListHost (String value) { 
        this.listHost = value;
    }
 
    /** GETTER
     * the list rating [1-3] with 1 being the best rating and 3 the lowest rating
     */
    @JsonGetter("listRating")
    public int getListRating ( ) { 
        return this.listRating;
    }
    
    /** SETTER
     * the list rating [1-3] with 1 being the best rating and 3 the lowest rating
     */
    @JsonSetter("listRating")
    public void setListRating (int value) { 
        this.listRating = value;
    }
 
    /** GETTER
     * the name of the DNSBL
     */
    @JsonGetter("listName")
    public String getListName ( ) { 
        return this.listName;
    }
    
    /** SETTER
     * the name of the DNSBL
     */
    @JsonSetter("listName")
    public void setListName (String value) { 
        this.listName = value;
    }
 
    /** GETTER
     * the TXT record returned for this listing (if listed)
     */
    @JsonGetter("txtRecord")
    public String getTxtRecord ( ) { 
        return this.txtRecord;
    }
    
    /** SETTER
     * the TXT record returned for this listing (if listed)
     */
    @JsonSetter("txtRecord")
    public void setTxtRecord (String value) { 
        this.txtRecord = value;
    }
 
    /** GETTER
     * the specific return code for this listing (if listed)
     */
    @JsonGetter("returnCode")
    public String getReturnCode ( ) { 
        return this.returnCode;
    }
    
    /** SETTER
     * the specific return code for this listing (if listed)
     */
    @JsonSetter("returnCode")
    public void setReturnCode (String value) { 
        this.returnCode = value;
    }
 
    /** GETTER
     * the DNSBL server response time in milliseconds
     */
    @JsonGetter("responseTime")
    public int getResponseTime ( ) { 
        return this.responseTime;
    }
    
    /** SETTER
     * the DNSBL server response time in milliseconds
     */
    @JsonSetter("responseTime")
    public void setResponseTime (int value) { 
        this.responseTime = value;
    }
 
}
