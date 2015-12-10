/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;

public class URLInfoResponseBuilder {
    //the instance to build
    private URLInfoResponse uRLInfoResponse;

    /**
     * Default constructor to initialize the instance
     */
    public URLInfoResponseBuilder() {
        uRLInfoResponse = new URLInfoResponse();
    }

    /**
     * The encoding type the URL uses
     */
    public URLInfoResponseBuilder contentEncoding(String contentEncoding) {
        uRLInfoResponse.setContentEncoding(contentEncoding);
        return this;
    }

    /**
     * The size of the URL content in bytes
     */
    public URLInfoResponseBuilder contentSize(int contentSize) {
        uRLInfoResponse.setContentSize(contentSize);
        return this;
    }

    /**
     * The content-type the URL points to
     */
    public URLInfoResponseBuilder contentType(String contentType) {
        uRLInfoResponse.setContentType(contentType);
        return this;
    }

    /**
     * True if this URL responded with an HTTP OK (200) status
     */
    public URLInfoResponseBuilder httpOk(boolean httpOk) {
        uRLInfoResponse.setHttpOk(httpOk);
        return this;
    }

    /**
     * True if this URL responded with a HTTP redirect
     */
    public URLInfoResponseBuilder httpRedirect(boolean httpRedirect) {
        uRLInfoResponse.setHttpRedirect(httpRedirect);
        return this;
    }

    /**
     * The HTTP status code this URL responded with
     */
    public URLInfoResponseBuilder httpStatus(int httpStatus) {
        uRLInfoResponse.setHttpStatus(httpStatus);
        return this;
    }

    /**
     * The HTTP status message assoicated with the status code
     */
    public URLInfoResponseBuilder httpStatusMessage(String httpStatusMessage) {
        uRLInfoResponse.setHttpStatusMessage(httpStatusMessage);
        return this;
    }

    /**
     * The time taken to load the URL content (in seconds)
     */
    public URLInfoResponseBuilder loadTime(double loadTime) {
        uRLInfoResponse.setLoadTime(loadTime);
        return this;
    }

    /**
     * A key:value map of the URL query paramaters
     */
    public URLInfoResponseBuilder query(LinkedHashMap<String, Object> query) {
        uRLInfoResponse.setQuery(query);
        return this;
    }

    /**
     * Is this URL actually serving real content
     */
    public URLInfoResponseBuilder real(boolean real) {
        uRLInfoResponse.setReal(real);
        return this;
    }

    /**
     * Server IP geo-location: full city name (if detectable)
     */
    public URLInfoResponseBuilder serverCity(String serverCity) {
        uRLInfoResponse.setServerCity(serverCity);
        return this;
    }

    /**
     * Server IP geo-location: full country name
     */
    public URLInfoResponseBuilder serverCountry(String serverCountry) {
        uRLInfoResponse.setServerCountry(serverCountry);
        return this;
    }

    /**
     * Server IP geo-location: ISO 2-letter country code
     */
    public URLInfoResponseBuilder serverCountryCode(String serverCountryCode) {
        uRLInfoResponse.setServerCountryCode(serverCountryCode);
        return this;
    }

    /**
     * The server hostname (PTR)
     */
    public URLInfoResponseBuilder serverHostname(String serverHostname) {
        uRLInfoResponse.setServerHostname(serverHostname);
        return this;
    }

    /**
     * The IP address of the server hosting this URL
     */
    public URLInfoResponseBuilder serverIp(String serverIp) {
        uRLInfoResponse.setServerIp(serverIp);
        return this;
    }

    /**
     * The name of the server software hosting this URL
     */
    public URLInfoResponseBuilder serverName(String serverName) {
        uRLInfoResponse.setServerName(serverName);
        return this;
    }

    /**
     * Server IP geo-location: full region name (if detectable)
     */
    public URLInfoResponseBuilder serverRegion(String serverRegion) {
        uRLInfoResponse.setServerRegion(serverRegion);
        return this;
    }

    /**
     * The fully qualified URL. This may be different to the URL requested if http-redirect is True
     */
    public URLInfoResponseBuilder url(String url) {
        uRLInfoResponse.setUrl(url);
        return this;
    }

    /**
     * The URL path
     */
    public URLInfoResponseBuilder urlPath(String urlPath) {
        uRLInfoResponse.setUrlPath(urlPath);
        return this;
    }

    /**
     * The URL port
     */
    public URLInfoResponseBuilder urlPort(int urlPort) {
        uRLInfoResponse.setUrlPort(urlPort);
        return this;
    }

    /**
     * The URL protocol (usually http or https)
     */
    public URLInfoResponseBuilder urlProtocol(String urlProtocol) {
        uRLInfoResponse.setUrlProtocol(urlProtocol);
        return this;
    }

    /**
     * Is this a valid well-formed URL
     */
    public URLInfoResponseBuilder valid(boolean valid) {
        uRLInfoResponse.setValid(valid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public URLInfoResponse build() {
        return uRLInfoResponse;
    }
}