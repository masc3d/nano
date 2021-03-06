// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Enumerated type that indicates whether or not a new DE or AT seller has accepted the
 * supplement user agreement related to the new payment process, and if they have accepted the agreement,
 * whether or not their account is ramped up in the new payment process.
 */
public enum SellereBayPaymentProcessStatusCodeType {

    /**
     * This value indicates that the DE or AT seller has accepted the supplemental user agreement
     * related to the new payment process, but the new payment process has yet to be
     * fully implemented on the seller's account.
     */
    ACCEPTED_UA("AcceptedUA"),


    /**
     * This value indicates that the DE or AT seller has yet to accept the supplemental user agreement related to
     * the new payment process. If the new payment process has been fully implemented on the seller's account,
     * this seller will be blocked from listing on the DE and AT sites until the user agreement is accepted.
     */
    MUST_ACCEPT_UA("MustAcceptUA"),


    /**
     * This value indicates that the DE or AT seller has accepted the supplemental user
     * agreement related to the new payment process and the new payment process is
     * fully implemented on the seller's account.
     */
    E_BAY_PAYMENT_PROCESS_ENABLED("eBayPaymentProcessEnabled"),


    /**
     * Reserved for internal or future use
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SellereBayPaymentProcessStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellereBayPaymentProcessStatusCodeType fromValue(String v) {
        if (v != null) {
            for (SellereBayPaymentProcessStatusCodeType c : SellereBayPaymentProcessStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}