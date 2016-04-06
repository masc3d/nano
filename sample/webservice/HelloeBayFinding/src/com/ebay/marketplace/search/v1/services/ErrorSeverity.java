// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

/**
 * Indicates whether the error is a fatal error (causing the request to fail)
 * or a less severe error (a warning) that should be communicated to the user.
 */
public enum ErrorSeverity {

    /**
     * eBay encountered a fatal error during the processing of the request,
     * causing the request to fail. When eBay encounters an error, it returns
     * error data instead of the requested business data. Inspect the error
     * details and resolve the problem before resubmitting the request.
     */
    ERROR("Error"),


    /**
     * The request was successfully processed, but eBay encountered a non-fatal
     * error during the processing that could affect the data returned. For
     * example, eBay might have changed the value of an input field. In this
     * case, eBay returns a successful response, but it also returns a warning.
     * For best results, requests should return without warnings. Inspect the
     * warning details and resolve the problem before resubmitting the request.
     */
    WARNING("Warning");


    private final String value;

    ErrorSeverity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorSeverity fromValue(String v) {
        if (v != null) {
            for (ErrorSeverity c : ErrorSeverity.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}