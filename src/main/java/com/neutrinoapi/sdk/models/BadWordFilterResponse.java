/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BadWordFilterResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5012000721558972440L;
    private List<String> badWordsList;
    private int badWordsTotal;
    private String censoredContent;
    private boolean isBad;
    /** GETTER
     * Array of the bad words found
     */
    @JsonGetter("badWordsList")
    public List<String> getBadWordsList ( ) { 
        return this.badWordsList;
    }
    
    /** SETTER
     * Array of the bad words found
     */
    @JsonSetter("badWordsList")
    public void setBadWordsList (List<String> value) { 
        this.badWordsList = value;
    }
 
    /** GETTER
     * Total number of bad words detected
     */
    @JsonGetter("badWordsTotal")
    public int getBadWordsTotal ( ) { 
        return this.badWordsTotal;
    }
    
    /** SETTER
     * Total number of bad words detected
     */
    @JsonSetter("badWordsTotal")
    public void setBadWordsTotal (int value) { 
        this.badWordsTotal = value;
    }
 
    /** GETTER
     * The censored content (only set if censor-character has been set)
     */
    @JsonGetter("censoredContent")
    public String getCensoredContent ( ) { 
        return this.censoredContent;
    }
    
    /** SETTER
     * The censored content (only set if censor-character has been set)
     */
    @JsonSetter("censoredContent")
    public void setCensoredContent (String value) { 
        this.censoredContent = value;
    }
 
    /** GETTER
     * Does the text contain bad words
     */
    @JsonGetter("isBad")
    public boolean getIsBad ( ) { 
        return this.isBad;
    }
    
    /** SETTER
     * Does the text contain bad words
     */
    @JsonSetter("isBad")
    public void setIsBad (boolean value) { 
        this.isBad = value;
    }
 
}
 