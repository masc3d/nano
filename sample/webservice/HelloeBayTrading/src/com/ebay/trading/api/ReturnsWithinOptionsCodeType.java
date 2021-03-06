// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * This enumerated type contains the list of values that can be used by the seller to set
 * the number of days (after the purchase date) that a buyer has to return an item (if the
 * return policy states that items can be returned) for a refund or an exchange.
 */
public enum ReturnsWithinOptionsCodeType {

    /**
     * The seller specifies this value to enable a 3-day return policy. A buyer must
     * return an item within three days after purchase in order to receive a refund or
     * an exchange.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * This value is deprecated. Listings created or revised with this value will be
     * blocked.
     */
    DAYS_3("Days_3"),


    /**
     * The seller specifies this value to enable a 7-day return policy. A buyer must
     * return an item within seven days after purchase in order to receive a refund or
     * an exchange.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * This value is deprecated. Listings created or revised with this value will be
     * blocked.
     */
    DAYS_7("Days_7"),


    /**
     * The seller specifies this value to enable a 10-day return policy. A buyer must
     * return an item within 10 days after purchase in order to receive a refund or
     * an exchange.
     * <br>
     * <br>
     * <span class="tablenote"><b>Note:</b>
     * This value is deprecated. Listings created or revised with this value will be
     * blocked.
     */
    DAYS_10("Days_10"),


    /**
     * The seller specifies this value to enable a 14-day return policy. A buyer must
     * return an item within 14 days after purchase in order to receive a refund or
     * an exchange.
     */
    DAYS_14("Days_14"),


    /**
     * The seller specifies this value to enable a 30-day return policy. A buyer must
     * return an item within 30 days after purchase in order to receive a refund or
     * an exchange.
     */
    DAYS_30("Days_30"),


    /**
     * The seller specifies this value to enable a 60-day return policy. A buyer must
     * return an item within 60 days after purchase in order to receive a refund or
     * an exchange.
     */
    DAYS_60("Days_60"),


    /**
     * This value is reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    ReturnsWithinOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReturnsWithinOptionsCodeType fromValue(String v) {
        if (v != null) {
            for (ReturnsWithinOptionsCodeType c : ReturnsWithinOptionsCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}