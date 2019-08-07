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
public class URLInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 1553462061705019977L;
    private int httpStatusMessage;
    private String serverRegion;
    private LinkedHashMap<String, String> query;
    private String serverName;
    private int urlPort;
    private String serverCountry;
    private boolean real;
    private String serverCity;
    private String urlPath;
    private String url;
    private boolean valid;
    private String serverHostname;
    private int loadTime;
    private boolean httpOk;
    private int contentSize;
    private int httpStatus;
    private String serverCountryCode;
    private String contentEncoding;
    private String serverIp;
    private String urlProtocol;
    private String contentType;
    private boolean httpRedirect;
    private String content;
    private boolean isTimeout;
    /** GETTER
     * The HTTP status message assoicated with the status code
     */
    @JsonGetter("httpStatusMessage")
    public int getHttpStatusMessage ( ) { 
        return this.httpStatusMessage;
    }
    
    /** SETTER
     * The HTTP status message assoicated with the status code
     */
    @JsonSetter("httpStatusMessage")
    public void setHttpStatusMessage (int value) { 
        this.httpStatusMessage = value;
    }
 
    /** GETTER
     * The servers IP geo-location: full region name (if detectable)
     */
    @JsonGetter("serverRegion")
    public String getServerRegion ( ) { 
        return this.serverRegion;
    }
    
    /** SETTER
     * The servers IP geo-location: full region name (if detectable)
     */
    @JsonSetter("serverRegion")
    public void setServerRegion (String value) { 
        this.serverRegion = value;
    }
 
    /** GETTER
     * A key-value map of the URL query paramaters
     */
    @JsonGetter("query")
    public LinkedHashMap<String, String> getQuery ( ) { 
        return this.query;
    }
    
    /** SETTER
     * A key-value map of the URL query paramaters
     */
    @JsonSetter("query")
    public void setQuery (LinkedHashMap<String, String> value) { 
        this.query = value;
    }
 
    /** GETTER
     * The name of the server software hosting this URL
     */
    @JsonGetter("serverName")
    public String getServerName ( ) { 
        return this.serverName;
    }
    
    /** SETTER
     * The name of the server software hosting this URL
     */
    @JsonSetter("serverName")
    public void setServerName (String value) { 
        this.serverName = value;
    }
 
    /** GETTER
     * The URL port
     */
    @JsonGetter("urlPort")
    public int getUrlPort ( ) { 
        return this.urlPort;
    }
    
    /** SETTER
     * The URL port
     */
    @JsonSetter("urlPort")
    public void setUrlPort (int value) { 
        this.urlPort = value;
    }
 
    /** GETTER
     * The servers IP geo-location: full country name
     */
    @JsonGetter("serverCountry")
    public String getServerCountry ( ) { 
        return this.serverCountry;
    }
    
    /** SETTER
     * The servers IP geo-location: full country name
     */
    @JsonSetter("serverCountry")
    public void setServerCountry (String value) { 
        this.serverCountry = value;
    }
 
    /** GETTER
     * Is this URL actually serving real content
     */
    @JsonGetter("real")
    public boolean getReal ( ) { 
        return this.real;
    }
    
    /** SETTER
     * Is this URL actually serving real content
     */
    @JsonSetter("real")
    public void setReal (boolean value) { 
        this.real = value;
    }
 
    /** GETTER
     * The servers IP geo-location: full city name (if detectable)
     */
    @JsonGetter("serverCity")
    public String getServerCity ( ) { 
        return this.serverCity;
    }
    
    /** SETTER
     * The servers IP geo-location: full city name (if detectable)
     */
    @JsonSetter("serverCity")
    public void setServerCity (String value) { 
        this.serverCity = value;
    }
 
    /** GETTER
     * The URL path
     */
    @JsonGetter("urlPath")
    public String getUrlPath ( ) { 
        return this.urlPath;
    }
    
    /** SETTER
     * The URL path
     */
    @JsonSetter("urlPath")
    public void setUrlPath (String value) { 
        this.urlPath = value;
    }
 
    /** GETTER
     * The fully qualified URL. This may be different to the URL requested if http-redirect is true
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * The fully qualified URL. This may be different to the URL requested if http-redirect is true
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * Is this a valid well-formed URL
     */
    @JsonGetter("valid")
    public boolean getValid ( ) { 
        return this.valid;
    }
    
    /** SETTER
     * Is this a valid well-formed URL
     */
    @JsonSetter("valid")
    public void setValid (boolean value) { 
        this.valid = value;
    }
 
    /** GETTER
     * The servers hostname (PTR record)
     */
    @JsonGetter("serverHostname")
    public String getServerHostname ( ) { 
        return this.serverHostname;
    }
    
    /** SETTER
     * The servers hostname (PTR record)
     */
    @JsonSetter("serverHostname")
    public void setServerHostname (String value) { 
        this.serverHostname = value;
    }
 
    /** GETTER
     * The time taken to load the URL content in seconds
     */
    @JsonGetter("loadTime")
    public int getLoadTime ( ) { 
        return this.loadTime;
    }
    
    /** SETTER
     * The time taken to load the URL content in seconds
     */
    @JsonSetter("loadTime")
    public void setLoadTime (int value) { 
        this.loadTime = value;
    }
 
    /** GETTER
     * True if this URL responded with an HTTP OK (200) status
     */
    @JsonGetter("httpOk")
    public boolean getHttpOk ( ) { 
        return this.httpOk;
    }
    
    /** SETTER
     * True if this URL responded with an HTTP OK (200) status
     */
    @JsonSetter("httpOk")
    public void setHttpOk (boolean value) { 
        this.httpOk = value;
    }
 
    /** GETTER
     * The size of the URL content in bytes
     */
    @JsonGetter("contentSize")
    public int getContentSize ( ) { 
        return this.contentSize;
    }
    
    /** SETTER
     * The size of the URL content in bytes
     */
    @JsonSetter("contentSize")
    public void setContentSize (int value) { 
        this.contentSize = value;
    }
 
    /** GETTER
     * The HTTP status code this URL responded with. An HTTP status of 0 indicates a network level issue
     */
    @JsonGetter("httpStatus")
    public int getHttpStatus ( ) { 
        return this.httpStatus;
    }
    
    /** SETTER
     * The HTTP status code this URL responded with. An HTTP status of 0 indicates a network level issue
     */
    @JsonSetter("httpStatus")
    public void setHttpStatus (int value) { 
        this.httpStatus = value;
    }
 
    /** GETTER
     * The servers IP geo-location: ISO 2-letter country code
     */
    @JsonGetter("serverCountryCode")
    public String getServerCountryCode ( ) { 
        return this.serverCountryCode;
    }
    
    /** SETTER
     * The servers IP geo-location: ISO 2-letter country code
     */
    @JsonSetter("serverCountryCode")
    public void setServerCountryCode (String value) { 
        this.serverCountryCode = value;
    }
 
    /** GETTER
     * The encoding format the URL uses
     */
    @JsonGetter("contentEncoding")
    public String getContentEncoding ( ) { 
        return this.contentEncoding;
    }
    
    /** SETTER
     * The encoding format the URL uses
     */
    @JsonSetter("contentEncoding")
    public void setContentEncoding (String value) { 
        this.contentEncoding = value;
    }
 
    /** GETTER
     * The IP address of the server hosting this URL
     */
    @JsonGetter("serverIp")
    public String getServerIp ( ) { 
        return this.serverIp;
    }
    
    /** SETTER
     * The IP address of the server hosting this URL
     */
    @JsonSetter("serverIp")
    public void setServerIp (String value) { 
        this.serverIp = value;
    }
 
    /** GETTER
     * The URL protocol, usually http or https
     */
    @JsonGetter("urlProtocol")
    public String getUrlProtocol ( ) { 
        return this.urlProtocol;
    }
    
    /** SETTER
     * The URL protocol, usually http or https
     */
    @JsonSetter("urlProtocol")
    public void setUrlProtocol (String value) { 
        this.urlProtocol = value;
    }
 
    /** GETTER
     * The content-type this URL serves
     */
    @JsonGetter("contentType")
    public String getContentType ( ) { 
        return this.contentType;
    }
    
    /** SETTER
     * The content-type this URL serves
     */
    @JsonSetter("contentType")
    public void setContentType (String value) { 
        this.contentType = value;
    }
 
    /** GETTER
     * True if this URL responded with an HTTP redirect
     */
    @JsonGetter("httpRedirect")
    public boolean getHttpRedirect ( ) { 
        return this.httpRedirect;
    }
    
    /** SETTER
     * True if this URL responded with an HTTP redirect
     */
    @JsonSetter("httpRedirect")
    public void setHttpRedirect (boolean value) { 
        this.httpRedirect = value;
    }
 
    /** GETTER
     * The actual content this URL responded with. Only set if the 'fetch-content' option was used
     */
    @JsonGetter("content")
    public String getContent ( ) { 
        return this.content;
    }
    
    /** SETTER
     * The actual content this URL responded with. Only set if the 'fetch-content' option was used
     */
    @JsonSetter("content")
    public void setContent (String value) { 
        this.content = value;
    }
 
    /** GETTER
     * True if a timeout occurred while loading the URL. You can set the timeout with the request parameter 'timeout'
     */
    @JsonGetter("isTimeout")
    public boolean getIsTimeout ( ) { 
        return this.isTimeout;
    }
    
    /** SETTER
     * True if a timeout occurred while loading the URL. You can set the timeout with the request parameter 'timeout'
     */
    @JsonSetter("isTimeout")
    public void setIsTimeout (boolean value) { 
        this.isTimeout = value;
    }
 
}
