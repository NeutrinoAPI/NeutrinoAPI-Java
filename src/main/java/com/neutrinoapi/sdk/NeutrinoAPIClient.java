/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk;

import com.neutrinoapi.sdk.controllers.*;
import com.neutrinoapi.sdk.http.client.HttpClient;

public class NeutrinoAPIClient {
    /**
     * Singleton access to WWW controller
     * @return	Returns the WWW instance 
     */
    public WWW getWWW() {
        return WWW.getInstance();
    }

    /**
     * Singleton access to Imaging controller
     * @return	Returns the Imaging instance 
     */
    public Imaging getImaging() {
        return Imaging.getInstance();
    }

    /**
     * Singleton access to Telephony controller
     * @return	Returns the Telephony instance 
     */
    public Telephony getTelephony() {
        return Telephony.getInstance();
    }

    /**
     * Singleton access to ECommerce controller
     * @return	Returns the ECommerce instance 
     */
    public ECommerce getECommerce() {
        return ECommerce.getInstance();
    }

    /**
     * Singleton access to Geolocation controller
     * @return	Returns the Geolocation instance 
     */
    public Geolocation getGeolocation() {
        return Geolocation.getInstance();
    }

    /**
     * Singleton access to SecurityAndNetworking controller
     * @return	Returns the SecurityAndNetworking instance 
     */
    public SecurityAndNetworking getSecurityAndNetworking() {
        return SecurityAndNetworking.getInstance();
    }

    /**
     * Singleton access to DataTools controller
     * @return	Returns the DataTools instance 
     */
    public DataTools getDataTools() {
        return DataTools.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public NeutrinoAPIClient() {
    }

    /**
     * Client initialization constructor 
     */     
    public NeutrinoAPIClient(String userId, String apiKey) {
        this();
        Configuration.userId = userId;
        Configuration.apiKey = apiKey;
    }
}