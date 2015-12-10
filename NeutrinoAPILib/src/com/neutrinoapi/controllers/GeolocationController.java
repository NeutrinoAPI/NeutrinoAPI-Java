/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
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

public class GeolocationController extends BaseController {

    //private fields for configuration

   /** Your user ID */
    private String userId;

   /** Your API key */
    private String apiKey;

   /**
    * Constructor with authentication and configuration parameters */
    public GeolocationController (String userId, String apiKey) {
        this.userId = userId;
        this.apiKey = apiKey;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public GeolocationController (HttpClient _client, String userId, String apiKey) {
        super(_client);
        this.userId = userId;
        this.apiKey = apiKey;
    }

    /**
     * Get location information about an IP address and do reverse DNS (PTR) lookups. See: https://www.neutrinoapi.com/api/ip-info/
     * @param    ip    Required parameter: The IP address
     * @param    reverseLookup    Optional parameter: Do reverse DNS (PTR) lookup. This option can add extra delay to the request so only use it if you need it
	 * @return	Returns the IPInfoResponse response from the API call*/
    public IPInfoResponse createIPInfo(
            final String ip,
            final Boolean reverseLookup
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/ip-info");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5174676399304684731L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5729513037714627576L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5600606352457069323L;
            {
                    put( "ip", ip );
                    put( "output-case", "camel" );
                    put( "reverse-lookup", (null != reverseLookup) ? reverseLookup : false );
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
        IPInfoResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<IPInfoResponse>(){});

        return result;
    }
        
    /**
     * Geocode an address or partial address. See: https://www.neutrinoapi.com/api/geocode-address/
     * @param    address    Required parameter: The address or partial address to try and locate
     * @param    countryCode    Optional parameter: The ISO 2-letter country code to be biased towards (default is no country bias)
     * @param    languageCode    Optional parameter: The language to display results in
	 * @return	Returns the GeocodeAddressResponse response from the API call*/
    public GeocodeAddressResponse createGeocodeAddress(
            final String address,
            final String countryCode,
            final String languageCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/geocode-address");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4915878302864976713L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4832181844751032598L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5107590142780792134L;
            {
                    put( "address", address );
                    put( "output-case", "camel" );
                    put( "country-code", countryCode );
                    put( "language-code", (null != languageCode) ? languageCode : "en" );
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
        GeocodeAddressResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GeocodeAddressResponse>(){});

        return result;
    }
        
    /**
     * Reverse geocoding is the process of taking a coordinate (latitude and longitude) and mapping this to a real world address or location. See: https://www.neutrinoapi.com/api/geocode-reverse/
     * @param    latitude    Required parameter: The location latitude
     * @param    longitude    Required parameter: The location longitude
     * @param    languageCode    Optional parameter: The language to display results in
	 * @return	Returns the GeocodeReverseResponse response from the API call*/
    public GeocodeReverseResponse createGeocodeReverse(
            final double latitude,
            final double longitude,
            final String languageCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/geocode-reverse");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5555668330414396684L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4712177050891313644L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4815157657873463970L;
            {
                    put( "latitude", latitude );
                    put( "longitude", longitude );
                    put( "output-case", "camel" );
                    put( "language-code", (null != languageCode) ? languageCode : "en" );
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
        GeocodeReverseResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<GeocodeReverseResponse>(){});

        return result;
    }
        
}