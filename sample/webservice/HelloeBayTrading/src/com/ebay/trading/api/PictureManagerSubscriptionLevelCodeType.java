// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * This type is deprecated as Pictures Manager was retired.
 */
public enum PictureManagerSubscriptionLevelCodeType {

    /**
     * (out) Free to Stores users.
     */
    FREE("Free"),


    /**
     * (out) 10 MB of storage.
     */
    LEVEL_1("Level1"),


    /**
     * (out) 50 MB of storage.
     */
    LEVEL_2("Level2"),


    /**
     * (out) 125 MB of storage.
     */
    LEVEL_3("Level3"),


    /**
     * (out) 300 MB of storage.
     */
    LEVEL_4("Level4"),


    /**
     * (out) Reserved for internal or future use
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    PictureManagerSubscriptionLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PictureManagerSubscriptionLevelCodeType fromValue(String v) {
        if (v != null) {
            for (PictureManagerSubscriptionLevelCodeType c : PictureManagerSubscriptionLevelCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}