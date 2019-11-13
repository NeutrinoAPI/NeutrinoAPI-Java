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
     * Analyze and extract provider information for an IP address. See: https://www.neutrinoapi.com/api/ip-probe/
     * @param    ip    Required parameter: IPv4 or IPv6 address
     * @return    Returns the IPProbeResponse response from the API call 
     */
    public IPProbeResponse iPProbe(
                final String ip
    ) throws Throwable {

        HttpRequest _request = _buildIPProbeRequest(ip);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleIPProbeResponse(_context);
    }

    /**
     * Analyze and extract provider information for an IP address. See: https://www.neutrinoapi.com/api/ip-probe/
     * @param    ip    Required parameter: IPv4 or IPv6 address
     */
    public void iPProbeAsync(
                final String ip,
                final APICallBack<IPProbeResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildIPProbeRequest(ip);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            IPProbeResponse returnValue = _handleIPProbeResponse(_context);
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
     * Builds the HttpRequest object for iPProbe
     */
    private HttpRequest _buildIPProbeRequest(
                final String ip) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ip-probe");

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

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for iPProbe
     * @return An object of type IPProbeResponse
     */
    private IPProbeResponse _handleIPProbeResponse(HttpContext _context)
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
        IPProbeResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<IPProbeResponse>(){});

        return _result;
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

        HttpRequest _request = _buildEmailVerifyRequest(email, fixTypos);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleEmailVerifyResponse(_context);
    }

    /**
     * SMTP based email address verification. See: https://www.neutrinoapi.com/api/email-verify/
     * @param    email    Required parameter: An email address
     * @param    fixTypos    Optional parameter: Automatically attempt to fix typos in the address
     */
    public void emailVerifyAsync(
                final String email,
                final Boolean fixTypos,
                final APICallBack<EmailVerifyResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildEmailVerifyRequest(email, fixTypos);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            EmailVerifyResponse returnValue = _handleEmailVerifyResponse(_context);
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
     * Builds the HttpRequest object for emailVerify
     */
    private HttpRequest _buildEmailVerifyRequest(
                final String email,
                final Boolean fixTypos) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/email-verify");

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
        _parameters.put("email", email);
        _parameters.put("output-case", "camel");
        if (fixTypos != null) {
            _parameters.put("fix-typos", (fixTypos != null) ? fixTypos : false);
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
     * Processes the response for emailVerify
     * @return An object of type EmailVerifyResponse
     */
    private EmailVerifyResponse _handleEmailVerifyResponse(HttpContext _context)
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
        EmailVerifyResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<EmailVerifyResponse>(){});

        return _result;
    }

    /**
     * The IP Blocklist API will detect potentially malicious or dangerous IP addresses. See: https://www.neutrinoapi.com/api/ip-blocklist/
     * @param    ip    Required parameter: An IPv4 or IPv6 address
     * @return    Returns the IPBlocklistResponse response from the API call 
     */
    public IPBlocklistResponse iPBlocklist(
                final String ip
    ) throws Throwable {

        HttpRequest _request = _buildIPBlocklistRequest(ip);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleIPBlocklistResponse(_context);
    }

    /**
     * The IP Blocklist API will detect potentially malicious or dangerous IP addresses. See: https://www.neutrinoapi.com/api/ip-blocklist/
     * @param    ip    Required parameter: An IPv4 or IPv6 address
     */
    public void iPBlocklistAsync(
                final String ip,
                final APICallBack<IPBlocklistResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildIPBlocklistRequest(ip);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            IPBlocklistResponse returnValue = _handleIPBlocklistResponse(_context);
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
     * Builds the HttpRequest object for iPBlocklist
     */
    private HttpRequest _buildIPBlocklistRequest(
                final String ip) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/ip-blocklist");

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

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for iPBlocklist
     * @return An object of type IPBlocklistResponse
     */
    private IPBlocklistResponse _handleIPBlocklistResponse(HttpContext _context)
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
        IPBlocklistResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<IPBlocklistResponse>(){});

        return _result;
    }

    /**
     * Check the reputation of an IP address, domain name, FQDN or URL against a comprehensive list of blacklists and blocklists. See: https://www.neutrinoapi.com/api/host-reputation/
     * @param    host    Required parameter: An IP address, domain name, FQDN or URL. If you supply a domain/URL it will be checked against the URI DNSBL lists
     * @param    listRating    Optional parameter: Only check lists with this rating or better
     * @return    Returns the HostReputationResponse response from the API call 
     */
    public HostReputationResponse hostReputation(
                final String host,
                final Integer listRating
    ) throws Throwable {

        HttpRequest _request = _buildHostReputationRequest(host, listRating);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleHostReputationResponse(_context);
    }

    /**
     * Check the reputation of an IP address, domain name, FQDN or URL against a comprehensive list of blacklists and blocklists. See: https://www.neutrinoapi.com/api/host-reputation/
     * @param    host    Required parameter: An IP address, domain name, FQDN or URL. If you supply a domain/URL it will be checked against the URI DNSBL lists
     * @param    listRating    Optional parameter: Only check lists with this rating or better
     */
    public void hostReputationAsync(
                final String host,
                final Integer listRating,
                final APICallBack<HostReputationResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildHostReputationRequest(host, listRating);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            HostReputationResponse returnValue = _handleHostReputationResponse(_context);
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
     * Builds the HttpRequest object for hostReputation
     */
    private HttpRequest _buildHostReputationRequest(
                final String host,
                final Integer listRating) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/host-reputation");

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
        _parameters.put("host", host);
        if (listRating != null) {
            _parameters.put("list-rating", (listRating != null) ? listRating : 3);
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
     * Processes the response for hostReputation
     * @return An object of type HostReputationResponse
     */
    private HostReputationResponse _handleHostReputationResponse(HttpContext _context)
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
        HostReputationResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<HostReputationResponse>(){});

        return _result;
    }

}
