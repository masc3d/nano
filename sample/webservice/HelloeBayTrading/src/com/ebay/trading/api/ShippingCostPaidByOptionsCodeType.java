// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * This specifies the party (Seller/Buyer) who is going to pay the return shipping cost.
 */
public enum ShippingCostPaidByOptionsCodeType {

    /**
     * Buyer pays return shipping cost.
     */
    BUYER("Buyer"),


    /**
     * Seller pays return shipping cost.
     */
    SELLER("Seller"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    ShippingCostPaidByOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingCostPaidByOptionsCodeType fromValue(String v) {
        if (v != null) {
            for (ShippingCostPaidByOptionsCodeType c : ShippingCostPaidByOptionsCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}