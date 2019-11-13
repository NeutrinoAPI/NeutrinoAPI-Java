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
     * Check if a security code from one of the verify APIs is valid. See: https://www.neutrinoapi.com/api/verify-security-code/
     * @param    securityCode    Required parameter: The security code to verify
     * @return    Returns the VerifySecurityCodeResponse response from the API call 
     */
    public VerifySecurityCodeResponse verifySecurityCode(
                final String securityCode
    ) throws Throwable {

        HttpRequest _request = _buildVerifySecurityCodeRequest(securityCode);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleVerifySecurityCodeResponse(_context);
    }

    /**
     * Check if a security code from one of the verify APIs is valid. See: https://www.neutrinoapi.com/api/verify-security-code/
     * @param    securityCode    Required parameter: The security code to verify
     */
    public void verifySecurityCodeAsync(
                final String securityCode,
                final APICallBack<VerifySecurityCodeResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildVerifySecurityCodeRequest(securityCode);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            VerifySecurityCodeResponse returnValue = _handleVerifySecurityCodeResponse(_context);
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
     * Builds the HttpRequest object for verifySecurityCode
     */
    private HttpRequest _buildVerifySecurityCodeRequest(
                final String securityCode) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/verify-security-code");

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
        _parameters.put("security-code", securityCode);

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for verifySecurityCode
     * @return An object of type VerifySecurityCodeResponse
     */
    private VerifySecurityCodeResponse _handleVerifySecurityCodeResponse(HttpContext _context)
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
        VerifySecurityCodeResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<VerifySecurityCodeResponse>(){});

        return _result;
    }

    /**
     * Connect to the global mobile cellular network and retrieve the status of a mobile device. See: https://www.neutrinoapi.com/api/hlr-lookup/
     * @param    number    Required parameter: A phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @return    Returns the HLRLookupResponse response from the API call 
     */
    public HLRLookupResponse hLRLookup(
                final String number,
                final String countryCode
    ) throws Throwable {

        HttpRequest _request = _buildHLRLookupRequest(number, countryCode);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleHLRLookupResponse(_context);
    }

    /**
     * Connect to the global mobile cellular network and retrieve the status of a mobile device. See: https://www.neutrinoapi.com/api/hlr-lookup/
     * @param    number    Required parameter: A phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     */
    public void hLRLookupAsync(
                final String number,
                final String countryCode,
                final APICallBack<HLRLookupResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildHLRLookupRequest(number, countryCode);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            HLRLookupResponse returnValue = _handleHLRLookupResponse(_context);
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
     * Builds the HttpRequest object for hLRLookup
     */
    private HttpRequest _buildHLRLookupRequest(
                final String number,
                final String countryCode) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/hlr-lookup");

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
        _parameters.put("number", number);
        if (countryCode != null) {
            _parameters.put("country-code", countryCode);
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
     * Processes the response for hLRLookup
     * @return An object of type HLRLookupResponse
     */
    private HLRLookupResponse _handleHLRLookupResponse(HttpContext _context)
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
        HLRLookupResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<HLRLookupResponse>(){});

        return _result;
    }

    /**
     * Make an automated call to any valid phone number and playback an audio message. See: https://www.neutrinoapi.com/api/phone-playback/
     * @param    number    Required parameter: The phone number to call. Must be in valid international format
     * @param    audioUrl    Required parameter: A URL to a valid audio file. Accepted audio formats are: <ul> <li>MP3</li> <li>WAV</li> <li>OGG</li> </ul>You can use the following MP3 URL for testing: https://www.neutrinoapi.com/test-files/test1.mp3
     * @return    Returns the PhonePlaybackResponse response from the API call 
     */
    public PhonePlaybackResponse phonePlayback(
                final String number,
                final String audioUrl
    ) throws Throwable {

        HttpRequest _request = _buildPhonePlaybackRequest(number, audioUrl);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handlePhonePlaybackResponse(_context);
    }

    /**
     * Make an automated call to any valid phone number and playback an audio message. See: https://www.neutrinoapi.com/api/phone-playback/
     * @param    number    Required parameter: The phone number to call. Must be in valid international format
     * @param    audioUrl    Required parameter: A URL to a valid audio file. Accepted audio formats are: <ul> <li>MP3</li> <li>WAV</li> <li>OGG</li> </ul>You can use the following MP3 URL for testing: https://www.neutrinoapi.com/test-files/test1.mp3
     */
    public void phonePlaybackAsync(
                final String number,
                final String audioUrl,
                final APICallBack<PhonePlaybackResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildPhonePlaybackRequest(number, audioUrl);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            PhonePlaybackResponse returnValue = _handlePhonePlaybackResponse(_context);
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
     * Builds the HttpRequest object for phonePlayback
     */
    private HttpRequest _buildPhonePlaybackRequest(
                final String number,
                final String audioUrl) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/phone-playback");

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
        _parameters.put("number", number);
        _parameters.put("audio-url", audioUrl);

        //prepare and invoke the API call request to fetch the response
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for phonePlayback
     * @return An object of type PhonePlaybackResponse
     */
    private PhonePlaybackResponse _handlePhonePlaybackResponse(HttpContext _context)
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
        PhonePlaybackResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<PhonePlaybackResponse>(){});

        return _result;
    }

    /**
     * Send a unique security code to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-verify/
     * @param    number    Required parameter: The phone number to send a verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (must be between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to send the verification code in, available languages are: <ul> <li>de - German</li> <li>en - English</li> <li>es - Spanish</li> <li>fr - French</li> <li>it - Italian</li> <li>pt - Portuguese</li> <li>ru - Russian</li> </ul>
     * @return    Returns the SMSVerifyResponse response from the API call 
     */
    public SMSVerifyResponse sMSVerify(
                final String number,
                final Integer codeLength,
                final Integer securityCode,
                final String countryCode,
                final String languageCode
    ) throws Throwable {

        HttpRequest _request = _buildSMSVerifyRequest(number, codeLength, securityCode, countryCode, languageCode);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleSMSVerifyResponse(_context);
    }

    /**
     * Send a unique security code to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-verify/
     * @param    number    Required parameter: The phone number to send a verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (must be between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to send the verification code in, available languages are: <ul> <li>de - German</li> <li>en - English</li> <li>es - Spanish</li> <li>fr - French</li> <li>it - Italian</li> <li>pt - Portuguese</li> <li>ru - Russian</li> </ul>
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

                HttpRequest _request;
                try {
                    _request = _buildSMSVerifyRequest(number, codeLength, securityCode, countryCode, languageCode);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            SMSVerifyResponse returnValue = _handleSMSVerifyResponse(_context);
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
     * Builds the HttpRequest object for sMSVerify
     */
    private HttpRequest _buildSMSVerifyRequest(
                final String number,
                final Integer codeLength,
                final Integer securityCode,
                final String countryCode,
                final String languageCode) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/sms-verify");

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
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for sMSVerify
     * @return An object of type SMSVerifyResponse
     */
    private SMSVerifyResponse _handleSMSVerifyResponse(HttpContext _context)
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
        SMSVerifyResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SMSVerifyResponse>(){});

        return _result;
    }

    /**
     * Send a free-form message to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-message/
     * @param    number    Required parameter: The phone number to send a message to
     * @param    message    Required parameter: The SMS message to send. Messages are truncated to a maximum of 150 characters for ASCII content OR 70 characters for UTF content
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @return    Returns the SMSMessageResponse response from the API call 
     */
    public SMSMessageResponse sMSMessage(
                final String number,
                final String message,
                final String countryCode
    ) throws Throwable {

        HttpRequest _request = _buildSMSMessageRequest(number, message, countryCode);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handleSMSMessageResponse(_context);
    }

    /**
     * Send a free-form message to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-message/
     * @param    number    Required parameter: The phone number to send a message to
     * @param    message    Required parameter: The SMS message to send. Messages are truncated to a maximum of 150 characters for ASCII content OR 70 characters for UTF content
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     */
    public void sMSMessageAsync(
                final String number,
                final String message,
                final String countryCode,
                final APICallBack<SMSMessageResponse> callBack
    ) {
        Runnable _responseTask = new Runnable() {
            public void run() {

                HttpRequest _request;
                try {
                    _request = _buildSMSMessageRequest(number, message, countryCode);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            SMSMessageResponse returnValue = _handleSMSMessageResponse(_context);
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
     * Builds the HttpRequest object for sMSMessage
     */
    private HttpRequest _buildSMSMessageRequest(
                final String number,
                final String message,
                final String countryCode) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/sms-message");

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
        _parameters.put("number", number);
        _parameters.put("message", message);
        if (countryCode != null) {
            _parameters.put("country-code", countryCode);
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
     * Processes the response for sMSMessage
     * @return An object of type SMSMessageResponse
     */
    private SMSMessageResponse _handleSMSMessageResponse(HttpContext _context)
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
        SMSMessageResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<SMSMessageResponse>(){});

        return _result;
    }

    /**
     * Make an automated call to any valid phone number and playback a unique security code. See: https://www.neutrinoapi.com/api/phone-verify/
     * @param    number    Required parameter: The phone number to send the verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    playbackDelay    Optional parameter: The delay in milliseconds between the playback of each security code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to playback the verification code in, available languages are: <ul> <li>de - German</li> <li>en - English</li> <li>es - Spanish</li> <li>fr - French</li> <li>it - Italian</li> <li>pt - Portuguese</li> <li>ru - Russian</li> </ul>
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

        HttpRequest _request = _buildPhoneVerifyRequest(number, codeLength, securityCode, playbackDelay, countryCode, languageCode);
        HttpResponse _response = getClientInstance().executeAsString(_request);
        HttpContext _context = new HttpContext(_request, _response);

        return _handlePhoneVerifyResponse(_context);
    }

    /**
     * Make an automated call to any valid phone number and playback a unique security code. See: https://www.neutrinoapi.com/api/phone-verify/
     * @param    number    Required parameter: The phone number to send the verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (between 4 and 12)
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code
     * @param    playbackDelay    Optional parameter: The delay in milliseconds between the playback of each security code
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to playback the verification code in, available languages are: <ul> <li>de - German</li> <li>en - English</li> <li>es - Spanish</li> <li>fr - French</li> <li>it - Italian</li> <li>pt - Portuguese</li> <li>ru - Russian</li> </ul>
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

                HttpRequest _request;
                try {
                    _request = _buildPhoneVerifyRequest(number, codeLength, securityCode, playbackDelay, countryCode, languageCode);
                } catch (Exception e) {
                    callBack.onFailure(null, e);
                    return;
                }

                // Invoke request and get response
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {
                            PhoneVerifyResponse returnValue = _handlePhoneVerifyResponse(_context);
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
     * Builds the HttpRequest object for phoneVerify
     */
    private HttpRequest _buildPhoneVerifyRequest(
                final String number,
                final Integer codeLength,
                final Integer securityCode,
                final Integer playbackDelay,
                final String countryCode,
                final String languageCode) throws IOException, APIException {
        //the base uri for api requests
        String _baseUri = Configuration.getBaseUri();

        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri + "/phone-verify");

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
        HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        // Invoke the callback before request if its not null
        if (getHttpCallBack() != null) {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        return _request;
    }

    /**
     * Processes the response for phoneVerify
     * @return An object of type PhoneVerifyResponse
     */
    private PhoneVerifyResponse _handlePhoneVerifyResponse(HttpContext _context)
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
        PhoneVerifyResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<PhoneVerifyResponse>(){});

        return _result;
    }

}
