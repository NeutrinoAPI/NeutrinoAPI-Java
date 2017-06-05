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
    private static Object syncObject = new Object();
    private static DataTools instance = null;

    /**
     * Singleton pattern implementation 
     * @return The singleton instance of the DataTools class 
     */
    public static DataTools getInstance() {
        synchronized (syncObject) {
            if (null == instance) {
                instance = new DataTools();
            }
        }
        return instance;
    }

    /**
     * A powerful unit and currency conversion tool
     * @param    fromValue    Required parameter: The value to convert from
     * @param    fromType    Required parameter: The type of the value to convert from
     * @param    toType    Required parameter: The type to convert to
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
     * A powerful unit and currency conversion tool
     * @param    fromValue    Required parameter: The value to convert from
     * @param    fromType    Required parameter: The type of the value to convert from
     * @param    toType    Required parameter: The type to convert to
     * @return    Returns the void response from the API call 
     */
    public void convertAsync(
                final String fromValue,
                final String fromType,
                final String toType,
                final APICallBack<ConvertResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/convert");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4630786593520438211L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4920580870578130984L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5499972950026713164L;
            {
                    put( "output-case", "camel" );
                    put( "from-value", fromValue );
                    put( "from-type", fromType );
                    put( "to-type", toType );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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
     * Detect bad words, swear words and profanity in a given text
     * @param    content    Required parameter: The text content to check. This can be either a URL to load content from or an actual content string
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
     * Detect bad words, swear words and profanity in a given text
     * @param    content    Required parameter: The text content to check. This can be either a URL to load content from or an actual content string
     * @param    censorCharacter    Optional parameter: The character to use to censor out the bad words found
     * @return    Returns the void response from the API call 
     */
    public void badWordFilterAsync(
                final String content,
                final String censorCharacter,
                final APICallBack<BadWordFilterResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/bad-word-filter");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5638552128663807050L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5690935534699584485L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4811595726343363407L;
            {
                    put( "output-case", "camel" );
                    put( "content", content );
                    put( "censor-character", censorCharacter );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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
     * Parse, validate and clean an email address
     * @param    email    Required parameter: The email address
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
     * Parse, validate and clean an email address
     * @param    email    Required parameter: The email address
     * @param    fixTypos    Optional parameter: Automatically attempt to fix typos in the address
     * @return    Returns the void response from the API call 
     */
    public void emailValidateAsync(
                final String email,
                final Boolean fixTypos,
                final APICallBack<EmailValidateResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/email-validate");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5113696333143909523L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5269522202889222800L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5136566994409347420L;
            {
                    put( "output-case", "camel" );
                    put( "email", email );
                    put( "fix-typos", (fixTypos != null) ? fixTypos : false );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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
     * Clean and sanitize untrusted HTML
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    outputType    Required parameter: The level of sanitization, possible values are: plain-text, simple-text, basic-html, basic-html-with-images, advanced-html
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream hTMLClean(
                final String content,
                final String outputType
    ) throws Throwable {
        APICallBackCatcher<InputStream> callback = new APICallBackCatcher<InputStream>();
        hTMLCleanAsync(content, outputType, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Clean and sanitize untrusted HTML
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    outputType    Required parameter: The level of sanitization, possible values are: plain-text, simple-text, basic-html, basic-html-with-images, advanced-html
     * @return    Returns the void response from the API call 
     */
    public void hTMLCleanAsync(
                final String content,
                final String outputType,
                final APICallBack<InputStream> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/html-clean");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4969783656322076057L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5689609382955334538L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5214002550233052994L;
            {
                    put( "content", content );
                    put( "output-type", outputType );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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
     * Code highlight will take raw source code and convert into nicely formatted HTML with syntax and keyword highlighting
     * @param    content    Required parameter: The source content. This can be either a URL to load from or an actual content string
     * @param    type    Required parameter: The code type. See the API docs for all supported types
     * @param    addKeywordLinks    Optional parameter: Add links on source code keywords to the relevant language documentation
     * @return    Returns the InputStream response from the API call 
     */
    public InputStream codeHighlight(
                final String content,
                final String type,
                final Boolean addKeywordLinks
    ) throws Throwable {
        APICallBackCatcher<InputStream> callback = new APICallBackCatcher<InputStream>();
        codeHighlightAsync(content, type, addKeywordLinks, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Code highlight will take raw source code and convert into nicely formatted HTML with syntax and keyword highlighting
     * @param    content    Required parameter: The source content. This can be either a URL to load from or an actual content string
     * @param    type    Required parameter: The code type. See the API docs for all supported types
     * @param    addKeywordLinks    Optional parameter: Add links on source code keywords to the relevant language documentation
     * @return    Returns the void response from the API call 
     */
    public void codeHighlightAsync(
                final String content,
                final String type,
                final Boolean addKeywordLinks,
                final APICallBack<InputStream> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/code-highlight");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4773457716673492763L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4875924998363938616L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4951902785614151125L;
            {
                    put( "content", content );
                    put( "type", type );
                    put( "add-keyword-links", (addKeywordLinks != null) ? addKeywordLinks : false );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsBinaryAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            InputStream _result = _response.getRawBody();
                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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
     * Parse, validate and get detailed user-agent information from a user agent string
     * @param    userAgent    Required parameter: A user-agent string
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
     * Parse, validate and get detailed user-agent information from a user agent string
     * @param    userAgent    Required parameter: A user-agent string
     * @return    Returns the void response from the API call 
     */
    public void userAgentInfoAsync(
                final String userAgent,
                final APICallBack<UserAgentInfoResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/user-agent-info");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5079921249728022707L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5492954537885234004L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5607856849227605085L;
            {
                    put( "output-case", "camel" );
                    put( "user-agent", userAgent );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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
     * Extract specific HTML tag contents or attributes from complex HTML or XHTML content
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    tag    Required parameter: The HTML tag(s) to extract data from. This can just be a simple tag name like 'img' OR a CSS/jQuery style selector
     * @param    attribute    Optional parameter: If set, then extract data from the specified tag attribute. If not set, then data will be extracted from the tags inner content
     * @param    baseUrl    Optional parameter: The base URL to replace into realive links
     * @return    Returns the HTMLExtractResponse response from the API call 
     */
    public HTMLExtractResponse hTMLExtract(
                final String content,
                final String tag,
                final String attribute,
                final String baseUrl
    ) throws Throwable {
        APICallBackCatcher<HTMLExtractResponse> callback = new APICallBackCatcher<HTMLExtractResponse>();
        hTMLExtractAsync(content, tag, attribute, baseUrl, callback);
        if(!callback.isSuccess())
            throw callback.getError();
        return callback.getResult();
    }

    /**
     * Extract specific HTML tag contents or attributes from complex HTML or XHTML content
     * @param    content    Required parameter: The HTML content. This can be either a URL to load HTML from or an actual HTML content string
     * @param    tag    Required parameter: The HTML tag(s) to extract data from. This can just be a simple tag name like 'img' OR a CSS/jQuery style selector
     * @param    attribute    Optional parameter: If set, then extract data from the specified tag attribute. If not set, then data will be extracted from the tags inner content
     * @param    baseUrl    Optional parameter: The base URL to replace into realive links
     * @return    Returns the void response from the API call 
     */
    public void hTMLExtractAsync(
                final String content,
                final String tag,
                final String attribute,
                final String baseUrl,
                final APICallBack<HTMLExtractResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/html-extract-tags");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5337539704911506542L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4624655285906274948L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5223584425855526703L;
            {
                    put( "output-case", "camel" );
                    put( "content", content );
                    put( "tag", tag );
                    put( "attribute", attribute );
                    put( "base-url", baseUrl );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
                                getHttpCallBack().OnAfterResponse(_context);
                            }

                            //handle errors defined at the API level
                            validateResponse(_response, _context);

                            //extract result from the http response
                            String _responseBody = ((HttpStringResponse)_response).getBody();
                            HTMLExtractResponse _result = APIHelper.deserialize(_responseBody,
                                                        new TypeReference<HTMLExtractResponse>(){});

                            //let the caller know of the success
                            callBack.onSuccess(_context, _result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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
     * Parse, validate and get location information about a phone number
     * @param    number    Required parameter: The phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
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
     * Parse, validate and get location information about a phone number
     * @param    number    Required parameter: The phone number
     * @param    countryCode    Optional parameter: ISO 2-letter country code, assume numbers are based in this country. If not set numbers are assumed to be in international format (with or without the leading + sign)
     * @param    ip    Optional parameter: Pass in a users IP address and we will assume numbers are based in the country of the IP address
     * @return    Returns the void response from the API call 
     */
    public void phoneValidateAsync(
                final String number,
                final String countryCode,
                final String ip,
                final APICallBack<PhoneValidateResponse> callBack
    ) {
        //the base uri for api requests
        String _baseUri = Configuration.baseUri;
        
        //prepare query string for API call
        StringBuilder _queryBuilder = new StringBuilder(_baseUri);
        _queryBuilder.append("/phone-validate");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(_queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4885407623132342699L;
            {
                    put( "user-id", Configuration.userId );
                    put( "api-key", Configuration.apiKey );
            }});
        //validate and preprocess url
        String _queryUrl = APIHelper.cleanUrl(_queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> _headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5166260039541275311L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> _parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5329388782875704175L;
            {
                    put( "output-case", "camel" );
                    put( "number", number );
                    put( "country-code", countryCode );
                    put( "ip", ip );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest _request = getClientInstance().post(_queryUrl, _headers, APIHelper.prepareFormFields(_parameters));

        //invoke the callback before request if its not null
        if (getHttpCallBack() != null)
        {
            getHttpCallBack().OnBeforeRequest(_request);
        }

        //invoke request and get response
        Runnable _responseTask = new Runnable() {
            public void run() {
                //make the API call
                getClientInstance().executeAsStringAsync(_request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext _context, HttpResponse _response) {
                        try {

                            //invoke the callback after response if its not null
                            if (getHttpCallBack() != null)	
                            {
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
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(_context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(_context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(_context, exception);
                        }
                    }
                    public void onFailure(HttpContext _context, Throwable _error) {
                        //invoke the callback after response if its not null
                        if (getHttpCallBack() != null)	
                            {
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