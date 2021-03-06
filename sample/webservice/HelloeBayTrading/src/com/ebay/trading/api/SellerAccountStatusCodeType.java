// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Seller account status.
 */
public enum SellerAccountStatusCodeType {

    /**
     * Your account is current.
     */
    CURRENT("Current"),


    /**
     * Your account is past due.
     */
    PAST_DUE("PastDue"),


    /**
     * Your account is on hold and risking suspension.
     */
    ON_HOLD("OnHold"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SellerAccountStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerAccountStatusCodeType fromValue(String v) {
        if (v != null) {
            for (SellerAccountStatusCodeType c : SellerAccountStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}