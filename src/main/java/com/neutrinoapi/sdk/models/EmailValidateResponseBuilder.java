/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

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

    /**
     * Is this a valid email
     */
    public EmailValidateResponseBuilder valid(boolean valid) {
        emailValidateResponse.setValid(valid);
        return this;
    }

    /**
     * True if this address has a syntax error
     */
    public EmailValidateResponseBuilder syntaxError(boolean syntaxError) {
        emailValidateResponse.setSyntaxError(syntaxError);
        return this;
    }

    /**
     * The email domain
     */
    public EmailValidateResponseBuilder domain(String domain) {
        emailValidateResponse.setDomain(domain);
        return this;
    }

    /**
     * True if this address has a domain error (e.g. no valid mail server records)
     */
    public EmailValidateResponseBuilder domainError(boolean domainError) {
        emailValidateResponse.setDomainError(domainError);
        return this;
    }

    /**
     * True if this address is a free-mail address
     */
    public EmailValidateResponseBuilder isFreemail(boolean isFreemail) {
        emailValidateResponse.setIsFreemail(isFreemail);
        return this;
    }

    /**
     * The full email address (this could be different to the supplied address if typos-fixed is true)
     */
    public EmailValidateResponseBuilder email(String email) {
        emailValidateResponse.setEmail(email);
        return this;
    }

    /**
     * True if this address is a disposable, temporary or darknet related email address
     */
    public EmailValidateResponseBuilder isDisposable(boolean isDisposable) {
        emailValidateResponse.setIsDisposable(isDisposable);
        return this;
    }

    /**
     * True if typos have been fixed
     */
    public EmailValidateResponseBuilder typosFixed(boolean typosFixed) {
        emailValidateResponse.setTyposFixed(typosFixed);
        return this;
    }

    /**
     * True if this address belongs to a person. False if this is a role based address, e.g. admin@, help@, office@, etc.
     */
    public EmailValidateResponseBuilder isPersonal(boolean isPersonal) {
        emailValidateResponse.setIsPersonal(isPersonal);
        return this;
    }

    /**
     * The email service provider domain
     */
    public EmailValidateResponseBuilder provider(String provider) {
        emailValidateResponse.setProvider(provider);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmailValidateResponse build() {
        return emailValidateResponse;
    }
}