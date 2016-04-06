// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * This type is deprecated. Use <b>DetailLevelCodeType</b> instead.
 */
public enum CategoryFeatureDetailLevelCodeType {

    /**
     * Return all available data.
     */
    RETURN_ALL("ReturnAll"),


    /**
     * Return the category feature definitions only.
     */
    RETURN_FEATURE_DEFINITIONS("ReturnFeatureDefinitions"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    CategoryFeatureDetailLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CategoryFeatureDetailLevelCodeType fromValue(String v) {
        if (v != null) {
            for (CategoryFeatureDetailLevelCodeType c : CategoryFeatureDetailLevelCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}