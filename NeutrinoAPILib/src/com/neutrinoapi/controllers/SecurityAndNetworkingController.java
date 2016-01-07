/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.controllers;

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.neutrinoapi.http.client.HttpClient;

import com.neutrinoapi.http.request.HttpRequest;
import com.neutrinoapi.http.response.HttpResponse;
import com.neutrinoapi.http.response.HttpStringResponse;
import com.neutrinoapi.*;
import com.neutrinoapi.models.*;

public class SecurityAndNetworkingController extends BaseController {

    //private fields for configuration

   /** Your user ID */
    private String userId;

   /** Your API key */
    private String apiKey;

   /**
    * Constructor with authentication and configuration parameters */
    public SecurityAndNetworkingController (String userId, String apiKey) {
        this.userId = userId;
        this.apiKey = apiKey;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public SecurityAndNetworkingController (HttpClient _client, String userId, String apiKey) {
        super(_client);
        this.userId = userId;
        this.apiKey = apiKey;
    }

    /**
     * Parse, analyze and retrieve content from the supplied URL. See: https://www.neutrinoapi.com/api/url-info/
     * @param    fetchContent    Required parameter: If this URL responds with html, text, json or xml then return the response. This option is useful if you want to perform further processing on the URL content
     * @param    url    Required parameter: The URL to process
	 * @return	Returns the URLInfoResponse response from the API call*/
    public URLInfoResponse uRLInfo(
            final boolean fetchContent,
            final String url
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/url-info");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5218967069338825586L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5639641297756084643L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5400071442005486192L;
            {
                    put( "fetch-content", fetchContent );
                    put( "output-case", "camel" );
                    put( "url", url );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        URLInfoResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<URLInfoResponse>(){});

        return result;
    }
        
    /**
     * Check the reputation of an IP address or domain against a comprehensive list of blacklists and blocklists (DNSBLs). See: https://www.neutrinoapi.com/api/host-reputation/
     * @param    host    Required parameter: An IPv4 address or a domain name. If you supply a domain name it will be checked against the URI DNSBL list
	 * @return	Returns the HostReputationResponse response from the API call*/
    public HostReputationResponse hostReputation(
            final String host
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/host-reputation");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4654378948348025589L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4873908000913110365L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5083166578820269819L;
            {
                    put( "host", host );
                    put( "output-case", "camel" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        HostReputationResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<HostReputationResponse>(){});

        return result;
    }
        
    /**
     * The IP Blocklist API will detect potentially malicious or dangerous IP addresses. See: https://www.neutrinoapi.com/api/ip-blocklist/
     * @param    ip    Required parameter: An IPv4 address
	 * @return	Returns the IPBlocklistResponse response from the API call*/
    public IPBlocklistResponse iPBlocklist(
            final String ip
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/ip-blocklist");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5617855085194384020L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5704048989207901452L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5357875335849149672L;
            {
                    put( "ip", ip );
                    put( "output-case", "camel" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        IPBlocklistResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<IPBlocklistResponse>(){});

        return result;
    }
        
}