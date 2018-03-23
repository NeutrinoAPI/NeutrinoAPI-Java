/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.exceptions;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.neutrinoapi.sdk.http.client.HttpContext;

public class APIErrorException 
        extends APIException
        implements java.io.Serializable {
    private static final long serialVersionUID = 5227961113515149891L;
    private int apiError;
    private String apiErrorMsg;
    /** GETTER
     * API error code. If set and > 0 then an API error has occurred your request could not be completed
     */
    @JsonGetter("apiError")
    public int getApiError ( ) { 
        return this.apiError;
    }
    
    /** SETTER
     * API error code. If set and > 0 then an API error has occurred your request could not be completed
     */
    @JsonSetter("apiError")
    private void setApiError (int value) { 
        this.apiError = value;
    }
 
    /** GETTER
     * API error message
     */
    @JsonGetter("apiErrorMsg")
    public String getApiErrorMsg ( ) { 
        return this.apiErrorMsg;
    }
    
    /** SETTER
     * API error message
     */
    @JsonSetter("apiErrorMsg")
    private void setApiErrorMsg (String value) { 
        this.apiErrorMsg = value;
    }
 
    /**
     * Initialization constructor
     * @param   reason  The reason for throwing exception
     * @param   context The http context of the API exception
     */
    public APIErrorException(String reason, HttpContext context) {
        super(reason, context);
    }
}
 