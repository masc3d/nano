// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * This code identifies the types of balances in an account, e.g., a PayPal account.
 */
public enum BalanceCodeType {

    /**
     * (out) Custom Code.
     */
    OTHER("Other"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    BalanceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BalanceCodeType fromValue(String v) {
        if (v != null) {
            for (BalanceCodeType c : BalanceCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}