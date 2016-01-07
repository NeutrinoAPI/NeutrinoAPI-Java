/*
 * NeutrinoAPILib
 *
 * This file was automatically generated for NeutrinoAPI.com by APIMATIC BETA v2.0 on 01/07/2016
 */
package com.neutrinoapi.models;

import java.util.*;

public class EmailValidateResponseBuilder {
    //the instance to build
    private EmailValidateResponse emailValidateResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EmailValidateResponseBuilder() {
        emailValidateResponse = new EmailValidateResponse();
    }

    public EmailValidateResponseBuilder domain(String domain) {
        emailValidateResponse.setDomain(domain);
        return this;
    }

    public EmailValidateResponseBuilder domainError(boolean domainError) {
        emailValidateResponse.setDomainError(domainError);
        return this;
    }

    public EmailValidateResponseBuilder email(String email) {
        emailValidateResponse.setEmail(email);
        return this;
    }

    public EmailValidateResponseBuilder isFreemail(boolean isFreemail) {
        emailValidateResponse.setIsFreemail(isFreemail);
        return this;
    }

    public EmailValidateResponseBuilder syntaxError(boolean syntaxError) {
        emailValidateResponse.setSyntaxError(syntaxError);
        return this;
    }

    public EmailValidateResponseBuilder valid(boolean valid) {
        emailValidateResponse.setValid(valid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmailValidateResponse build() {
        return emailValidateResponse;
    }
}