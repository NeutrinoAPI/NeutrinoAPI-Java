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

public class Telephony extends BaseController {
    //private static variables for the singleton pattern
    private static final Object syncObject = new Object();
    private static Telephony instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the Telephony class 
     */
    public static Telephony getInstance() {
        if (null == instance) {
            synchronized (syncObject) {
                if (null == instance) {
                    instance = new Telephony();
                }
            }
        }
        return instance;
    }

    /**
     * Make an automated call to any valid phone number and playback a unique security code. See: https://www.neutrinoapi.com/api/phone-verify/
     * @param    number    Required parameter: The phone number to send the verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    playbackDelay    Optional parameter: The delay in milliseconds between the playback of each security code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to playback the verification code in, available languages are:<ul><li>de - German</li><li>en - English</li><li>es - Spanish</li><li>fr - French</li><li>it - Italian</li><li>pt - Portuguese</li><li>ru - Russian</li></ul>
     * @return    Returns the PhoneVerifyResponse response from the API call 
     */
    public PhoneVerifyResponse phoneVerify(
                final String number,
                final Integer codeLength,
                final Integer securityCode,
                final Integer playbackDelay,
                final String countryCode,
                final String languageCode
    ) throws Throwable {
        APICallBackCatcher<PhoneVerifyResponse> callback = new APICallBackCatcher<PhoneVerifyResponse>();
        phoneVerifyAsync(number, codeLength, securityCode, playbackDelay, countryCode, languageCode, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Make an automated call to any valid phone number and playback a unique security code. See: https://www.neutrinoapi.com/api/phone-verify/
     * @param    number    Required parameter: The phone number to send the verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    playbackDelay    Optional parameter: The delay in milliseconds between the playback of each security code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to playback the verification code in, available languages are:<ul><li>de - German</li><li>en - English</li><li>es - Spanish</li><li>fr - French</li><li>it - Italian</li><li>pt - Portuguese</li><li>ru - Russian</li></ul>
     * @return    Returns the void response from the API call 
     */
    public void phoneVerifyAsync(
                final String number,
                final Integer codeLength,
                final Integer securityCode,
                final Integer playbackDelay,
                final String countryCode,
                final String languageCode,
                final APICallBack<PhoneVerifyResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/phone-verify");

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
                    if (codeLength != null) {
                        _parameters.put("code-length", (codeLength != null) ? codeLength : 6);
                    }
                    if (securityCode != null) {
                        _parameters.put("security-code", securityCode);
                    }
                    if (playbackDelay != null) {
                        _parameters.put("playback-delay", (playbackDelay != null) ? playbackDelay : 800);
                    }
                    if (countryCode != null) {
                        _parameters.put("country-code", countryCode);
                    }
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
                            PhoneVerifyResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<PhoneVerifyResponse>(){});

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
     * Send a free-form message to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-message/
     * @param    number    Required parameter: The phone number to send a message to
     * @param    message    Required parameter: The SMS message to send. Messages are truncated to a maximum of 150 characters for ASCII content OR 70 characters for UTF content
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @return    Returns the SMSMessageResponse response from the API call 
     */
    public SMSMessageResponse sMSMessage(
                final String number,
                final String message,
                final String countryCode
    ) throws Throwable {
        APICallBackCatcher<SMSMessageResponse> callback = new APICallBackCatcher<SMSMessageResponse>();
        sMSMessageAsync(number, message, countryCode, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Send a free-form message to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-message/
     * @param    number    Required parameter: The phone number to send a message to
     * @param    message    Required parameter: The SMS message to send. Messages are truncated to a maximum of 150 characters for ASCII content OR 70 characters for UTF content
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @return    Returns the void response from the API call 
     */
    public void sMSMessageAsync(
                final String number,
                final String message,
                final String countryCode,
                final APICallBack<SMSMessageResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/sms-message");

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
                    _parameters.put("message", message);
                    if (countryCode != null) {
                        _parameters.put("country-code", countryCode);
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
                            SMSMessageResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SMSMessageResponse>(){});

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
     * Send a unique security code to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-verify/
     * @param    number    Required parameter: The phone number to send a verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (must be between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to send the verification code in, available languages are:<ul><li>de - German</li><li>en - English</li><li>es - Spanish</li><li>fr - French</li><li>it - Italian</li><li>pt - Portuguese</li><li>ru - Russian</li></ul>
     * @return    Returns the SMSVerifyResponse response from the API call 
     */
    public SMSVerifyResponse sMSVerify(
                final String number,
                final Integer codeLength,
                final Integer securityCode,
                final String countryCode,
                final String languageCode
    ) throws Throwable {
        APICallBackCatcher<SMSVerifyResponse> callback = new APICallBackCatcher<SMSVerifyResponse>();
        sMSVerifyAsync(number, codeLength, securityCode, countryCode, languageCode, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Send a unique security code to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-verify/
     * @param    number    Required parameter: The phone number to send a verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (must be between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to send the verification code in, available languages are:<ul><li>de - German</li><li>en - English</li><li>es - Spanish</li><li>fr - French</li><li>it - Italian</li><li>pt - Portuguese</li><li>ru - Russian</li></ul>
     * @return    Returns the void response from the API call 
     */
    public void sMSVerifyAsync(
                final String number,
                final Integer codeLength,
                final Integer securityCode,
                final String countryCode,
                final String languageCode,
                final APICallBack<SMSVerifyResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/sms-verify");

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
                    if (codeLength != null) {
                        _parameters.put("code-length", (codeLength != null) ? codeLength : 5);
                    }
                    if (securityCode != null) {
                        _parameters.put("security-code", securityCode);
                    }
                    if (countryCode != null) {
                        _parameters.put("country-code", countryCode);
                    }
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
                            SMSVerifyResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SMSVerifyResponse>(){});

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
     * Check if a security code from one of the verify APIs is valid. See: https://www.neutrinoapi.com/api/verify-security-code/
     * @param    securityCode    Required parameter: The security code to verify
     * @return    Returns the VerifySecurityCodeResponse response from the API call 
     */
    public VerifySecurityCodeResponse verifySecurityCode(
                final String securityCode
    ) throws Throwable {
        APICallBackCatcher<VerifySecurityCodeResponse> callback = new APICallBackCatcher<VerifySecurityCodeResponse>();
        verifySecurityCodeAsync(securityCode, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Check if a security code from one of the verify APIs is valid. See: https://www.neutrinoapi.com/api/verify-security-code/
     * @param    securityCode    Required parameter: The security code to verify
     * @return    Returns the void response from the API call 
     */
    public void verifySecurityCodeAsync(
                final String securityCode,
                final APICallBack<VerifySecurityCodeResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/verify-security-code");

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
                    _parameters.put("security-code", securityCode);

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
                            VerifySecurityCodeResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<VerifySecurityCodeResponse>(){});

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
     * Make an automated call to any valid phone number and playback an audio message. See: https://www.neutrinoapi.com/api/phone-playback/
     * @param    number    Required parameter: The phone number to call. Must be in valid international format
     * @param    audioUrl    Required parameter: A URL to a valid audio file. Accepted audio formats are:<ul><li>MP3</li><li>WAV</li><li>OGG</ul></ul>You can use the following MP3 URL for testing:<br/>https://www.neutrinoapi.com/test-files/test1.mp3
     * @return    Returns the PhonePlaybackResponse response from the API call 
     */
    public PhonePlaybackResponse phonePlayback(
                final String number,
                final String audioUrl
    ) throws Throwable {
        APICallBackCatcher<PhonePlaybackResponse> callback = new APICallBackCatcher<PhonePlaybackResponse>();
        phonePlaybackAsync(number, audioUrl, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Make an automated call to any valid phone number and playback an audio message. See: https://www.neutrinoapi.com/api/phone-playback/
     * @param    number    Required parameter: The phone number to call. Must be in valid international format
     * @param    audioUrl    Required parameter: A URL to a valid audio file. Accepted audio formats are:<ul><li>MP3</li><li>WAV</li><li>OGG</ul></ul>You can use the following MP3 URL for testing:<br/>https://www.neutrinoapi.com/test-files/test1.mp3
     * @return    Returns the void response from the API call 
     */
    public void phonePlaybackAsync(
                final String number,
                final String audioUrl,
                final APICallBack<PhonePlaybackResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/phone-playback");

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
                    _parameters.put("audio-url", audioUrl);

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
                            PhonePlaybackResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<PhonePlaybackResponse>(){});

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
     * Connect to the global mobile cellular network and retrieve the status of a mobile device. See: https://www.neutrinoapi.com/api/hlr-lookup/
     * @param    number    Required parameter: A phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @return    Returns the HLRLookupResponse response from the API call 
     */
    public HLRLookupResponse hLRLookup(
                final String number,
                final String countryCode
    ) throws Throwable {
        APICallBackCatcher<HLRLookupResponse> callback = new APICallBackCatcher<HLRLookupResponse>();
        hLRLookupAsync(number, countryCode, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Connect to the global mobile cellular network and retrieve the status of a mobile device. See: https://www.neutrinoapi.com/api/hlr-lookup/
     * @param    number    Required parameter: A phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country.<br/>If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @return    Returns the void response from the API call 
     */
    public void hLRLookupAsync(
                final String number,
                final String countryCode,
                final APICallBack<HLRLookupResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {
                final HttpRequest _request;

                try {
                    //the base uri for api requests
                    String _baseUri = Configuration.baseUri;

                    //prepare query string for API call
                    StringBuilder _queryBuilder = new StringBuilder("/hlr-lookup");

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
                            HLRLookupResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<HLRLookupResponse>(){});

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