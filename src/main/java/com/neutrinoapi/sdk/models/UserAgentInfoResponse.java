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
public class UserAgentInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 3122395078611339799L;
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
    private String engine;
    private String engineVersion;
    /** GETTER
     * The estimated mobile device screen width in CSS 'px'
     */
    @JsonGetter("mobileScreenWidth")
    public int getMobileScreenWidth ( ) { 
        return this.mobileScreenWidth;
    }
    
    /** SETTER
     * The estimated mobile device screen width in CSS 'px'
     */
    @JsonSetter("mobileScreenWidth")
    public void setMobileScreenWidth (int value) { 
        this.mobileScreenWidth = value;
    }
 
    /** GETTER
     * The mobile device brand
     */
    @JsonGetter("mobileBrand")
    public String getMobileBrand ( ) { 
        return this.mobileBrand;
    }
    
    /** SETTER
     * The mobile device brand
     */
    @JsonSetter("mobileBrand")
    public void setMobileBrand (String value) { 
        this.mobileBrand = value;
    }
 
    /** GETTER
     * The mobile device model
     */
    @JsonGetter("mobileModel")
    public String getMobileModel ( ) { 
        return this.mobileModel;
    }
    
    /** SETTER
     * The mobile device model
     */
    @JsonSetter("mobileModel")
    public void setMobileModel (String value) { 
        this.mobileModel = value;
    }
 
    /** GETTER
     * The producer or manufacturer of the user agent
     */
    @JsonGetter("producer")
    public String getProducer ( ) { 
        return this.producer;
    }
    
    /** SETTER
     * The producer or manufacturer of the user agent
     */
    @JsonSetter("producer")
    public void setProducer (String value) { 
        this.producer = value;
    }
 
    /** GETTER
     * The browser software name
     */
    @JsonGetter("browserName")
    public String getBrowserName ( ) { 
        return this.browserName;
    }
    
    /** SETTER
     * The browser software name
     */
    @JsonSetter("browserName")
    public void setBrowserName (String value) { 
        this.browserName = value;
    }
 
    /** GETTER
     * The estimated mobile device screen height in CSS 'px'
     */
    @JsonGetter("mobileScreenHeight")
    public int getMobileScreenHeight ( ) { 
        return this.mobileScreenHeight;
    }
    
    /** SETTER
     * The estimated mobile device screen height in CSS 'px'
     */
    @JsonSetter("mobileScreenHeight")
    public void setMobileScreenHeight (int value) { 
        this.mobileScreenHeight = value;
    }
 
    /** GETTER
     * True if this is a mobile user agent
     */
    @JsonGetter("isMobile")
    public boolean getIsMobile ( ) { 
        return this.isMobile;
    }
    
    /** SETTER
     * True if this is a mobile user agent
     */
    @JsonSetter("isMobile")
    public void setIsMobile (boolean value) { 
        this.isMobile = value;
    }
 
    /** GETTER
     * The user agent type, possible values are:<br/><ul><li>desktop-browser</li><li>mobile-browser</li><li>email-client</li><li>feed-reader</li><li>software-library</li><li>media-player (includes smart TVs)</li><li>robot</li><li>unknown</li></ul>
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * The user agent type, possible values are:<br/><ul><li>desktop-browser</li><li>mobile-browser</li><li>email-client</li><li>feed-reader</li><li>software-library</li><li>media-player (includes smart TVs)</li><li>robot</li><li>unknown</li></ul>
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * The browser software version
     */
    @JsonGetter("version")
    public String getVersion ( ) { 
        return this.version;
    }
    
    /** SETTER
     * The browser software version
     */
    @JsonSetter("version")
    public void setVersion (String value) { 
        this.version = value;
    }
 
    /** GETTER
     * The full operating system name which may include the major version number or code name
     */
    @JsonGetter("operatingSystem")
    public String getOperatingSystem ( ) { 
        return this.operatingSystem;
    }
    
    /** SETTER
     * The full operating system name which may include the major version number or code name
     */
    @JsonSetter("operatingSystem")
    public void setOperatingSystem (String value) { 
        this.operatingSystem = value;
    }
 
    /** GETTER
     * The mobile device browser name (this is usually the same as the browser name)
     */
    @JsonGetter("mobileBrowser")
    public String getMobileBrowser ( ) { 
        return this.mobileBrowser;
    }
    
    /** SETTER
     * The mobile device browser name (this is usually the same as the browser name)
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
 
    /** GETTER
     * The browser engine name
     */
    @JsonGetter("engine")
    public String getEngine ( ) { 
        return this.engine;
    }
    
    /** SETTER
     * The browser engine name
     */
    @JsonSetter("engine")
    public void setEngine (String value) { 
        this.engine = value;
    }
 
    /** GETTER
     * The browser engine version (if detectable)
     */
    @JsonGetter("engineVersion")
    public String getEngineVersion ( ) { 
        return this.engineVersion;
    }
    
    /** SETTER
     * The browser engine version (if detectable)
     */
    @JsonSetter("engineVersion")
    public void setEngineVersion (String value) { 
        this.engineVersion = value;
    }
 
}
