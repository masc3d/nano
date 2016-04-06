// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * This enumerated type contains the possible refund options that a seller may offer a buyer
 * for a given item.
 */
public enum RefundOptionsCodeType {

    /**
     * The seller will refund the basic listing (or transaction) cost, excluding
     * shipping and other costs.
     * Use ReturnPolicy.Description to explain how the seller will handle the refund
     * (such as whether the refund will occur via PayPal).
     */
    MONEY_BACK("MoneyBack"),


    /**
     * This value is being deprecated in 2012. We recommend that you stop using this value.
     * Beginning with version 759, a warning message will be returned if a listing is created
     * or revised with this value. And starting in early May 2012, listings created or revised
     * with this value will be blocked.
     * <br><br>
     * The seller will exchange the returned item for another item. Use
     * ReturnPolicy.Description to explain how this will occur (such as whether the seller will
     * send an identical item in place of the returned item).
     */
    EXCHANGE("Exchange"),


    /**
     * This value is being deprecated in 2012. We recommend that you stop using this value.
     * Beginning with version 759, a warning message will be returned if a listing is created
     * or revised with this value. And starting in early May 2012, listings created or revised
     * with this value will be blocked.
     * <br><br>
     * The seller will give the buyer a credit toward the purchase of another item.
     * Use ReturnPolicy.Description to explain how the buyer can redeem this credit.
     */
    MERCHANDISE_CREDIT("MerchandiseCredit"),


    /**
     * The seller will either issue the buyer a refund for the cost of the item (excluding
     * shipping and other costs), or the seller will exchange the returned item for another
     * identical/similar item.
     * <br><br>
     * Use ReturnPolicy.Description to explain how the seller will handle the refund (such as
     * whether the refund will occur via PayPal), or how the exchange will occur (such as
     * whether the seller will send an identical item in place of the returned item).
     */
    MONEY_BACK_OR_EXCHANGE("MoneyBackOrExchange"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    RefundOptionsCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundOptionsCodeType fromValue(String v) {
        if (v != null) {
            for (RefundOptionsCodeType c : RefundOptionsCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}