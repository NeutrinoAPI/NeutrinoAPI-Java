/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Blacklist 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4845261164460322934L;
    private boolean isListed;
    private String listHost;
    private String listName;
    private int listRating;
    private String txtRecord;
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
 
}
 