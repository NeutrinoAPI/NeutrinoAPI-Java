/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 12/10/2015
 */
package com.neutrinoapi.models;

import java.util.*;

public class VerifySecurityCodeResponseBuilder {
    //the instance to build
    private VerifySecurityCodeResponse verifySecurityCodeResponse;

    /**
     * Default constructor to initialize the instance
     */
    public VerifySecurityCodeResponseBuilder() {
        verifySecurityCodeResponse = new VerifySecurityCodeResponse();
    }

    /**
     * True if the code is valid
     */
    public VerifySecurityCodeResponseBuilder verified(boolean verified) {
        verifySecurityCodeResponse.setVerified(verified);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public VerifySecurityCodeResponse build() {
        return verifySecurityCodeResponse;
    }
}