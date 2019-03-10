/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class UserAgentInfoResponseBuilder {
    //the instance to build
    private UserAgentInfoResponse userAgentInfoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public UserAgentInfoResponseBuilder() {
        userAgentInfoResponse = new UserAgentInfoResponse();
    }

    /**
     * The estimated mobile device screen width in CSS 'px'
     */
    public UserAgentInfoResponseBuilder mobileScreenWidth(int mobileScreenWidth) {
        userAgentInfoResponse.setMobileScreenWidth(mobileScreenWidth);
        return this;
    }

    /**
     * The mobile device brand
     */
    public UserAgentInfoResponseBuilder mobileBrand(String mobileBrand) {
        userAgentInfoResponse.setMobileBrand(mobileBrand);
        return this;
    }

    /**
     * The mobile device model
     */
    public UserAgentInfoResponseBuilder mobileModel(String mobileModel) {
        userAgentInfoResponse.setMobileModel(mobileModel);
        return this;
    }

    /**
     * The producer or manufacturer of the user agent
     */
    public UserAgentInfoResponseBuilder producer(String producer) {
        userAgentInfoResponse.setProducer(producer);
        return this;
    }

    /**
     * The browser software name
     */
    public UserAgentInfoResponseBuilder browserName(String browserName) {
        userAgentInfoResponse.setBrowserName(browserName);
        return this;
    }

    /**
     * The estimated mobile device screen height in CSS 'px'
     */
    public UserAgentInfoResponseBuilder mobileScreenHeight(int mobileScreenHeight) {
        userAgentInfoResponse.setMobileScreenHeight(mobileScreenHeight);
        return this;
    }

    /**
     * True if this is a mobile user agent
     */
    public UserAgentInfoResponseBuilder isMobile(boolean isMobile) {
        userAgentInfoResponse.setIsMobile(isMobile);
        return this;
    }

    /**
     * The user agent type, possible values are:<br/><ul><li>desktop-browser</li><li>mobile-browser</li><li>email-client</li><li>feed-reader</li><li>software-library</li><li>media-player (includes smart TVs)</li><li>robot</li><li>unknown</li></ul>
     */
    public UserAgentInfoResponseBuilder type(String type) {
        userAgentInfoResponse.setType(type);
        return this;
    }

    /**
     * The browser software version
     */
    public UserAgentInfoResponseBuilder version(String version) {
        userAgentInfoResponse.setVersion(version);
        return this;
    }

    /**
     * The full operating system name which may include the major version number or code name
     */
    public UserAgentInfoResponseBuilder operatingSystem(String operatingSystem) {
        userAgentInfoResponse.setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * The mobile device browser name (this is usually the same as the browser name)
     */
    public UserAgentInfoResponseBuilder mobileBrowser(String mobileBrowser) {
        userAgentInfoResponse.setMobileBrowser(mobileBrowser);
        return this;
    }

    /**
     * True if this is an Android based mobile user agent
     */
    public UserAgentInfoResponseBuilder isAndroid(boolean isAndroid) {
        userAgentInfoResponse.setIsAndroid(isAndroid);
        return this;
    }

    /**
     * True if this is an iOS based mobile user agent
     */
    public UserAgentInfoResponseBuilder isIos(boolean isIos) {
        userAgentInfoResponse.setIsIos(isIos);
        return this;
    }

    /**
     * The operating system family name, this is the OS name without any version information
     */
    public UserAgentInfoResponseBuilder operatingSystemFamily(String operatingSystemFamily) {
        userAgentInfoResponse.setOperatingSystemFamily(operatingSystemFamily);
        return this;
    }

    /**
     * The operating system version number (if detectable)
     */
    public UserAgentInfoResponseBuilder operatingSystemVersion(String operatingSystemVersion) {
        userAgentInfoResponse.setOperatingSystemVersion(operatingSystemVersion);
        return this;
    }

    /**
     * The browser engine name
     */
    public UserAgentInfoResponseBuilder engine(String engine) {
        userAgentInfoResponse.setEngine(engine);
        return this;
    }

    /**
     * The browser engine version (if detectable)
     */
    public UserAgentInfoResponseBuilder engineVersion(String engineVersion) {
        userAgentInfoResponse.setEngineVersion(engineVersion);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserAgentInfoResponse build() {
        return userAgentInfoResponse;
    }
}