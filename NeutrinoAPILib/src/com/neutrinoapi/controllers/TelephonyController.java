/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.controllers;

import java.io.*;
import java.util.*;
import com.fasterxml.jackson.core.type.TypeReference;

import com.neutrinoapi.http.client.HttpClient;

import com.neutrinoapi.http.request.HttpRequest;
import com.neutrinoapi.http.response.HttpResponse;
import com.neutrinoapi.http.response.HttpStringResponse;
import com.neutrinoapi.*;
import com.neutrinoapi.models.*;

public class TelephonyController extends BaseController {

    //private fields for configuration

   /** Your user ID */
    private String userId;

   /** Your API key */
    private String apiKey;

   /**
    * Constructor with authentication and configuration parameters */
    public TelephonyController (String userId, String apiKey) {
        this.userId = userId;
        this.apiKey = apiKey;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public TelephonyController (HttpClient _client, String userId, String apiKey) {
        super(_client);
        this.userId = userId;
        this.apiKey = apiKey;
    }

    /**
     * Make an automated call to any valid phone number and playback an audio message. See: https://www.neutrinoapi.com/api/phone-playback/
     * @param    audioUrl    Required parameter: A URL to a valid audio file. Accepted audio formats are: MP3, WAV, OGG
     * @param    number    Required parameter: The phone number to call. Must be valid international format
	 * @return	Returns the PhonePlaybackResponse response from the API call*/
    public PhonePlaybackResponse phonePlayback(
            final String audioUrl,
            final String number
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/phone-playback");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4779653406190132786L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4908060614241856493L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4932001722797109285L;
            {
                    put( "audio-url", audioUrl );
                    put( "number", number );
                    put( "output-case", "camel" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        PhonePlaybackResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PhonePlaybackResponse>(){});

        return result;
    }
        
    /**
     * Check if a security code from one of the verify APIs is valid. See: https://www.neutrinoapi.com/api/verify-security-code/
     * @param    securityCode    Required parameter: The security code to verify
	 * @return	Returns the VerifySecurityCodeResponse response from the API call*/
    public VerifySecurityCodeResponse verifySecurityCode(
            final int securityCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/verify-security-code");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5188851757020101288L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4841712404989798206L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4647650483405759433L;
            {
                    put( "output-case", "camel" );
                    put( "security-code", securityCode );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        VerifySecurityCodeResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<VerifySecurityCodeResponse>(){});

        return result;
    }
        
    /**
     * Mobile network HLR lookup service. See: https://www.neutrinoapi.com/api/hlr-lookup/
     * @param    number    Required parameter: A phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
	 * @return	Returns the HLRLookupResponse response from the API call*/
    public HLRLookupResponse hLRLookup(
            final String number,
            final String countryCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/hlr-lookup");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4877837948861621448L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4633789491230078875L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5052705177438982290L;
            {
                    put( "number", number );
                    put( "output-case", "camel" );
                    put( "country-code", countryCode );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        HLRLookupResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<HLRLookupResponse>(){});

        return result;
    }
        
    /**
     * Make an automated call to any valid phone number and playback a unique security code. See: https://www.neutrinoapi.com/api/phone-verify/
     * @param    number    Required parameter: The phone number to send the verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (between 4 and 12)
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to playback the verification code in, available languages are: de - German, en - English, es - Spanish, fr - Fench, it - Italian, pt - Portuguese, ru - Russian
     * @param    playbackDelay    Optional parameter: The delay in milliseconds between the playback of each security code
     * @param    securityCode    Optional parameter: Pass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code (only numerical security codes are currently supported)
	 * @return	Returns the PhoneVerifyResponse response from the API call*/
    public PhoneVerifyResponse phoneVerify(
            final String number,
            final Integer codeLength,
            final String countryCode,
            final String languageCode,
            final Integer playbackDelay,
            final Integer securityCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/phone-verify");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5048749228349301472L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5205954295161647030L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4911088336921569205L;
            {
                    put( "number", number );
                    put( "output-case", "camel" );
                    put( "code-length", (null != codeLength) ? codeLength : 6 );
                    put( "country-code", countryCode );
                    put( "language-code", (null != languageCode) ? languageCode : "en" );
                    put( "playback-delay", (null != playbackDelay) ? playbackDelay : 800 );
                    put( "security-code", securityCode );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        PhoneVerifyResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PhoneVerifyResponse>(){});

        return result;
    }
        
    /**
     * Send a unique security code to any mobile device via SMS. See: https://www.neutrinoapi.com/api/sms-verify/
     * @param    number    Required parameter: The phone number to send a verification code to
     * @param    codeLength    Optional parameter: The number of digits to use in the security code (must be between 4 and 12)
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    languageCode    Optional parameter: The language to send the verification code in, available languages are: de - German, en - English, es - Spanish, fr - Fench, it - Italian, pt - Portuguese, ru - Russian
     * @param    securityCode    Optional parameter: ass in your own security code. This is useful if you have implemented TOTP or similar 2FA methods. If not set then we will generate a secure random code (only numerical security codes are currently supported)
	 * @return	Returns the SMSVerifyResponse response from the API call*/
    public SMSVerifyResponse sMSVerify(
            final String number,
            final Integer codeLength,
            final String countryCode,
            final String languageCode,
            final Integer securityCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/sms-verify");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5146480982624760990L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5630054183352636379L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5449818634577133591L;
            {
                    put( "number", number );
                    put( "output-case", "camel" );
                    put( "code-length", (null != codeLength) ? codeLength : 5 );
                    put( "country-code", countryCode );
                    put( "language-code", (null != languageCode) ? languageCode : "en" );
                    put( "security-code", securityCode );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsString(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        SMSVerifyResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SMSVerifyResponse>(){});

        return result;
    }
        
}