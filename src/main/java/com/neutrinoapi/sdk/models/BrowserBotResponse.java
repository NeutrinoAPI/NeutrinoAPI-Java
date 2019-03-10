/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BrowserBotResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 8540875543012418758L;
    private String url;
    private String content;
    private String mimeType;
    private String title;
    private boolean isError;
    private boolean isTimeout;
    private String errorMessage;
    private int httpStatusCode;
    private String httpStatusMessage;
    private boolean isHttpOk;
    private boolean isHttpRedirect;
    private String httpRedirectUrl;
    private String serverIp;
    private int loadTime;
    private LinkedHashMap<String, String> responseHeaders;
    private boolean isSecure;
    private LinkedHashMap<String, String> securityDetails;
    private List<String> elements;
    private List<String> execResults;
    /** GETTER
     * The page URL
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * The page URL
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * The complete raw, decompressed and decoded page content. Usually will be either HTML, JSON or XML
     */
    @JsonGetter("content")
    public String getContent ( ) { 
        return this.content;
    }
    
    /** SETTER
     * The complete raw, decompressed and decoded page content. Usually will be either HTML, JSON or XML
     */
    @JsonSetter("content")
    public void setContent (String value) { 
        this.content = value;
    }
 
    /** GETTER
     * The document MIME type
     */
    @JsonGetter("mimeType")
    public String getMimeType ( ) { 
        return this.mimeType;
    }
    
    /** SETTER
     * The document MIME type
     */
    @JsonSetter("mimeType")
    public void setMimeType (String value) { 
        this.mimeType = value;
    }
 
    /** GETTER
     * The document title
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * The document title
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * True if an error has occurred loading the page. Check the 'error-message' field for details
     */
    @JsonGetter("isError")
    public boolean getIsError ( ) { 
        return this.isError;
    }
    
    /** SETTER
     * True if an error has occurred loading the page. Check the 'error-message' field for details
     */
    @JsonSetter("isError")
    public void setIsError (boolean value) { 
        this.isError = value;
    }
 
    /** GETTER
     * True if a timeout occurred while loading the page. You can set the timeout with the request parameter 'timeout'
     */
    @JsonGetter("isTimeout")
    public boolean getIsTimeout ( ) { 
        return this.isTimeout;
    }
    
    /** SETTER
     * True if a timeout occurred while loading the page. You can set the timeout with the request parameter 'timeout'
     */
    @JsonSetter("isTimeout")
    public void setIsTimeout (boolean value) { 
        this.isTimeout = value;
    }
 
    /** GETTER
     * Contains the error message if an error has occurred ('is-error' will be true)
     */
    @JsonGetter("errorMessage")
    public String getErrorMessage ( ) { 
        return this.errorMessage;
    }
    
    /** SETTER
     * Contains the error message if an error has occurred ('is-error' will be true)
     */
    @JsonSetter("errorMessage")
    public void setErrorMessage (String value) { 
        this.errorMessage = value;
    }
 
    /** GETTER
     * The HTTP status code the URL returned
     */
    @JsonGetter("httpStatusCode")
    public int getHttpStatusCode ( ) { 
        return this.httpStatusCode;
    }
    
    /** SETTER
     * The HTTP status code the URL returned
     */
    @JsonSetter("httpStatusCode")
    public void setHttpStatusCode (int value) { 
        this.httpStatusCode = value;
    }
 
    /** GETTER
     * The HTTP status message the URL returned
     */
    @JsonGetter("httpStatusMessage")
    public String getHttpStatusMessage ( ) { 
        return this.httpStatusMessage;
    }
    
    /** SETTER
     * The HTTP status message the URL returned
     */
    @JsonSetter("httpStatusMessage")
    public void setHttpStatusMessage (String value) { 
        this.httpStatusMessage = value;
    }
 
    /** GETTER
     * True if the HTTP status is OK (200)
     */
    @JsonGetter("isHttpOk")
    public boolean getIsHttpOk ( ) { 
        return this.isHttpOk;
    }
    
    /** SETTER
     * True if the HTTP status is OK (200)
     */
    @JsonSetter("isHttpOk")
    public void setIsHttpOk (boolean value) { 
        this.isHttpOk = value;
    }
 
    /** GETTER
     * True if the URL responded with an HTTP redirect
     */
    @JsonGetter("isHttpRedirect")
    public boolean getIsHttpRedirect ( ) { 
        return this.isHttpRedirect;
    }
    
    /** SETTER
     * True if the URL responded with an HTTP redirect
     */
    @JsonSetter("isHttpRedirect")
    public void setIsHttpRedirect (boolean value) { 
        this.isHttpRedirect = value;
    }
 
    /** GETTER
     * The redirected URL if the URL responded with an HTTP redirect
     */
    @JsonGetter("httpRedirectUrl")
    public String getHttpRedirectUrl ( ) { 
        return this.httpRedirectUrl;
    }
    
    /** SETTER
     * The redirected URL if the URL responded with an HTTP redirect
     */
    @JsonSetter("httpRedirectUrl")
    public void setHttpRedirectUrl (String value) { 
        this.httpRedirectUrl = value;
    }
 
    /** GETTER
     * The HTTP servers IP address
     */
    @JsonGetter("serverIp")
    public String getServerIp ( ) { 
        return this.serverIp;
    }
    
    /** SETTER
     * The HTTP servers IP address
     */
    @JsonSetter("serverIp")
    public void setServerIp (String value) { 
        this.serverIp = value;
    }
 
    /** GETTER
     * The number of seconds taken to load the page (from initial request until DOM ready)
     */
    @JsonGetter("loadTime")
    public int getLoadTime ( ) { 
        return this.loadTime;
    }
    
    /** SETTER
     * The number of seconds taken to load the page (from initial request until DOM ready)
     */
    @JsonSetter("loadTime")
    public void setLoadTime (int value) { 
        this.loadTime = value;
    }
 
    /** GETTER
     * Map containing all the HTTP response headers the URL responded with
     */
    @JsonGetter("responseHeaders")
    public LinkedHashMap<String, String> getResponseHeaders ( ) { 
        return this.responseHeaders;
    }
    
    /** SETTER
     * Map containing all the HTTP response headers the URL responded with
     */
    @JsonSetter("responseHeaders")
    public void setResponseHeaders (LinkedHashMap<String, String> value) { 
        this.responseHeaders = value;
    }
 
    /** GETTER
     * True if the page is secured using TLS/SSL
     */
    @JsonGetter("isSecure")
    public boolean getIsSecure ( ) { 
        return this.isSecure;
    }
    
    /** SETTER
     * True if the page is secured using TLS/SSL
     */
    @JsonSetter("isSecure")
    public void setIsSecure (boolean value) { 
        this.isSecure = value;
    }
 
    /** GETTER
     * Map containing details of the TLS/SSL setup
     */
    @JsonGetter("securityDetails")
    public LinkedHashMap<String, String> getSecurityDetails ( ) { 
        return this.securityDetails;
    }
    
    /** SETTER
     * Map containing details of the TLS/SSL setup
     */
    @JsonSetter("securityDetails")
    public void setSecurityDetails (LinkedHashMap<String, String> value) { 
        this.securityDetails = value;
    }
 
    /** GETTER
     * Array containing all the elements matching the supplied selector.<br/>Each element object will contain the text content, HTML content and all current element attributes
     */
    @JsonGetter("elements")
    public List<String> getElements ( ) { 
        return this.elements;
    }
    
    /** SETTER
     * Array containing all the elements matching the supplied selector.<br/>Each element object will contain the text content, HTML content and all current element attributes
     */
    @JsonSetter("elements")
    public void setElements (List<String> value) { 
        this.elements = value;
    }
 
    /** GETTER
     * If you executed any JavaScript this array holds the results as objects
     */
    @JsonGetter("execResults")
    public List<String> getExecResults ( ) { 
        return this.execResults;
    }
    
    /** SETTER
     * If you executed any JavaScript this array holds the results as objects
     */
    @JsonSetter("execResults")
    public void setExecResults (List<String> value) { 
        this.execResults = value;
    }
 
}
