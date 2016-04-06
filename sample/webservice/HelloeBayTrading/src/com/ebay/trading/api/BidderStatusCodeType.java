// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * This type is deprecated because this type is not used by any call.
 */
public enum BidderStatusCodeType {

    /**
     * Seller has approved the bidder.
     */
    APPROVED("Approved"),


    /**
     * Seller has denied the bidder's approval request.
     */
    DENIED("Denied"),


    /**
     * Seller has not yet approved or denied the
     * bidder (or the status is still being processed).
     */
    PENDING("Pending"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    BidderStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidderStatusCodeType fromValue(String v) {
        if (v != null) {
            for (BidderStatusCodeType c : BidderStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}