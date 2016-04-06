// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * A code indicating whether the refund for the DE/AT order was applied toward the
 * purchase price, the original shipping price, or for an additional amount.
 */
public enum RefundLineTypeCodeType {

    /**
     * The refund was applied to the purchase price.<br/><br/>
     */
    PURCHASE_PRICE("PurchasePrice"),


    /**
     * The refund was applied to the shipping cost.<br/><br/>
     */
    SHIPPING_PRICE("ShippingPrice"),


    /**
     * An additional refund (not accounted for in the original order costs) was issued.<br/><br/>
     */
    ADDITIONAL("Additional"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    RefundLineTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundLineTypeCodeType fromValue(String v) {
        if (v != null) {
            for (RefundLineTypeCodeType c : RefundLineTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}