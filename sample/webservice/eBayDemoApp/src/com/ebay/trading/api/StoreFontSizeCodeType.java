// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Font size selection for Store configuration.
 */
public enum StoreFontSizeCodeType {

    /**
     * Extra extra small.
     */
    XXS("XXS"),


    /**
     * Extra small.
     */
    XS("XS"),


    /**
     * Small.
     */
    S("S"),


    /**
     * Medium.
     */
    M("M"),


    /**
     * Large.
     */
    L("L"),


    /**
     * Extra large.
     */
    XL("XL"),


    /**
     * Extra extra large.
     */
    XXL("XXL"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    StoreFontSizeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreFontSizeCodeType fromValue(String v) {
        if (v != null) {
            for (StoreFontSizeCodeType c : StoreFontSizeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}