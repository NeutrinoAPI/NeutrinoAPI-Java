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

public class ECommerce extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static ECommerce instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the ECommerce class 
     */
    public static ECommerce getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new ECommerce();
                }
            }
        }
        return instance;
    }

    /**
     * Perform a BIN (Bank Identification Number) or IIN (Issuer Identification Number) lookup. See: https://www.neutrinoapi.com/api/bin-lookup/
     * @param    binNumber    Required parameter: The BIN or IIN number (the first 6 digits of a credit card number)
     * @param    customerIp    Optional parameter: Pass in the customers IP address and we will return some extra information about them
     * @return    Returns the BINLookupResponse response from the API call 
     */
    public BINLookupResponse bINLookup(
                final String binNumber,
                final String customerIp
    ) throws Throwable {

        HttpRequest _request = _buildBINLookupRequest(binNumber, customerIp);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleBINLookupResponse(_context);
    }

    /**
     * Perform a BIN (Bank Identification Number) or IIN (Issuer Identification Number) lookup. See: https://www.neutrinoapi.com/api/bin-lookup/
     * @param    binNumber    Required parameter: The BIN or IIN number (the first 6 digits of a credit card number)
     * @param    customerIp    Optional parameter: Pass in the customers IP address and we will return some extra information about them
     * @return    Returns the void response from the API call 
     */
    public void bINLookupAsync(
                final String binNumber,
                final String customerIp,
                final APICallBack<BINLookupResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildBINLookupRequest(binNumber, customerIp);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BINLookupResponse returnValue = _handleBINLookupResponse(_context);
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
     * Builds the HttpRequest object for bINLookup
     */
    private HttpRequest _buildBINLookupRequest(
                final String binNumber,
                final String customerIp) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/bin-lookup");

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
        _parameters.put("bin-number", binNumber);
        if (customerIp != null) {
            _parameters.put("customer-ip", customerIp);
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
     * Processes the response for bINLookup
     * @return An object of type void
     */
    private BINLookupResponse _handleBINLookupResponse(HttpContext _context)
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
        BINLookupResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BINLookupResponse>(){});

        return _result;
    }

}
