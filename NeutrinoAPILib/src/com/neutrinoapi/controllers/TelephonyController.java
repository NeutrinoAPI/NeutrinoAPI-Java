/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
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
    public PhonePlaybackResponse createPhonePlayback(
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
            private static final long serialVersionUID = 4807947704267591789L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4754904371644639142L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5242237391003456965L;
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
    public VerifySecurityCodeResponse createVerifySecurityCode(
            final int securityCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/verify-security-code");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5375784031765034751L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5489473665395638406L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4712580562862968441L;
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
    public HLRLookupResponse createHLRLookup(
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
            private static final long serialVersionUID = 5422384821175648025L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4710922006719094209L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4643823066132516989L;
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
    public PhoneVerifyResponse createPhoneVerify(
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
            private static final long serialVersionUID = 4943858085463519089L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5529524177720220523L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5408781998706942349L;
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
    public SMSVerifyResponse createSMSVerify(
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
            private static final long serialVersionUID = 5280796237508934297L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5507594662561011907L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5677739205470137607L;
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