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

public class SecurityAndNetworking extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static SecurityAndNetworking instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the SecurityAndNetworking class 
     */
    public static SecurityAndNetworking getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new SecurityAndNetworking();
                }
            }
        }
        return instance;
    }

    /**
     * The IP Blocklist API will detect potentially malicious or dangerous IP addresses. See: https://www.neutrinoapi.com/api/ip-blocklist/
     * @param    ip    Required parameter: An IPv4 or IPv6 address
     * @return    Returns the IPBlocklistResponse response from the API call 
     */
    public IPBlocklistResponse iPBlocklist(
                final String ip
    ) throws Throwable {
        APICallBackCatcher<IPBlocklistResponse> callback = new APICallBackCatcher<IPBlocklistResponse>();
        iPBlocklistAsync(ip, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * The IP Blocklist API will detect potentially malicious or dangerous IP addresses. See: https://www.neutrinoapi.com/api/ip-blocklist/
     * @param    ip    Required parameter: An IPv4 or IPv6 address
     * @return    Returns the void response from the API call 
     */
    public void iPBlocklistAsync(
                final String ip,
                final APICallBack<IPBlocklistResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/ip-blocklist");

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
                            IPBlocklistResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<IPBlocklistResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null) {
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
     * SMTP based email address verification. See: https://www.neutrinoapi.com/api/email-verify/
     * @param    email    Required parameter: An email address
     * @param    fixTypos    Optional parameter: Automatically attempt to fix typos in the address
     * @return    Returns the EmailVerifyResponse response from the API call 
     */
    public EmailVerifyResponse emailVerify(
                final String email,
                final Boolean fixTypos
    ) throws Throwable {
        APICallBackCatcher<EmailVerifyResponse> callback = new APICallBackCatcher<EmailVerifyResponse>();
        emailVerifyAsync(email, fixTypos, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * SMTP based email address verification. See: https://www.neutrinoapi.com/api/email-verify/
     * @param    email    Required parameter: An email address
     * @param    fixTypos    Optional parameter: Automatically attempt to fix typos in the address
     * @return    Returns the void response from the API call 
     */
    public void emailVerifyAsync(
                final String email,
                final Boolean fixTypos,
                final APICallBack<EmailVerifyResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/email-verify");

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
                    _parameters.put("email", email);
                    _parameters.put("output-case", "camel");
                    if (fixTypos != null) {
                        _parameters.put("fix-typos", (fixTypos != null) ? fixTypos : false);
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
                            EmailVerifyResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<EmailVerifyResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null) {
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
     * Check the reputation of an IP address, domain name, FQDN or URL against a comprehensive list of blacklists and blocklists. See: https://www.neutrinoapi.com/api/host-reputation/
     * @param    host    Required parameter: An IP address, domain name, FQDN or URL.<br/>If you supply a domain/URL it will be checked against the URI DNSBL lists
     * @param    listRating    Optional parameter: Only check lists with this rating or better
     * @return    Returns the HostReputationResponse response from the API call 
     */
    public HostReputationResponse hostReputation(
                final String host,
                final Integer listRating
    ) throws Throwable {
        APICallBackCatcher<HostReputationResponse> callback = new APICallBackCatcher<HostReputationResponse>();
        hostReputationAsync(host, listRating, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Check the reputation of an IP address, domain name, FQDN or URL against a comprehensive list of blacklists and blocklists. See: https://www.neutrinoapi.com/api/host-reputation/
     * @param    host    Required parameter: An IP address, domain name, FQDN or URL.<br/>If you supply a domain/URL it will be checked against the URI DNSBL lists
     * @param    listRating    Optional parameter: Only check lists with this rating or better
     * @return    Returns the void response from the API call 
     */
    public void hostReputationAsync(
                final String host,
                final Integer listRating,
                final APICallBack<HostReputationResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/host-reputation");

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
                    _parameters.put("host", host);
                    if (listRating != null) {
                        _parameters.put("list-rating", (listRating != null) ? listRating : 3);
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
                            HostReputationResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<HostReputationResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null) {
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
     * Analyze and extract provider information for an IP address. See: https://www.neutrinoapi.com/api/ip-probe/
     * @param    ip    Required parameter: IPv4 or IPv6 address
     * @return    Returns the IPProbeResponse response from the API call 
     */
    public IPProbeResponse iPProbe(
                final String ip
    ) throws Throwable {
        APICallBackCatcher<IPProbeResponse> callback = new APICallBackCatcher<IPProbeResponse>();
        iPProbeAsync(ip, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Analyze and extract provider information for an IP address. See: https://www.neutrinoapi.com/api/ip-probe/
     * @param    ip    Required parameter: IPv4 or IPv6 address
     * @return    Returns the void response from the API call 
     */
    public void iPProbeAsync(
                final String ip,
                final APICallBack<IPProbeResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/ip-probe");

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
                            IPProbeResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<IPProbeResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null) {
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