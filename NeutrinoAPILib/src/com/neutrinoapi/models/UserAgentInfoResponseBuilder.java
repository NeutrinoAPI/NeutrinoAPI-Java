/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

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
     * Browser software name
     */
    public UserAgentInfoResponseBuilder browserName(String browserName) {
        userAgentInfoResponse.setBrowserName(browserName);
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
     * Mobile device brand
     */
    public UserAgentInfoResponseBuilder mobileBrand(String mobileBrand) {
        userAgentInfoResponse.setMobileBrand(mobileBrand);
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
     * Mobile device model
     */
    public UserAgentInfoResponseBuilder mobileModel(String mobileModel) {
        userAgentInfoResponse.setMobileModel(mobileModel);
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
     * Mobile device screen width (in px)
     */
    public UserAgentInfoResponseBuilder mobileScreenWidth(int mobileScreenWidth) {
        userAgentInfoResponse.setMobileScreenWidth(mobileScreenWidth);
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
     * Producer or manufacturer
     */
    public UserAgentInfoResponseBuilder producer(String producer) {
        userAgentInfoResponse.setProducer(producer);
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
     * Build the instance with the given values
     */
    public UserAgentInfoResponse build() {
        return userAgentInfoResponse;
    }
}