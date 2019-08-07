/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class EmailVerifyResponseBuilder {
    //the instance to build
    private EmailVerifyResponse emailVerifyResponse;

    /**
     * Default constructor to initialize the instance
     */
    public EmailVerifyResponseBuilder() {
        emailVerifyResponse = new EmailVerifyResponse();
    }

    /**
     * Is this a valid email address (syntax and domain is valid)
     */
    public EmailVerifyResponseBuilder valid(boolean valid) {
        emailVerifyResponse.setValid(valid);
        return this;
    }

    /**
     * True if this address has passed SMTP verification. Check the smtp-status and smtp-response fields for specific verification details
     */
    public EmailVerifyResponseBuilder verified(boolean verified) {
        emailVerifyResponse.setVerified(verified);
        return this;
    }

    /**
     * The email address. If you have used the fix-typos option then this will be the fixed address
     */
    public EmailVerifyResponseBuilder email(String email) {
        emailVerifyResponse.setEmail(email);
        return this;
    }

    /**
     * True if typos have been fixed
     */
    public EmailVerifyResponseBuilder typosFixed(boolean typosFixed) {
        emailVerifyResponse.setTyposFixed(typosFixed);
        return this;
    }

    /**
     * True if this address has a syntax error
     */
    public EmailVerifyResponseBuilder syntaxError(boolean syntaxError) {
        emailVerifyResponse.setSyntaxError(syntaxError);
        return this;
    }

    /**
     * True if this address has a domain error (e.g. no valid mail server records)
     */
    public EmailVerifyResponseBuilder domainError(boolean domainError) {
        emailVerifyResponse.setDomainError(domainError);
        return this;
    }

    /**
     * The email domain
     */
    public EmailVerifyResponseBuilder domain(String domain) {
        emailVerifyResponse.setDomain(domain);
        return this;
    }

    /**
     * The email service provider domain
     */
    public EmailVerifyResponseBuilder provider(String provider) {
        emailVerifyResponse.setProvider(provider);
        return this;
    }

    /**
     * True if this address is a free-mail address
     */
    public EmailVerifyResponseBuilder isFreemail(boolean isFreemail) {
        emailVerifyResponse.setIsFreemail(isFreemail);
        return this;
    }

    /**
     * True if this address is a disposable, temporary or darknet related email address
     */
    public EmailVerifyResponseBuilder isDisposable(boolean isDisposable) {
        emailVerifyResponse.setIsDisposable(isDisposable);
        return this;
    }

    /**
     * True if this address is for a person. False if this is a role based address, e.g. admin@, help@, office@, etc.
     */
    public EmailVerifyResponseBuilder isPersonal(boolean isPersonal) {
        emailVerifyResponse.setIsPersonal(isPersonal);
        return this;
    }

    /**
     * The SMTP verification status for the address: <ul> <li>ok - SMTP verification was successful, this is a real address that can receive mail</li> <li>invalid - this is not a valid email address (has either a domain or syntax error)</li> <li>absent - this address is not registered with the email service provider</li> <li>unresponsive - the mail server(s) for this address timed-out or refused to open an SMTP connection</li> <li>unknown - sorry, we could not reliably determine the real status of this address (this address may or may not exist)</li> </ul>
     */
    public EmailVerifyResponseBuilder smtpStatus(String smtpStatus) {
        emailVerifyResponse.setSmtpStatus(smtpStatus);
        return this;
    }

    /**
     * The raw SMTP response message received during verification
     */
    public EmailVerifyResponseBuilder smtpResponse(String smtpResponse) {
        emailVerifyResponse.setSmtpResponse(smtpResponse);
        return this;
    }

    /**
     * True if this email domain has a catch-all policy (it will accept mail for any username)
     */
    public EmailVerifyResponseBuilder isCatchAll(boolean isCatchAll) {
        emailVerifyResponse.setIsCatchAll(isCatchAll);
        return this;
    }

    /**
     * True if the mail server responded with a temporary failure (either a 4xx response code or unresponsive server). You can retry this address later, we recommend waiting at least 15 minutes before retrying
     */
    public EmailVerifyResponseBuilder isDeferred(boolean isDeferred) {
        emailVerifyResponse.setIsDeferred(isDeferred);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public EmailVerifyResponse build() {
        return emailVerifyResponse;
    }
}