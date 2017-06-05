/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UserAgentInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5018351310497482712L;
    private int mobileScreenWidth;
    private String mobileBrand;
    private String mobileModel;
    private String producer;
    private String browserName;
    private int mobileScreenHeight;
    private boolean isMobile;
    private String type;
    private String version;
    private String operatingSystem;
    private String mobileBrowser;
    private boolean isAndroid;
    private boolean isIos;
    private String operatingSystemFamily;
    private String operatingSystemVersion;
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
     * True if this is an Android based mobile user agent
     */
    @JsonGetter("isAndroid")
    public boolean getIsAndroid ( ) { 
        return this.isAndroid;
    }
    
    /** SETTER
     * True if this is an Android based mobile user agent
     */
    @JsonSetter("isAndroid")
    public void setIsAndroid (boolean value) { 
        this.isAndroid = value;
    }
 
    /** GETTER
     * True if this is an iOS based mobile user agent
     */
    @JsonGetter("isIos")
    public boolean getIsIos ( ) { 
        return this.isIos;
    }
    
    /** SETTER
     * True if this is an iOS based mobile user agent
     */
    @JsonSetter("isIos")
    public void setIsIos (boolean value) { 
        this.isIos = value;
    }
 
    /** GETTER
     * The operating system family name, this is the OS name without any version information
     */
    @JsonGetter("operatingSystemFamily")
    public String getOperatingSystemFamily ( ) { 
        return this.operatingSystemFamily;
    }
    
    /** SETTER
     * The operating system family name, this is the OS name without any version information
     */
    @JsonSetter("operatingSystemFamily")
    public void setOperatingSystemFamily (String value) { 
        this.operatingSystemFamily = value;
    }
 
    /** GETTER
     * The operating system version number (if detectable)
     */
    @JsonGetter("operatingSystemVersion")
    public String getOperatingSystemVersion ( ) { 
        return this.operatingSystemVersion;
    }
    
    /** SETTER
     * The operating system version number (if detectable)
     */
    @JsonSetter("operatingSystemVersion")
    public void setOperatingSystemVersion (String value) { 
        this.operatingSystemVersion = value;
    }
 
}
 