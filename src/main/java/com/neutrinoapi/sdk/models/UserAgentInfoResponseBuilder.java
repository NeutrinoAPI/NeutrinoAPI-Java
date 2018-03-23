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
     * Mobile device screen width (in px)
     */
    public UserAgentInfoResponseBuilder mobileScreenWidth(int mobileScreenWidth) {
        userAgentInfoResponse.setMobileScreenWidth(mobileScreenWidth);
        return this;
    }

    /**
     * Mobile device brand
     */
    public UserAgentInfoResponseBuilder mobileBrand(String mobileBrand) {
        userAgentInfoResponse.setMobileBrand(mobileBrand);
        return this;
    }

    /**
     * Mobile device model
     */
    public UserAgentInfoResponseBuilder mobileModel(String mobileModel) {
        userAgentInfoResponse.setMobileModel(mobileModel);
        return this;
    }

    /**
     * Producer or manufacturer
     */
    public UserAgentInfoResponseBuilder producer(String producer) {
        userAgentInfoResponse.setProducer(producer);
        return this;
    }

    /**
     * Browser software name
     */
    public UserAgentInfoResponseBuilder browserName(String browserName) {
        userAgentInfoResponse.setBrowserName(browserName);
        return this;
    }

    /**
     * Mobile device screen height (in px)
     */
    public UserAgentInfoResponseBuilder mobileScreenHeight(int mobileScreenHeight) {
        userAgentInfoResponse.setMobileScreenHeight(mobileScreenHeight);
        return this;
    }

    /**
     * True if this is a mobile user-agent
     */
    public UserAgentInfoResponseBuilder isMobile(boolean isMobile) {
        userAgentInfoResponse.setIsMobile(isMobile);
        return this;
    }

    /**
     * The user-agent type, possible values are: desktop-browser, email-client, feed-reader, software-library, media-player, mobile-browser, robot, unknown
     */
    public UserAgentInfoResponseBuilder type(String type) {
        userAgentInfoResponse.setType(type);
        return this;
    }

    /**
     * Software version
     */
    public UserAgentInfoResponseBuilder version(String version) {
        userAgentInfoResponse.setVersion(version);
        return this;
    }

    /**
     * Operating system
     */
    public UserAgentInfoResponseBuilder operatingSystem(String operatingSystem) {
        userAgentInfoResponse.setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * Mobile device browser
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