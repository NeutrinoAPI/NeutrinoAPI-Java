/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class URLInfoResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5730321240688559157L;
    private String contentEncoding;
    private int contentSize;
    private String contentType;
    private boolean httpOk;
    private boolean httpRedirect;
    private int httpStatus;
    private String httpStatusMessage;
    private double loadTime;
    private LinkedHashMap<String, Object> query;
    private boolean real;
    private String serverCity;
    private String serverCountry;
    private String serverCountryCode;
    private String serverHostname;
    private String serverIp;
    private String serverName;
    private String serverRegion;
    private String url;
    private String urlPath;
    private int urlPort;
    private String urlProtocol;
    private boolean valid;
    /** GETTER
     * The encoding type the URL uses
     */
    @JsonGetter("contentEncoding")
    public String getContentEncoding ( ) { 
        return this.contentEncoding;
    }
    
    /** SETTER
     * The encoding type the URL uses
     */
    @JsonSetter("contentEncoding")
    public void setContentEncoding (String value) { 
        this.contentEncoding = value;
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
     * The content-type the URL points to
     */
    @JsonGetter("contentType")
    public String getContentType ( ) { 
        return this.contentType;
    }
    
    /** SETTER
     * The content-type the URL points to
     */
    @JsonSetter("contentType")
    public void setContentType (String value) { 
        this.contentType = value;
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
     * True if this URL responded with a HTTP redirect
     */
    @JsonGetter("httpRedirect")
    public boolean getHttpRedirect ( ) { 
        return this.httpRedirect;
    }
    
    /** SETTER
     * True if this URL responded with a HTTP redirect
     */
    @JsonSetter("httpRedirect")
    public void setHttpRedirect (boolean value) { 
        this.httpRedirect = value;
    }
 
    /** GETTER
     * The HTTP status code this URL responded with
     */
    @JsonGetter("httpStatus")
    public int getHttpStatus ( ) { 
        return this.httpStatus;
    }
    
    /** SETTER
     * The HTTP status code this URL responded with
     */
    @JsonSetter("httpStatus")
    public void setHttpStatus (int value) { 
        this.httpStatus = value;
    }
 
    /** GETTER
     * The HTTP status message assoicated with the status code
     */
    @JsonGetter("httpStatusMessage")
    public String getHttpStatusMessage ( ) { 
        return this.httpStatusMessage;
    }
    
    /** SETTER
     * The HTTP status message assoicated with the status code
     */
    @JsonSetter("httpStatusMessage")
    public void setHttpStatusMessage (String value) { 
        this.httpStatusMessage = value;
    }
 
    /** GETTER
     * The time taken to load the URL content (in seconds)
     */
    @JsonGetter("loadTime")
    public double getLoadTime ( ) { 
        return this.loadTime;
    }
    
    /** SETTER
     * The time taken to load the URL content (in seconds)
     */
    @JsonSetter("loadTime")
    public void setLoadTime (double value) { 
        this.loadTime = value;
    }
 
    /** GETTER
     * A key:value map of the URL query paramaters
     */
    @JsonGetter("query")
    public LinkedHashMap<String, Object> getQuery ( ) { 
        return this.query;
    }
    
    /** SETTER
     * A key:value map of the URL query paramaters
     */
    @JsonSetter("query")
    public void setQuery (LinkedHashMap<String, Object> value) { 
        this.query = value;
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
     * Server IP geo-location: full city name (if detectable)
     */
    @JsonGetter("serverCity")
    public String getServerCity ( ) { 
        return this.serverCity;
    }
    
    /** SETTER
     * Server IP geo-location: full city name (if detectable)
     */
    @JsonSetter("serverCity")
    public void setServerCity (String value) { 
        this.serverCity = value;
    }
 
    /** GETTER
     * Server IP geo-location: full country name
     */
    @JsonGetter("serverCountry")
    public String getServerCountry ( ) { 
        return this.serverCountry;
    }
    
    /** SETTER
     * Server IP geo-location: full country name
     */
    @JsonSetter("serverCountry")
    public void setServerCountry (String value) { 
        this.serverCountry = value;
    }
 
    /** GETTER
     * Server IP geo-location: ISO 2-letter country code
     */
    @JsonGetter("serverCountryCode")
    public String getServerCountryCode ( ) { 
        return this.serverCountryCode;
    }
    
    /** SETTER
     * Server IP geo-location: ISO 2-letter country code
     */
    @JsonSetter("serverCountryCode")
    public void setServerCountryCode (String value) { 
        this.serverCountryCode = value;
    }
 
    /** GETTER
     * The server hostname (PTR)
     */
    @JsonGetter("serverHostname")
    public String getServerHostname ( ) { 
        return this.serverHostname;
    }
    
    /** SETTER
     * The server hostname (PTR)
     */
    @JsonSetter("serverHostname")
    public void setServerHostname (String value) { 
        this.serverHostname = value;
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
     * Server IP geo-location: full region name (if detectable)
     */
    @JsonGetter("serverRegion")
    public String getServerRegion ( ) { 
        return this.serverRegion;
    }
    
    /** SETTER
     * Server IP geo-location: full region name (if detectable)
     */
    @JsonSetter("serverRegion")
    public void setServerRegion (String value) { 
        this.serverRegion = value;
    }
 
    /** GETTER
     * The fully qualified URL. This may be different to the URL requested if http-redirect is True
     */
    @JsonGetter("url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * The fully qualified URL. This may be different to the URL requested if http-redirect is True
     */
    @JsonSetter("url")
    public void setUrl (String value) { 
        this.url = value;
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
     * The URL protocol (usually http or https)
     */
    @JsonGetter("urlProtocol")
    public String getUrlProtocol ( ) { 
        return this.urlProtocol;
    }
    
    /** SETTER
     * The URL protocol (usually http or https)
     */
    @JsonSetter("urlProtocol")
    public void setUrlProtocol (String value) { 
        this.urlProtocol = value;
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
 
}
 