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
    private static Object syncObject = new Object();
    private static Geolocation instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Geolocation class 
     */
    public static Geolocation getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new Geolocation();
            }
        }
        return instance;
    }

    /**
     * Convert a geographic coordinate (latitude and longitude) into a real world address or location.
     * @param    latitude    Required parameter: The location latitude
     * @param    longitude    Required parameter: The location longitude
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: de, en, es, fr, it, pt, ru
     * @return    Returns the GeocodeReverseResponse response from the API call 
     */
    public GeocodeReverseResponse geocodeReverse(
                final double latitude,
                final double longitude,
                final String languageCode
    ) throws Throwable {
        APICallBackCatcher<GeocodeReverseResponse> callback = new APICallBackCatcher<GeocodeReverseResponse>();
        geocodeReverseAsync(latitude, longitude, languageCode, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Convert a geographic coordinate (latitude and longitude) into a real world address or location.
     * @param    latitude    Required parameter: The location latitude
     * @param    longitude    Required parameter: The location longitude
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: de, en, es, fr, it, pt, ru
     * @return    Returns the void response from the API call 
     */
    public void geocodeReverseAsync(
                final double latitude,
                final double longitude,
                final String languageCode,
                final APICallBack<GeocodeReverseResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/geocode-reverse");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5510034434686363524L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5750230124114825698L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5442977541544519130L;
            {
                    put( "output-case", "camel" );
                    put( "latitude", latitude );
                    put( "longitude", longitude );
                    put( "language-code", (languageCode != null) ? languageCode : "en" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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
     * Get location information about an IP address and do reverse DNS (PTR) lookups.
     * @param    ip    Required parameter: The IP address
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
     * Get location information about an IP address and do reverse DNS (PTR) lookups.
     * @param    ip    Required parameter: The IP address
     * @param    reverseLookup    Optional parameter: Do a reverse DNS (PTR) lookup. This option can add extra delay to the request so only use it if you need it
     * @return    Returns the void response from the API call 
     */
    public void iPInfoAsync(
                final String ip,
                final Boolean reverseLookup,
                final APICallBack<IPInfoResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/ip-info");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5545673599955422265L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5223387809697060186L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5247585324516490752L;
            {
                    put( "output-case", "camel" );
                    put( "ip", ip );
                    put( "reverse-lookup", (reverseLookup != null) ? reverseLookup : false );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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
     * Geocode an address, partial address or the name of a location
     * @param    address    Required parameter: The address or partial address to try and locate
     * @param    countryCode    Optional parameter: The ISO 2-letter country code to be biased towards (default is no country bias)
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: de, en, es, fr, it, pt, ru
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
     * Geocode an address, partial address or the name of a location
     * @param    address    Required parameter: The address or partial address to try and locate
     * @param    countryCode    Optional parameter: The ISO 2-letter country code to be biased towards (default is no country bias)
     * @param    languageCode    Optional parameter: The language to display results in, available languages are: de, en, es, fr, it, pt, ru
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
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/geocode-address");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5533230198137061800L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4917767620138810607L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5099662873175878563L;
            {
                    put( "output-case", "camel" );
                    put( "address", address );
                    put( "country-code", countryCode );
                    put( "language-code", (languageCode != null) ? languageCode : "en" );
                    put( "fuzzy-search", (fuzzySearch != null) ? fuzzySearch : false );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
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