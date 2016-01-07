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

public class ECommerceController extends BaseController {

    //private fields for configuration

   /** Your user ID */
    private String userId;

   /** Your API key */
    private String apiKey;

   /**
    * Constructor with authentication and configuration parameters */
    public ECommerceController (String userId, String apiKey) {
        this.userId = userId;
        this.apiKey = apiKey;
    }

   /**
    * Constructor with authentication and configuration parameters */
    public ECommerceController (HttpClient _client, String userId, String apiKey) {
        super(_client);
        this.userId = userId;
        this.apiKey = apiKey;
    }

    /**
     * Perform a BIN (Bank Identification Number) or IIN (Issuer Identification Number) lookup. See: https://www.neutrinoapi.com/api/bin-lookup/
     * @param    binNumber    Required parameter: The BIN or IIN number (the first 6 digits of a credit card number)
     * @param    customerIp    Optional parameter: Pass in a customers remote IP address. The API will then determine the country of the IP address and match it against the BIN country. This feature is designed for fraud prevention and detection checks.
	 * @return	Returns the BINLookupResponse response from the API call*/
    public BINLookupResponse bINLookup(
            final String binNumber,
            final String customerIp
    ) throws IOException, APIException {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/bin-lookup");

        //process query parameters
        APIHelper.appendUrlWithQueryParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5285733244564749373L;
            {
                    put( "user-id", userId );
                    put( "api-key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5152856795559677637L;
            {
                    put( "user-agent", "APIMATIC 2.0" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 4721968899277618924L;
            {
                    put( "bin-number", binNumber );
                    put( "output-case", "camel" );
                    put( "customer-ip", customerIp );
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
        BINLookupResponse result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<BINLookupResponse>(){});

        return result;
    }
        
}