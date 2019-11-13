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

public class WWW extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static WWW instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the WWW class 
     */
    public static WWW getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new WWW();
                }
            }
        }
        return instance;
    }

    /**
     * Parse, analyze and retrieve content from the supplied URL. See: https://www.neutrinoapi.com/api/url-info/
     * @param    url    Required parameter: The URL to probe
     * @param    fetchContent    Optional parameter: If this URL responds with html, text, json or xml then return the response. This option is useful if you want to perform further processing on the URL content (e.g. with the HTML Extract or HTML Clean APIs)
     * @param    ignoreCertificateErrors    Optional parameter: Ignore any TLS/SSL certificate errors and load the URL anyway
     * @param    timeout    Optional parameter: Timeout in seconds. Give up if still trying to load the URL after this number of seconds
     * @return    Returns the URLInfoResponse response from the API call 
     */
    public URLInfoResponse uRLInfo(
                final String url,
                final Boolean fetchContent,
                final Boolean ignoreCertificateErrors,
                final Integer timeout
    ) throws Throwable {

        HttpRequest _request = _buildURLInfoRequest(url, fetchContent, ignoreCertificateErrors, timeout);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleURLInfoResponse(_context);
    }

    /**
     * Parse, analyze and retrieve content from the supplied URL. See: https://www.neutrinoapi.com/api/url-info/
     * @param    url    Required parameter: The URL to probe
     * @param    fetchContent    Optional parameter: If this URL responds with html, text, json or xml then return the response. This option is useful if you want to perform further processing on the URL content (e.g. with the HTML Extract or HTML Clean APIs)
     * @param    ignoreCertificateErrors    Optional parameter: Ignore any TLS/SSL certificate errors and load the URL anyway
     * @param    timeout    Optional parameter: Timeout in seconds. Give up if still trying to load the URL after this number of seconds
     */
    public void uRLInfoAsync(
                final String url,
                final Boolean fetchContent,
                final Boolean ignoreCertificateErrors,
                final Integer timeout,
                final APICallBack<URLInfoResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildURLInfoRequest(url, fetchContent, ignoreCertificateErrors, timeout);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            URLInfoResponse returnValue = _handleURLInfoResponse(_context);
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
     * Builds the HttpRequest object for uRLInfo
     */
    private HttpRequest _buildURLInfoRequest(
                final String url,
                final Boolean fetchContent,
                final Boolean ignoreCertificateErrors,
                final Integer timeout) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/url-info");

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
        _parameters.put("url", url);
        if (fetchContent != null) {
            _parameters.put("fetch-content", (fetchContent != null) ? fetchContent : false);
        }
        if (ignoreCertificateErrors != null) {
            _parameters.put("ignore-certificate-errors", (ignoreCertificateErrors != null) ? ignoreCertificateErrors : false);
        }
        if (timeout != null) {
            _parameters.put("timeout", (timeout != null) ? timeout : 20);
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
     * Processes the response for uRLInfo
     * @return An object of type URLInfoResponse
     */
    private URLInfoResponse _handleURLInfoResponse(HttpContext _context)
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
        URLInfoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<URLInfoResponse>(){});

        return _result;
    }

    /**
     * Clean and sanitize untrusted HTML. See: https://www.neutrinoapi.com/api/html-clean/
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    outputType    Required parameter: The level of sanitization, possible values are: <b>plain-text</b>: reduce the content to plain text only (no HTML tags at all) <b>simple-text</b>: allow only very basic text formatting tags like b, em, i, strong, u <b>basic-html</b>: allow advanced text formatting and hyper links <b>basic-html-with-images</b>: same as basic html but also allows image tags <b>advanced-html</b>: same as basic html with images but also allows many more common HTML tags like table, ul, dl, pre
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream hTMLClean(
                final String content,
                final String outputType
    ) throws Throwable {

        HttpRequest _request = _buildHTMLCleanRequest(content, outputType);
        HttpResponse _response = getClientInstance().executeAsBinary(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleHTMLCleanResponse(_context);
    }

    /**
     * Clean and sanitize untrusted HTML. See: https://www.neutrinoapi.com/api/html-clean/
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    outputType    Required parameter: The level of sanitization, possible values are: <b>plain-text</b>: reduce the content to plain text only (no HTML tags at all) <b>simple-text</b>: allow only very basic text formatting tags like b, em, i, strong, u <b>basic-html</b>: allow advanced text formatting and hyper links <b>basic-html-with-images</b>: same as basic html but also allows image tags <b>advanced-html</b>: same as basic html with images but also allows many more common HTML tags like table, ul, dl, pre
     */
    public void hTMLCleanAsync(
                final String content,
                final String outputType,
                final APICallBack<InputStream> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildHTMLCleanRequest(content, outputType);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            InputStream returnValue = _handleHTMLCleanResponse(_context);
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
     * Builds the HttpRequest object for hTMLClean
     */
    private HttpRequest _buildHTMLCleanRequest(
                final String content,
                final String outputType) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/html-clean");

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


        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>();
        _parameters.put("content", content);
        _parameters.put("output-type", outputType);

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for hTMLClean
     * @return An object of type InputStream
     */
    private InputStream _handleHTMLCleanResponse(HttpContext _context)
            throws APIException, IOException {
        HttpResponse _response = _context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnAfterResponse(_context);
        }

        //handle errors defined at the API level
        validateResponse(_response, _context);

        //extract result from the http response
        InputStream _result = _response.getRawBody();
        return _result;
    }

    /**
     * Browser bot can extract content, interact with keyboard and mouse events, and execute JavaScript on a website. See: https://www.neutrinoapi.com/api/browser-bot/
     * @param    url    Required parameter: The URL to load
     * @param    timeout    Optional parameter: Timeout in seconds. Give up if still trying to load the page after this number of seconds
     * @param    delay    Optional parameter: Delay in seconds to wait before capturing any page data, executing selectors or JavaScript
     * @param    selector    Optional parameter: Extract content from the page DOM using this selector. Commonly known as a CSS selector, you can find a good reference <a href="https://www.w3schools.com/cssref/css_selectors.asp">here</a>
     * @param    exec    Optional parameter: Execute JavaScript on the page. Each array element should contain a valid JavaScript statement in string form. If a statement returns any kind of value it will be returned in the 'exec-results' response. For your convenience you can also use the following special shortcut functions: <div> sleep(seconds); Just wait/sleep for the specified number of seconds. click('selector'); Click on the first element matching the given selector. focus('selector'); Focus on the first element matching the given selector. keys('characters'); Send the specified keyboard characters. Use click() or focus() first to send keys to a specific element. enter(); Send the Enter key. tab(); Send the Tab key. </div> Example: <div> [ "click('#button-id')", "sleep(1)", "click('.field-class')", "keys('1234')", "enter()" ] </div>
     * @param    userAgent    Optional parameter: Override the browsers default user-agent string with this one
     * @param    ignoreCertificateErrors    Optional parameter: Ignore any TLS/SSL certificate errors and load the page anyway
     * @return    Returns the BrowserBotResponse response from the API call 
     */
    public BrowserBotResponse browserBot(
                final String url,
                final Integer timeout,
                final Integer delay,
                final String selector,
                final List<String> exec,
                final String userAgent,
                final Boolean ignoreCertificateErrors
    ) throws Throwable {

        HttpRequest _request = _buildBrowserBotRequest(url, timeout, delay, selector, exec, userAgent, ignoreCertificateErrors);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleBrowserBotResponse(_context);
    }

    /**
     * Browser bot can extract content, interact with keyboard and mouse events, and execute JavaScript on a website. See: https://www.neutrinoapi.com/api/browser-bot/
     * @param    url    Required parameter: The URL to load
     * @param    timeout    Optional parameter: Timeout in seconds. Give up if still trying to load the page after this number of seconds
     * @param    delay    Optional parameter: Delay in seconds to wait before capturing any page data, executing selectors or JavaScript
     * @param    selector    Optional parameter: Extract content from the page DOM using this selector. Commonly known as a CSS selector, you can find a good reference <a href="https://www.w3schools.com/cssref/css_selectors.asp">here</a>
     * @param    exec    Optional parameter: Execute JavaScript on the page. Each array element should contain a valid JavaScript statement in string form. If a statement returns any kind of value it will be returned in the 'exec-results' response. For your convenience you can also use the following special shortcut functions: <div> sleep(seconds); Just wait/sleep for the specified number of seconds. click('selector'); Click on the first element matching the given selector. focus('selector'); Focus on the first element matching the given selector. keys('characters'); Send the specified keyboard characters. Use click() or focus() first to send keys to a specific element. enter(); Send the Enter key. tab(); Send the Tab key. </div> Example: <div> [ "click('#button-id')", "sleep(1)", "click('.field-class')", "keys('1234')", "enter()" ] </div>
     * @param    userAgent    Optional parameter: Override the browsers default user-agent string with this one
     * @param    ignoreCertificateErrors    Optional parameter: Ignore any TLS/SSL certificate errors and load the page anyway
     */
    public void browserBotAsync(
                final String url,
                final Integer timeout,
                final Integer delay,
                final String selector,
                final List<String> exec,
                final String userAgent,
                final Boolean ignoreCertificateErrors,
                final APICallBack<BrowserBotResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildBrowserBotRequest(url, timeout, delay, selector, exec, userAgent, ignoreCertificateErrors);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            BrowserBotResponse returnValue = _handleBrowserBotResponse(_context);
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
     * Builds the HttpRequest object for browserBot
     */
    private HttpRequest _buildBrowserBotRequest(
                final String url,
                final Integer timeout,
                final Integer delay,
                final String selector,
                final List<String> exec,
                final String userAgent,
                final Boolean ignoreCertificateErrors) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/browser-bot");

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
        _parameters.put("url", url);
        if (timeout != null) {
            _parameters.put("timeout", (timeout != null) ? timeout : 30);
        }
        if (delay != null) {
            _parameters.put("delay", (delay != null) ? delay : 3);
        }
        if (selector != null) {
            _parameters.put("selector", selector);
        }
        if (exec != null) {
            _parameters.put("exec", exec);
        }
        if (userAgent != null) {
            _parameters.put("user-agent", userAgent);
        }
        if (ignoreCertificateErrors != null) {
            _parameters.put("ignore-certificate-errors", (ignoreCertificateErrors != null) ? ignoreCertificateErrors : false);
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
     * Processes the response for browserBot
     * @return An object of type BrowserBotResponse
     */
    private BrowserBotResponse _handleBrowserBotResponse(HttpContext _context)
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
        BrowserBotResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BrowserBotResponse>(){});

        return _result;
    }

}
