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
     * Convert a geographic coordinate (latitude and longitude) into a real world address. See: https://www.neutrinoapi.com/api/geocode-reverse/
     * @param    latitude    Required parameter: The location latitude in decimal degrees format
     * @param    longitude    Required parameter: The location longitude in decimal degrees format
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: <ul> <li>de, en, es, fr, it, pt, ru</li> </ul>
     * @param    zoom    Optional parameter: The zoom level to respond with: <ul> <li>address - the most precise address available</li> <li>street - the street level</li> <li>city - the city level</li> <li>state - the state level</li> <li>country - the country level</li> </ul>
     * @return    Returns the GeocodeReverseResponse response from the API call 
     */
    public GeocodeReverseResponse geocodeReverse(
                final String latitude,
                final String longitude,
                final String languageCode,
                final String zoom
    ) throws Throwable {

        HttpRequest _request = _buildGeocodeReverseRequest(latitude, longitude, languageCode, zoom);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGeocodeReverseResponse(_context);
    }

    /**
     * Convert a geographic coordinate (latitude and longitude) into a real world address. See: https://www.neutrinoapi.com/api/geocode-reverse/
     * @param    latitude    Required parameter: The location latitude in decimal degrees format
     * @param    longitude    Required parameter: The location longitude in decimal degrees format
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: <ul> <li>de, en, es, fr, it, pt, ru</li> </ul>
     * @param    zoom    Optional parameter: The zoom level to respond with: <ul> <li>address - the most precise address available</li> <li>street - the street level</li> <li>city - the city level</li> <li>state - the state level</li> <li>country - the country level</li> </ul>
     * @return    Returns the void response from the API call 
     */
    public void geocodeReverseAsync(
                final String latitude,
                final String longitude,
                final String languageCode,
                final String zoom,
                final APICallBack<GeocodeReverseResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildGeocodeReverseRequest(latitude, longitude, languageCode, zoom);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            GeocodeReverseResponse returnValue = _handleGeocodeReverseResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for geocodeReverse
     */
    private HttpRequest _buildGeocodeReverseRequest(
                final String latitude,
                final String longitude,
                final String languageCode,
                final String zoom) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/geocode-reverse");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("user-id", Configuration.userId);
        _queryParameters.put("api-key", Configuration.apiKey);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

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
        if (zoom != null) {
            _parameters.put("zoom", (zoom != null) ? zoom : "address");
        }

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for geocodeReverse
     * @return An object of type void
     */
    private GeocodeReverseResponse _handleGeocodeReverseResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

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

        return _result;
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

        HttpRequest _request = _buildIPInfoRequest(ip, reverseLookup);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleIPInfoResponse(_context);
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

                HttpRequest _request;
                try {
                    _request = _buildIPInfoRequest(ip, reverseLookup);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            IPInfoResponse returnValue = _handleIPInfoResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for iPInfo
     */
    private HttpRequest _buildIPInfoRequest(
                final String ip,
                final Boolean reverseLookup) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ip-info");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("user-id", Configuration.userId);
        _queryParameters.put("api-key", Configuration.apiKey);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

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
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for iPInfo
     * @return An object of type void
     */
    private IPInfoResponse _handleIPInfoResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

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

        return _result;
    }

    /**
     * Geocode an address, partial address or just the name of a place. See: https://www.neutrinoapi.com/api/geocode-address/
     * @param    address    Required parameter: The address, partial address or name of a place to try and locate
     * @param    countryCode    Optional parameter: The ISO 2-letter country code to be biased towards (the default is no country bias)
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: <ul> <li>de, en, es, fr, it, pt, ru</li> </ul>
     * @param    fuzzySearch    Optional parameter: If no matches are found for the given address, start performing a recursive fuzzy search until a geolocation is found. This option is recommended for processing user input or implementing auto-complete. We use a combination of approximate string matching and data cleansing to find possible location matches
     * @return    Returns the GeocodeAddressResponse response from the API call 
     */
    public GeocodeAddressResponse geocodeAddress(
                final String address,
                final String countryCode,
                final String languageCode,
                final Boolean fuzzySearch
    ) throws Throwable {

        HttpRequest _request = _buildGeocodeAddressRequest(address, countryCode, languageCode, fuzzySearch);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleGeocodeAddressResponse(_context);
    }

    /**
     * Geocode an address, partial address or just the name of a place. See: https://www.neutrinoapi.com/api/geocode-address/
     * @param    address    Required parameter: The address, partial address or name of a place to try and locate
     * @param    countryCode    Optional parameter: The ISO 2-letter country code to be biased towards (the default is no country bias)
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: <ul> <li>de, en, es, fr, it, pt, ru</li> </ul>
     * @param    fuzzySearch    Optional parameter: If no matches are found for the given address, start performing a recursive fuzzy search until a geolocation is found. This option is recommended for processing user input or implementing auto-complete. We use a combination of approximate string matching and data cleansing to find possible location matches
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

                HttpRequest _request;
                try {
                    _request = _buildGeocodeAddressRequest(address, countryCode, languageCode, fuzzySearch);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            GeocodeAddressResponse returnValue = _handleGeocodeAddressResponse(_context);
                            callBack.onSuccess(_context, returnValue);
                        } catch (Exception e) {
                            callBack.onFailure(_context, e);
                        }
                    }

                    public void onFailure(HttpContext _context, Throwable _exception) {
                        // Let the caller know of the failure
                        callBack.onFailure(_context, _exception);
                    }
                });
            }
        };

        // Execute async using thread pool
        APIHelper.getScheduler().execute(_responseTask);
    }

    /**
     * Builds the HttpRequest object for geocodeAddress
     */
    private HttpRequest _buildGeocodeAddressRequest(
                final String address,
                final String countryCode,
                final String languageCode,
                final Boolean fuzzySearch) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/geocode-address");

        //process query parameters
        Map<String, Object> _queryParameters = new HashMap<String, Object>();
        _queryParameters.put("user-id", Configuration.userId);
        _queryParameters.put("api-key", Configuration.apiKey);
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, _queryParameters);
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

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
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for geocodeAddress
     * @return An object of type void
     */
    private GeocodeAddressResponse _handleGeocodeAddressResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

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

        return _result;
    }

}
