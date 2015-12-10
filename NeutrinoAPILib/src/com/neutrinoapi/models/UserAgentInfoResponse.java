/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserAgentInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5116428696629540402L;
    private String browserName;
    private boolean isMobile;
    private String mobileBrand;
    private String mobileBrowser;
    private String mobileModel;
    private int mobileScreenHeight;
    private int mobileScreenWidth;
    private String operatingSystem;
    private String producer;
    private String type;
    private String version;
    /** GETTER
     * Browser software name
     */
    @JsonGetter("browserName")
    public String getBrowserName ( ) { 
        return this.browserName;
    }
    
    /** SETTER
     * Browser software name
     */
    @JsonSetter("browserName")
    public void setBrowserName (String value) { 
        this.browserName = value;
    }
 
    /** GETTER
     * True if this is a mobile user-agent
     */
    @JsonGetter("isMobile")
    public boolean getIsMobile ( ) { 
        return this.isMobile;
    }
    
    /** SETTER
     * True if this is a mobile user-agent
     */
    @JsonSetter("isMobile")
    public void setIsMobile (boolean value) { 
        this.isMobile = value;
    }
 
    /** GETTER
     * Mobile device brand
     */
    @JsonGetter("mobileBrand")
    public String getMobileBrand ( ) { 
        return this.mobileBrand;
    }
    
    /** SETTER
     * Mobile device brand
     */
    @JsonSetter("mobileBrand")
    public void setMobileBrand (String value) { 
        this.mobileBrand = value;
    }
 
    /** GETTER
     * Mobile device browser
     */
    @JsonGetter("mobileBrowser")
    public String getMobileBrowser ( ) { 
        return this.mobileBrowser;
    }
    
    /** SETTER
     * Mobile device browser
     */
    @JsonSetter("mobileBrowser")
    public void setMobileBrowser (String value) { 
        this.mobileBrowser = value;
    }
 
    /** GETTER
     * Mobile device model
     */
    @JsonGetter("mobileModel")
    public String getMobileModel ( ) { 
        return this.mobileModel;
    }
    
    /** SETTER
     * Mobile device model
     */
    @JsonSetter("mobileModel")
    public void setMobileModel (String value) { 
        this.mobileModel = value;
    }
 
    /** GETTER
     * Mobile device screen height (in px)
     */
    @JsonGetter("mobileScreenHeight")
    public int getMobileScreenHeight ( ) { 
        return this.mobileScreenHeight;
    }
    
    /** SETTER
     * Mobile device screen height (in px)
     */
    @JsonSetter("mobileScreenHeight")
    public void setMobileScreenHeight (int value) { 
        this.mobileScreenHeight = value;
    }
 
    /** GETTER
     * Mobile device screen width (in px)
     */
    @JsonGetter("mobileScreenWidth")
    public int getMobileScreenWidth ( ) { 
        return this.mobileScreenWidth;
    }
    
    /** SETTER
     * Mobile device screen width (in px)
     */
    @JsonSetter("mobileScreenWidth")
    public void setMobileScreenWidth (int value) { 
        this.mobileScreenWidth = value;
    }
 
    /** GETTER
     * Operating system
     */
    @JsonGetter("operatingSystem")
    public String getOperatingSystem ( ) { 
        return this.operatingSystem;
    }
    
    /** SETTER
     * Operating system
     */
    @JsonSetter("operatingSystem")
    public void setOperatingSystem (String value) { 
        this.operatingSystem = value;
    }
 
    /** GETTER
     * Producer or manufacturer
     */
    @JsonGetter("producer")
    public String getProducer ( ) { 
        return this.producer;
    }
    
    /** SETTER
     * Producer or manufacturer
     */
    @JsonSetter("producer")
    public void setProducer (String value) { 
        this.producer = value;
    }
 
    /** GETTER
     * The user-agent type, possible values are: desktop-browser, email-client, feed-reader, software-library, media-player, mobile-browser, robot, unknown
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The user-agent type, possible values are: desktop-browser, email-client, feed-reader, software-library, media-player, mobile-browser, robot, unknown
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * Software version
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * Software version
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
}
 