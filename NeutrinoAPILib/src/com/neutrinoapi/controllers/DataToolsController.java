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

public class DataToolsController extends BaseController {

    //private fields for configuration

   /** Your user ID */
    private String userId;

   /** Your API key */
    private String apiKey;

   /**
    * Constructor with authentication and configuration parameters */
    public DataToolsController (String userId, String apiKey) {
        this.userId = userId;
        this.apiKey = apiKey;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public DataToolsController (HttpClient _client, String userId, String apiKey) {
        super(_client);
        this.userId = userId;
        this.apiKey = apiKey;
    }

    /**
     * Parse, validate and get location information about a phone number. See: https://www.neutrinoapi.com/api/phone-validate/
     * @param    number    Required parameter: The phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
	 * @return	Returns the PhoneValidateResponse response from the API call*/
    public PhoneValidateResponse createPhoneValidate(
            final String number,
            final String countryCode
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/phone-validate");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5549816233973197270L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5584691253307710882L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5312248530997901051L;
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
        PhoneValidateResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<PhoneValidateResponse>(){});

        return result;
    }
        
    /**
     * Parse, validate and get detailed user-agent information from a user-agent string. See: https://www.neutrinoapi.com/api/user-agent-info/
     * @param    userAgent    Required parameter: A user-agent string
	 * @return	Returns the UserAgentInfoResponse response from the API call*/
    public UserAgentInfoResponse createUserAgentInfo(
            final String userAgent
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/user-agent-info");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4947172641340076858L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5169562812434934484L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5694135826381566574L;
            {
                    put( "output-case", "camel" );
                    put( "user-agent", userAgent );
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
        UserAgentInfoResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<UserAgentInfoResponse>(){});

        return result;
    }
        
    /**
     * Code highlight will take raw source code and convert into nicely formatted HTML with syntax and keyword highlighting. See: https://www.neutrinoapi.com/api/code-highlight/
     * @param    content    Required parameter: The source content. This can be either a URL to load from or an actual content string
     * @param    type    Required parameter: The code type. See the API docs for all supported types
     * @param    addKeywordLinks    Optional parameter: Add links on source code keywords to the relevant language documentation
	 * @return	Returns the InputStream response from the API call*/
    public InputStream createCodeHighlight(
            final String content,
            final String type,
            final Boolean addKeywordLinks
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/code-highlight");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4655164270480879307L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5448743273930651466L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5044989580566230484L;
            {
                    put( "content", content );
                    put( "type", type );
                    put( "add-keyword-links", (null != addKeywordLinks) ? addKeywordLinks : false );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsBinary(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        InputStream result = response.getRawBody();
        return result;
    }
        
    /**
     * Detect bad words, swear words and profanity in a given text. See: https://www.neutrinoapi.com/api/bad-word-filter/
     * @param    content    Required parameter: The text content to check. This can be either a URL to load content from or an actual content string
     * @param    censorCharacter    Optional parameter: The character to use to censor out the bad words found
	 * @return	Returns the BadWordFilterResponse response from the API call*/
    public BadWordFilterResponse createBadWordFilter(
            final String content,
            final String censorCharacter
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/bad-word-filter");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4986387881720983855L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5526284915813314088L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5542942139225199734L;
            {
                    put( "content", content );
                    put( "output-case", "camel" );
                    put( "censor-character", censorCharacter );
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
        BadWordFilterResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<BadWordFilterResponse>(){});

        return result;
    }
        
    /**
     * A powerful unit and currency conversion tool. See: https://www.neutrinoapi.com/api/convert/
     * @param    fromType    Required parameter: The type of the value to convert from
     * @param    fromValue    Required parameter: The value to convert from
     * @param    toType    Required parameter: The type to convert to
	 * @return	Returns the ConvertResponse response from the API call*/
    public ConvertResponse createConvert(
            final String fromType,
            final String fromValue,
            final String toType
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/convert");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5188701598738718897L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5225497259031828727L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5531057083481345086L;
            {
                    put( "from-type", fromType );
                    put( "from-value", fromValue );
                    put( "output-case", "camel" );
                    put( "to-type", toType );
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
        ConvertResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<ConvertResponse>(){});

        return result;
    }
        
    /**
     * Parse, validate and clean an email address. See: https://www.neutrinoapi.com/api/email-validate/
     * @param    email    Required parameter: The email address
     * @param    fixTypos    Optional parameter: Automatically attempt to fix typos in the address
	 * @return	Returns the EmailValidateResponse response from the API call*/
    public EmailValidateResponse createEmailValidate(
            final String email,
            final Boolean fixTypos
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/email-validate");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5575084175095389235L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5173015897236871912L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5319377251347345037L;
            {
                    put( "email", email );
                    put( "output-case", "camel" );
                    put( "fix-typos", (null != fixTypos) ? fixTypos : false );
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
        EmailValidateResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<EmailValidateResponse>(){});

        return result;
    }
        
    /**
     * Clean and sanitize untrusted HTML. See: https://www.neutrinoapi.com/api/html-clean/
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    outputType    Required parameter: The level of sanitization, possible values are: plain-text, simple-text, basic-html, basic-html-with-images, advanced-html
	 * @return	Returns the InputStream response from the API call*/
    public InputStream createHTMLClean(
            final String content,
            final String outputType
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/html-clean");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5564090863567713265L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5019360387347655159L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5255108712768827448L;
            {
                    put( "content", content );
                    put( "output-type", outputType );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

        //invoke request and get response
        HttpResponse response = clientInstance.executeAsBinary(request);

        //Error handling using HTTP status codes
        int responseCode = response.getStatusCode();
        if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
            throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

        //extract result from the http response
        InputStream result = response.getRawBody();
        return result;
    }
        
    /**
     * Extract HTML tag contents or attributes from complex HTML or XHTML content. See: https://www.neutrinoapi.com/api/html-extract-tags/
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    tag    Required parameter: The HTML tag(s) to extract data from. This can just be a simple tag name like 'img' OR a CSS/jQuery style selector
     * @param    attribute    Optional parameter: If set, then extract data from the specified tag attribute. If not set, then data will be extracted from the tags inner content
     * @param    baseUrl    Optional parameter: The base URL to replace into realive links
	 * @return	Returns the HTMLExtractResponse response from the API call*/
    public HTMLExtractResponse createHTMLExtract(
            final String content,
            final String tag,
            final String attribute,
            final String baseUrl
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/html-extract-tags");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4715509806015120561L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5738360626539047652L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4804256685449251161L;
            {
                    put( "content", content );
                    put( "output-case", "camel" );
                    put( "tag", tag );
                    put( "attribute", attribute );
                    put( "base-url", baseUrl );
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
        HTMLExtractResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<HTMLExtractResponse>(){});

        return result;
    }
        
}