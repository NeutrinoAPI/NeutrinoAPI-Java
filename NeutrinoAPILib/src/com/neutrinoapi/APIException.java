/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi;

import java.io.InputStream;

public class APIException extends Exception {
    //UID for serialization
    private static final long serialVersionUID = 6424174253911720338L;

    //private fields
    private int responseCode;

    //private fields
    private InputStream rawBody;

    /**
    * The HTTP response code from the API request
    */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * The HTTP response body from the API request
     */
    public InputStream getRawBody() {
        return rawBody;
    }

    /**
    * Initialization constructor
    * @param	reason	The reason for throwing exception
    * @param	code	The HTTP response code from the API request
    */
    public APIException(String reason, int code, InputStream body) {
        super(reason);
        this.responseCode = code;
        this.rawBody = body;
    }

    /**
     * Initialization constructor
     * @param	reason	The reason for throwing exception
     */
    public APIException(String reason) {
        super(reason);
    }
}