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

public class DataTools extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static DataTools instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the DataTools class 
     */
    public static DataTools getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new DataTools();
                }
            }
        }
        return instance;
    }

    /**
     * Parse, validate and get detailed user-agent information from a user agent string. See: https://www.neutrinoapi.com/api/user-agent-info/
     * @param    userAgent    Required parameter: A user agent string
     * @return    Returns the UserAgentInfoResponse response from the API call 
     */
    public UserAgentInfoResponse userAgentInfo(
                final String userAgent
    ) throws Throwable {
        APICallBackCatcher<UserAgentInfoResponse> callback = new APICallBackCatcher<UserAgentInfoResponse>();
        userAgentInfoAsync(userAgent, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Parse, validate and get detailed user-agent information from a user agent string. See: https://www.neutrinoapi.com/api/user-agent-info/
     * @param    userAgent    Required parameter: A user agent string
     * @return    Returns the void response from the API call 
     */
    public void userAgentInfoAsync(
                final String userAgent,
                final APICallBack<UserAgentInfoResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/user-agent-info");

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
                    _parameters.put("user-agent", userAgent);

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
                            UserAgentInfoResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<UserAgentInfoResponse>(){});

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
     * Parse, validate and get location information about a phone number. See: https://www.neutrinoapi.com/api/phone-validate/
     * @param    number    Required parameter: A phone number. This can be in international format (E.164) or local format. If passing local format you should use the 'country-code' or 'ip' options as well
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    ip    Optional parameter: Pass in a users IP address and we will assume numbers are based in the country of the IP address
     * @return    Returns the PhoneValidateResponse response from the API call 
     */
    public PhoneValidateResponse phoneValidate(
                final String number,
                final String countryCode,
                final String ip
    ) throws Throwable {
        APICallBackCatcher<PhoneValidateResponse> callback = new APICallBackCatcher<PhoneValidateResponse>();
        phoneValidateAsync(number, countryCode, ip, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Parse, validate and get location information about a phone number. See: https://www.neutrinoapi.com/api/phone-validate/
     * @param    number    Required parameter: A phone number. This can be in international format (E.164) or local format. If passing local format you should use the 'country-code' or 'ip' options as well
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    ip    Optional parameter: Pass in a users IP address and we will assume numbers are based in the country of the IP address
     * @return    Returns the void response from the API call 
     */
    public void phoneValidateAsync(
                final String number,
                final String countryCode,
                final String ip,
                final APICallBack<PhoneValidateResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/phone-validate");

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
                    _parameters.put("number", number);
                    if (countryCode != null) {
                        _parameters.put("country-code", countryCode);
                    }
                    if (ip != null) {
                        _parameters.put("ip", ip);
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
                            PhoneValidateResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<PhoneValidateResponse>(){});

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
     * A powerful unit conversion tool. See: https://www.neutrinoapi.com/api/convert/
     * @param    fromValue    Required parameter: The value to convert from (e.g. 10.95)
     * @param    fromType    Required parameter: The type of the value to convert from (e.g. USD)
     * @param    toType    Required parameter: The type to convert to (e.g. EUR)
     * @return    Returns the ConvertResponse response from the API call 
     */
    public ConvertResponse convert(
                final String fromValue,
                final String fromType,
                final String toType
    ) throws Throwable {
        APICallBackCatcher<ConvertResponse> callback = new APICallBackCatcher<ConvertResponse>();
        convertAsync(fromValue, fromType, toType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * A powerful unit conversion tool. See: https://www.neutrinoapi.com/api/convert/
     * @param    fromValue    Required parameter: The value to convert from (e.g. 10.95)
     * @param    fromType    Required parameter: The type of the value to convert from (e.g. USD)
     * @param    toType    Required parameter: The type to convert to (e.g. EUR)
     * @return    Returns the void response from the API call 
     */
    public void convertAsync(
                final String fromValue,
                final String fromType,
                final String toType,
                final APICallBack<ConvertResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/convert");

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
                    _parameters.put("from-value", fromValue);
                    _parameters.put("from-type", fromType);
                    _parameters.put("to-type", toType);

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
                            ConvertResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<ConvertResponse>(){});

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
     * Detect bad words, swear words and profanity in a given text. See: https://www.neutrinoapi.com/api/bad-word-filter/
     * @param    content    Required parameter: The content to scan. This can be either a URL to load content from or an actual content string
     * @param    censorCharacter    Optional parameter: The character to use to censor out the bad words found
     * @return    Returns the BadWordFilterResponse response from the API call 
     */
    public BadWordFilterResponse badWordFilter(
                final String content,
                final String censorCharacter
    ) throws Throwable {
        APICallBackCatcher<BadWordFilterResponse> callback = new APICallBackCatcher<BadWordFilterResponse>();
        badWordFilterAsync(content, censorCharacter, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Detect bad words, swear words and profanity in a given text. See: https://www.neutrinoapi.com/api/bad-word-filter/
     * @param    content    Required parameter: The content to scan. This can be either a URL to load content from or an actual content string
     * @param    censorCharacter    Optional parameter: The character to use to censor out the bad words found
     * @return    Returns the void response from the API call 
     */
    public void badWordFilterAsync(
                final String content,
                final String censorCharacter,
                final APICallBack<BadWordFilterResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/bad-word-filter");

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
                    _parameters.put("content", content);
                    if (censorCharacter != null) {
                        _parameters.put("censor-character", censorCharacter);
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
                            BadWordFilterResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<BadWordFilterResponse>(){});

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
     * Parse, validate and clean an email address. See: https://www.neutrinoapi.com/api/email-validate/
     * @param    email    Required parameter: An email address
     * @param    fixTypos    Optional parameter: Automatically attempt to fix typos in the address
     * @return    Returns the EmailValidateResponse response from the API call 
     */
    public EmailValidateResponse emailValidate(
                final String email,
                final Boolean fixTypos
    ) throws Throwable {
        APICallBackCatcher<EmailValidateResponse> callback = new APICallBackCatcher<EmailValidateResponse>();
        emailValidateAsync(email, fixTypos, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Parse, validate and clean an email address. See: https://www.neutrinoapi.com/api/email-validate/
     * @param    email    Required parameter: An email address
     * @param    fixTypos    Optional parameter: Automatically attempt to fix typos in the address
     * @return    Returns the void response from the API call 
     */
    public void emailValidateAsync(
                final String email,
                final Boolean fixTypos,
                final APICallBack<EmailValidateResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/email-validate");

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
                    _parameters.put("email", email);
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
                            EmailValidateResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<EmailValidateResponse>(){});

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