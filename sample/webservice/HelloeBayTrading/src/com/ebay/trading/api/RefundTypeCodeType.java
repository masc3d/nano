// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Explanation of the reason that the refund is being issued. Applicable to Half.com
 * refunds only.
 */
public enum RefundTypeCodeType {

    /**
     * The seller has issued a refund for the transaction price that
     * was originally paid to the seller.
     * (The seller's shipping reimbursement is not included
     * if Half.com calculates the refund amount).
     */
    FULL("Full"),


    /**
     * The seller has issued a refund for the transaction price and
     * shipping reimbursement that was originally paid to the seller.
     * (The buyer's return shipping costs
     * might not be included if Half.com calculates the refund amount.)
     */
    FULL_PLUS_SHIPPING("FullPlusShipping"),


    /**
     * The seller has issued a refund amount that is different from
     * the full refund (with or without shipping). If specified,
     * it may be helpful to explain the amount in your note to the buyer.
     */
    CUSTOM_OR_PARTIAL("CustomOrPartial"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    RefundTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundTypeCodeType fromValue(String v) {
        if (v != null) {
            for (RefundTypeCodeType c : RefundTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}