/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.neutrinoapi.sdk.*;
import com.neutrinoapi.sdk.models.*;
import com.neutrinoapi.sdk.exceptions.*;
import com.neutrinoapi.sdk.http.client.HttpClient;
import com.neutrinoapi.sdk.http.client.HttpContext;
import com.neutrinoapi.sdk.http.request.HttpRequest;
import com.neutrinoapi.sdk.http.response.HttpResponse;
import com.neutrinoapi.sdk.http.response.HttpStringResponse;
import com.neutrinoapi.sdk.http.client.APICallBack;
import com.neutrinoapi.sdk.controllers.syncwrapper.APICallBackCatcher;

public class Geolocation extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static Geolocation instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Geolocation class 
     */
    public static Geolocation getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new Geolocation();
                }
            }
        }
        return instance;
    }

    /**
     * Convert a geographic coordinate (latitude and longitude) into a real world address or location. See: https://www.neutrinoapi.com/api/geocode-reverse/
     * @param    latitude    Required parameter: The location latitude in decimal degrees format
     * @param    longitude    Required parameter: The location longitude in decimal degrees format
     * @param    languageCode    Optional parameter: The language to display results in, available languages are:<ul><li>de, en, es, fr, it, pt, ru</li></ul>
     * @return    Returns the GeocodeReverseResponse response from the API call 
     */
    public GeocodeReverseResponse geocodeReverse(
                final String latitude,
                final String longitude,
                final String languageCode
    ) throws Throwable {
        APICallBackCatcher<GeocodeReverseResponse> callback = new APICallBackCatcher<GeocodeReverseResponse>();
        geocodeReverseAsync(latitude, longitude, languageCode, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Convert a geographic coordinate (latitude and longitude) into a real world address or location. See: https://www.neutrinoapi.com/api/geocode-reverse/
     * @param    latitude    Required parameter: The location latitude in decimal degrees format
     * @param    longitude    Required parameter: The location longitude in decimal degrees format
     * @param    languageCode    Optional parameter: The language to display results in, available languages are:<ul><li>de, en, es, fr, it, pt, ru</li></ul>
     * @return    Returns the void response from the API call 
     */
    public void geocodeReverseAsync(
                final String latitude,
                final String longitude,
                final String languageCode,
                final APICallBack<GeocodeReverseResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/geocode-reverse");

                    ///process query parameters
                    Map<String, Object> _queryParameters = new HashMap<String, Object>();
                    _queryParameters.put("user-id", Configuration.userId);
                    _queryParameters.put("api-key", Configuration.apiKey);
                    APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                    //validate and preprocess url
                    String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                    //load all headers for the outgoing API request
                    Map<String, String> _headers = new HashMap<String, String>();
                    _headers.put("user-agent", BaseController.userAgent);
                    _headers.put("accept", "application/json");


                    //load all fields for the outgoing API request
                    Map<String, Object> _parameters = new HashMap<String, Object>();
                    _parameters.put("output-case", "camel");
                    _parameters.put("latitude", latitude);
                    _parameters.put("longitude", longitude);
                    if (languageCode != null) {
                        _parameters.put("language-code", (languageCode != null) ? languageCode : "en");
                    }

                    //prepare and invoke the API call request to fetch the response
                    _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

                    //invoke the callback before request if its not null
                    if (getHttpCallBack() != null) {
                        getHttpCallBack().OnBeforeRequest(_request);
                    }

                } catch (Throwable e) {
                    callBack.onFailure(null, e);
                    return;
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null) {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GeocodeReverseResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GeocodeReverseResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
 {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Get location information about an IP address and do reverse DNS (PTR) lookups. See: https://www.neutrinoapi.com/api/ip-info/
     * @param    ip    Required parameter: IPv4 or IPv6 address
     * @param    reverseLookup    Optional parameter: Do a reverse DNS (PTR) lookup. This option can add extra delay to the request so only use it if you need it
     * @return    Returns the IPInfoResponse response from the API call 
     */
    public IPInfoResponse iPInfo(
                final String ip,
                final Boolean reverseLookup
    ) throws Throwable {
        APICallBackCatcher<IPInfoResponse> callback = new APICallBackCatcher<IPInfoResponse>();
        iPInfoAsync(ip, reverseLookup, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Get location information about an IP address and do reverse DNS (PTR) lookups. See: https://www.neutrinoapi.com/api/ip-info/
     * @param    ip    Required parameter: IPv4 or IPv6 address
     * @param    reverseLookup    Optional parameter: Do a reverse DNS (PTR) lookup. This option can add extra delay to the request so only use it if you need it
     * @return    Returns the void response from the API call 
     */
    public void iPInfoAsync(
                final String ip,
                final Boolean reverseLookup,
                final APICallBack<IPInfoResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/ip-info");

                    ///process query parameters
                    Map<String, Object> _queryParameters = new HashMap<String, Object>();
                    _queryParameters.put("user-id", Configuration.userId);
                    _queryParameters.put("api-key", Configuration.apiKey);
                    APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                    //validate and preprocess url
                    String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                    //load all headers for the outgoing API request
                    Map<String, String> _headers = new HashMap<String, String>();
                    _headers.put("user-agent", BaseController.userAgent);
                    _headers.put("accept", "application/json");


                    //load all fields for the outgoing API request
                    Map<String, Object> _parameters = new HashMap<String, Object>();
                    _parameters.put("output-case", "camel");
                    _parameters.put("ip", ip);
                    if (reverseLookup != null) {
                        _parameters.put("reverse-lookup", (reverseLookup != null) ? reverseLookup : false);
                    }

                    //prepare and invoke the API call request to fetch the response
                    _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

                    //invoke the callback before request if its not null
                    if (getHttpCallBack() != null) {
                        getHttpCallBack().OnBeforeRequest(_request);
                    }

                } catch (Throwable e) {
                    callBack.onFailure(null, e);
                    return;
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null) {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            IPInfoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<IPInfoResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
 {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Geocode an address, partial address or just the name of a place. See: https://www.neutrinoapi.com/api/geocode-address/
     * @param    address    Required parameter: The address, partial address or name of a place to try and locate
     * @param    countryCode    Optional parameter: The ISO 2-letter country code to be biased towards (the default is no country bias)
     * @param    languageCode    Optional parameter: The language to display results in, available languages are:<ul><li>de, en, es, fr, it, pt, ru</li></ul>
     * @param    fuzzySearch    Optional parameter: If no matches are found for the given address, start performing a recursive fuzzy search until a geolocation is found. We use a combination of approximate string matching and data cleansing to find possible location matches
     * @return    Returns the GeocodeAddressResponse response from the API call 
     */
    public GeocodeAddressResponse geocodeAddress(
                final String address,
                final String countryCode,
                final String languageCode,
                final Boolean fuzzySearch
    ) throws Throwable {
        APICallBackCatcher<GeocodeAddressResponse> callback = new APICallBackCatcher<GeocodeAddressResponse>();
        geocodeAddressAsync(address, countryCode, languageCode, fuzzySearch, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Geocode an address, partial address or just the name of a place. See: https://www.neutrinoapi.com/api/geocode-address/
     * @param    address    Required parameter: The address, partial address or name of a place to try and locate
     * @param    countryCode    Optional parameter: The ISO 2-letter country code to be biased towards (the default is no country bias)
     * @param    languageCode    Optional parameter: The language to display results in, available languages are:<ul><li>de, en, es, fr, it, pt, ru</li></ul>
     * @param    fuzzySearch    Optional parameter: If no matches are found for the given address, start performing a recursive fuzzy search until a geolocation is found. We use a combination of approximate string matching and data cleansing to find possible location matches
     * @return    Returns the void response from the API call 
     */
    public void geocodeAddressAsync(
                final String address,
                final String countryCode,
                final String languageCode,
                final Boolean fuzzySearch,
                final APICallBack<GeocodeAddressResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/geocode-address");

                    ///process query parameters
                    Map<String, Object> _queryParameters = new HashMap<String, Object>();
                    _queryParameters.put("user-id", Configuration.userId);
                    _queryParameters.put("api-key", Configuration.apiKey);
                    APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);

                    //validate and preprocess url
                    String _queryUrl = APIHelper.cleanUrl(new StringBuilder(_baseUri).append(_queryBuilder));

                    //load all headers for the outgoing API request
                    Map<String, String> _headers = new HashMap<String, String>();
                    _headers.put("user-agent", BaseController.userAgent);
                    _headers.put("accept", "application/json");


                    //load all fields for the outgoing API request
                    Map<String, Object> _parameters = new HashMap<String, Object>();
                    _parameters.put("output-case", "camel");
                    _parameters.put("address", address);
                    if (countryCode != null) {
                        _parameters.put("country-code", countryCode);
                    }
                    if (languageCode != null) {
                        _parameters.put("language-code", (languageCode != null) ? languageCode : "en");
                    }
                    if (fuzzySearch != null) {
                        _parameters.put("fuzzy-search", (fuzzySearch != null) ? fuzzySearch : false);
                    }

                    //prepare and invoke the API call request to fetch the response
                    _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

                    //invoke the callback before request if its not null
                    if (getHttpCallBack() != null) {
                        getHttpCallBack().OnBeforeRequest(_request);
                    }

                } catch (Throwable e) {
                    callBack.onFailure(null, e);
                    return;
                }

                //invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null) {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            GeocodeAddressResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<GeocodeAddressResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)
 {
                            getHttpCallBack().OnAfterResponse(_context);
                        }

                        //let the caller know of the failure
                        callBack.onFailure(_context, _error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

}