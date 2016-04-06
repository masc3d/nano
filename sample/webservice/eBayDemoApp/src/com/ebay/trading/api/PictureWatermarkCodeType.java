// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * The watermark choice made by the seller.
 */
public enum PictureWatermarkCodeType {

    /**
     * SellerId watermark option for EPS upload functionality.
     */
    USER("User"),


    /**
     * Icon watermark option for EPS upload functionality.
     */
    ICON("Icon"),


    /**
     * (out) Reserved for internal or future use
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    PictureWatermarkCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureWatermarkCodeType fromValue(String v) {
        if (v != null) {
            for (PictureWatermarkCodeType c : PictureWatermarkCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}