// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

public enum StoreHeaderStyleCodeType {

    /**
     * The full Store header is used.
     */
    FULL("Full"),


    /**
     * A minimized Store header is used.
     */
    MINIMIZED("Minimized"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    StoreHeaderStyleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreHeaderStyleCodeType fromValue(String v) {
        if (v != null) {
            for (StoreHeaderStyleCodeType c : StoreHeaderStyleCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}