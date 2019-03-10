/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class BrowserBotResponseBuilder {
    //the instance to build
    private BrowserBotResponse browserBotResponse;

    /**
     * Default constructor to initialize the instance
     */
    public BrowserBotResponseBuilder() {
        browserBotResponse = new BrowserBotResponse();
    }

    /**
     * The page URL
     */
    public BrowserBotResponseBuilder url(String url) {
        browserBotResponse.setUrl(url);
        return this;
    }

    /**
     * The complete raw, decompressed and decoded page content. Usually will be either HTML, JSON or XML
     */
    public BrowserBotResponseBuilder content(String content) {
        browserBotResponse.setContent(content);
        return this;
    }

    /**
     * The document MIME type
     */
    public BrowserBotResponseBuilder mimeType(String mimeType) {
        browserBotResponse.setMimeType(mimeType);
        return this;
    }

    /**
     * The document title
     */
    public BrowserBotResponseBuilder title(String title) {
        browserBotResponse.setTitle(title);
        return this;
    }

    /**
     * True if an error has occurred loading the page. Check the 'error-message' field for details
     */
    public BrowserBotResponseBuilder isError(boolean isError) {
        browserBotResponse.setIsError(isError);
        return this;
    }

    /**
     * True if a timeout occurred while loading the page. You can set the timeout with the request parameter 'timeout'
     */
    public BrowserBotResponseBuilder isTimeout(boolean isTimeout) {
        browserBotResponse.setIsTimeout(isTimeout);
        return this;
    }

    /**
     * Contains the error message if an error has occurred ('is-error' will be true)
     */
    public BrowserBotResponseBuilder errorMessage(String errorMessage) {
        browserBotResponse.setErrorMessage(errorMessage);
        return this;
    }

    /**
     * The HTTP status code the URL returned
     */
    public BrowserBotResponseBuilder httpStatusCode(int httpStatusCode) {
        browserBotResponse.setHttpStatusCode(httpStatusCode);
        return this;
    }

    /**
     * The HTTP status message the URL returned
     */
    public BrowserBotResponseBuilder httpStatusMessage(String httpStatusMessage) {
        browserBotResponse.setHttpStatusMessage(httpStatusMessage);
        return this;
    }

    /**
     * True if the HTTP status is OK (200)
     */
    public BrowserBotResponseBuilder isHttpOk(boolean isHttpOk) {
        browserBotResponse.setIsHttpOk(isHttpOk);
        return this;
    }

    /**
     * True if the URL responded with an HTTP redirect
     */
    public BrowserBotResponseBuilder isHttpRedirect(boolean isHttpRedirect) {
        browserBotResponse.setIsHttpRedirect(isHttpRedirect);
        return this;
    }

    /**
     * The redirected URL if the URL responded with an HTTP redirect
     */
    public BrowserBotResponseBuilder httpRedirectUrl(String httpRedirectUrl) {
        browserBotResponse.setHttpRedirectUrl(httpRedirectUrl);
        return this;
    }

    /**
     * The HTTP servers IP address
     */
    public BrowserBotResponseBuilder serverIp(String serverIp) {
        browserBotResponse.setServerIp(serverIp);
        return this;
    }

    /**
     * The number of seconds taken to load the page (from initial request until DOM ready)
     */
    public BrowserBotResponseBuilder loadTime(int loadTime) {
        browserBotResponse.setLoadTime(loadTime);
        return this;
    }

    /**
     * Map containing all the HTTP response headers the URL responded with
     */
    public BrowserBotResponseBuilder responseHeaders(LinkedHashMap<String, String> responseHeaders) {
        browserBotResponse.setResponseHeaders(responseHeaders);
        return this;
    }

    /**
     * True if the page is secured using TLS/SSL
     */
    public BrowserBotResponseBuilder isSecure(boolean isSecure) {
        browserBotResponse.setIsSecure(isSecure);
        return this;
    }

    /**
     * Map containing details of the TLS/SSL setup
     */
    public BrowserBotResponseBuilder securityDetails(LinkedHashMap<String, String> securityDetails) {
        browserBotResponse.setSecurityDetails(securityDetails);
        return this;
    }

    /**
     * Array containing all the elements matching the supplied selector.<br/>Each element object will contain the text content, HTML content and all current element attributes
     */
    public BrowserBotResponseBuilder elements(List<String> elements) {
        browserBotResponse.setElements(elements);
        return this;
    }

    /**
     * If you executed any JavaScript this array holds the results as objects
     */
    public BrowserBotResponseBuilder execResults(List<String> execResults) {
        browserBotResponse.setExecResults(execResults);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public BrowserBotResponse build() {
        return browserBotResponse;
    }
}