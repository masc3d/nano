// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Indicates the text message type of the item's quantity availability.
 */
public enum QuantityAvailableHintCodeType {

    /**
     * (out) The message "Limited quantity available" is shown in the web
     * flow (e.g., for a flash sale or a Daily Deal).
     */
    LIMITED("Limited"),


    /**
     * (out) The message "More than 10 available" is shown in the web flow.
     * 10 is the value of QuantityThreshold tag based on the seller's
     * preference.
     */
    MORE_THAN("MoreThan"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    QuantityAvailableHintCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QuantityAvailableHintCodeType fromValue(String v) {
        if (v != null) {
            for (QuantityAvailableHintCodeType c : QuantityAvailableHintCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}