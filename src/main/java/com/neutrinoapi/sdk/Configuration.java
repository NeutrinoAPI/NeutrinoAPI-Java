/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk;

import java.util.HashMap;
import java.util.Map;

import com.neutrinoapi.sdk.models.*;

public class Configuration {
    //Your user ID
    //TODO: Replace the userId with an appropriate value
    public static String userId = "";

    //Your API key
    //TODO: Replace the apiKey with an appropriate value
    public static String apiKey = "";

    /**
     * Current API environment
     */
    public static Environments environment = Environments.MULTICLOUD;

    /**
     * Get base URI by current environment
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    public static String getBaseUri(Servers server) {
        StringBuilder baseUrl = new StringBuilder(environmentMapper(Configuration.environment, server));
        Map<String, Object> parameters = new HashMap<String, Object>();
        APIHelper.appendUrlWithTemplateParameters(baseUrl, parameters);
        return baseUrl.toString();
    }
    
    /**
     * Get base URI by current environment
     * @return Processed base URI
     */
    public static String getBaseUri() {
        return Configuration.getBaseUri(Servers.ENUM_DEFAULT);
    }
    
    /**
     * Base URLs by environments and server aliases 
     */

    private static String environmentMapper(Environments environments, Servers servers) {
		String url = "";
		if(environments.equals(Environments.MULTICLOUD)) {
			if(servers.equals(Servers.ENUM_DEFAULT))
				url = "https://neutrinoapi.net/";
		}
		if(environments.equals(Environments.AWS)) {
			if(servers.equals(Servers.ENUM_DEFAULT))
				url = "https://aws.neutrinoapi.net/";
		}
		if(environments.equals(Environments.GCP)) {
			if(servers.equals(Servers.ENUM_DEFAULT))
				url = "https://gcp.neutrinoapi.net/";
		}
		if(environments.equals(Environments.MSA)) {
			if(servers.equals(Servers.ENUM_DEFAULT))
				url = "https://msa.neutrinoapi.net/";
		}
		return url;
	}
}
