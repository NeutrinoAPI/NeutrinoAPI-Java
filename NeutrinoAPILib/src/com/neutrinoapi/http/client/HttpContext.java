/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.http.client;

import com.neutrinoapi.http.request.HttpRequest;
import com.neutrinoapi.http.response.HttpResponse;

public class HttpContext {
    private HttpRequest _request;
    private HttpResponse _response;

    public HttpContext(HttpRequest request, HttpResponse response) {
        _request = request;
        _response = response;
    }

    /**
     * GETTER for the Http Request
     * @return HttpRequest request
     */
    public HttpRequest getRequest() {
        return _request;
    }

    /**
     * GETTER for the Http Response
     * @return HttpResponse response
     */
    public HttpResponse getRespone() {
        return _response;
    }
}