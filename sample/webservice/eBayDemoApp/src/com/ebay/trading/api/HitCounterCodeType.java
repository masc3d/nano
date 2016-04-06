// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * HitCounterCodeType - Type declaration to be used by other schema.
 * Indicates whether a hit counter is used for the item's listing page
 * and, if so, what type.
 */
public enum HitCounterCodeType {

    /**
     * No hit counter. The number of page views will not be available.
     */
    NO_HIT_COUNTER("NoHitCounter"),


    /**
     * A basic style hit counter (US only). Non-US sites will return errors if they use HonestyStyle as input, and should use BasicStyle instead.
     */
    HONESTY_STYLE("HonestyStyle"),


    /**
     * A green LED, computer-style hit counter (US only). Non-US sites will return errors if they use GreenLED as input, and should use RetroStyle instead.
     */
    GREEN_LED("GreenLED"),


    /**
     * A hidden hit counter (US only). The number of page views will only be available to
     * the item's seller. For faster "View Item" page loads, use HiddenStyle.
     */
    HIDDEN("Hidden"),


    /**
     * A basic style hit counter.
     */
    BASIC_STYLE("BasicStyle"),


    /**
     * A retro, computer-style hit counter.
     */
    RETRO_STYLE("RetroStyle"),


    /**
     * A hidden hit counter. The number of page views will only be available to
     * the item's seller.
     */
    HIDDEN_STYLE("HiddenStyle"),


    /**
     * Reserved for internal or future use
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    HitCounterCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HitCounterCodeType fromValue(String v) {
        if (v != null) {
            for (HitCounterCodeType c : HitCounterCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}