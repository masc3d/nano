// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * For GetSellerPayments, indicates the type of Half.com payment being
 * made (sale or refund).
 */
public enum PaymentTypeCodeType {

    /**
     * (out) The buyer paid the seller.
     * Applicable to Half.com.
     */
    SALE("Sale"),


    /**
     * (out) The seller issued a refund to the buyer.
     * Applicable to Half.com.
     */
    REFUND("Refund"),


    /**
     * For eBay internal use.
     */
    SELLER_DENIED_PAYMENT("SellerDeniedPayment"),


    /**
     * For eBay internal use.
     */
    ADMIN_REVERSAL("AdminReversal"),


    /**
     * All other payment types.
     */
    ALL_OTHER("AllOther"),


    /**
     * (out) The buyer paid the seller for a rental extension.
     * Applicable to Half.com only.
     */
    RENTAL_EXTENSION("RentalExtension"),


    /**
     * (out) The buyer paid the seller for a rental buyout.
     * Applicable to Half.com only.
     */
    RENTAL_BUYOUT("RentalBuyout"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    PaymentTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypeCodeType fromValue(String v) {
        if (v != null) {
            for (PaymentTypeCodeType c : PaymentTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}