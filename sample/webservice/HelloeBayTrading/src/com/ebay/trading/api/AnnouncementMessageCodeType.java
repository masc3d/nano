// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Part of the mechanism for eBay to control which announcement messages are
 * to be made available to the user.
 */
public enum AnnouncementMessageCodeType {

    /**
     * No message is to be made available.
     */
    NONE("None"),


    /**
     * A deprecation message is to be made available,
     * but only if today's date is between AnnouncementMessageType.AnnouncementStartTime
     * and AnnouncementMessageType.EventTime.
     */
    DEPRECATION("Deprecation"),


    /**
     * A mapping message is to be made available,
     * but only if today's date is after AnnouncementMessageType.EventTime.
     */
    MAPPING("Mapping"),


    /**
     * Both "Deprecation" and "Mapping" enumerations are to apply.
     */
    DEPRECATION_AND_MAPPING("DeprecationAndMapping"),


    /**
     * Reserved for future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    AnnouncementMessageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnnouncementMessageCodeType fromValue(String v) {
        if (v != null) {
            for (AnnouncementMessageCodeType c : AnnouncementMessageCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}