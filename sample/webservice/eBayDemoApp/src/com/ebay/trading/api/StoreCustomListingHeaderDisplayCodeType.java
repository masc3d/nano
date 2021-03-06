// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Specifies how the custom listing header will be displayed.
 */
public enum StoreCustomListingHeaderDisplayCodeType {

    /**
     * No custom listing header is displayed.
     */
    NONE("None"),


    /**
     * The full custom listing header is displayed.
     */
    FULL("Full"),


    /**
     * The full custom listing header and the left navigation bar is displayed.
     */
    FULL_AND_LEFT_NAVIGATION_BAR("FullAndLeftNavigationBar"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    StoreCustomListingHeaderDisplayCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StoreCustomListingHeaderDisplayCodeType fromValue(String v) {
        if (v != null) {
            for (StoreCustomListingHeaderDisplayCodeType c : StoreCustomListingHeaderDisplayCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}