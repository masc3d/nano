// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * The Search standing that you have earned.
 */
public enum SearchStandingStatusCodeType {

    /**
     * Your listings may receive higher placement in search results
     * that are sorted by Best Match.
     * You earn this standing when you provide excellent customer service to eBay buyers
     * (such as good BuyerSatisfaction.Status and high detailed seller ratings).
     * If you already have a raised search standing, you can still boost your
     * ratings and increase the visibility of your items by maintaining or
     * improving your customer service.
     */
    RAISED("Raised"),


    /**
     * Listings recieve standard placement in search results that are sorted by Best Match.
     */
    STANDARD("Standard"),


    /**
     * Your listings may receive lower placement in search results that
     * are sorted by Best Match.
     * You earn this standing when you have not been successful in providing
     * eBay buyers with the customer service they expect.
     * You can still take positive steps to improve your customer service
     * and increase your ratings.
     */
    LOWERED("Lowered"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SearchStandingStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchStandingStatusCodeType fromValue(String v) {
        if (v != null) {
            for (SearchStandingStatusCodeType c : SearchStandingStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}