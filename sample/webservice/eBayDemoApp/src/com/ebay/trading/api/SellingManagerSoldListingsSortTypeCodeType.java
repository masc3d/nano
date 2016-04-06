// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * SellingManagerSoldListingsSortType - Specifies the fields that can be used to sort the listings.
 */
public enum SellingManagerSoldListingsSortTypeCodeType {

    /**
     * Sorts listings by sales Record ID.
     */
    SALES_RECORD_ID("SalesRecordID"),


    /**
     * Sorts listings by Buyer email or ID.
     */
    BUYER_EMAIL("BuyerEmail"),


    /**
     * Sorts listings by sale format.
     */
    SALE_FORMAT("SaleFormat"),


    /**
     * Sorts listings by Custom label.
     */
    CUSTOM_LABEL("CustomLabel"),


    /**
     * Sorts listings by Total Price.
     */
    TOTAL_PRICE("TotalPrice"),


    /**
     * Sorts listings by Sale Date.
     */
    SALE_DATE("SaleDate"),


    /**
     * Sorts listings by Paid Date.
     */
    PAID_DATE("PaidDate"),


    /**
     * Sorts listings by Emails sent.
     */
    EMAILS_SENT("EmailsSent"),


    /**
     * Sorts listings by Checkout status.
     */
    CHECKOUT_STATE("CheckoutState"),


    /**
     * Sorts by Paid status.
     */
    PAID_STATE("PaidState"),


    /**
     * Sorts by Shipped state.
     */
    SHIPPED_STATE("ShippedState"),


    /**
     * Sorts by feedback left.
     */
    FEEDBACK_LEFT("FeedbackLeft"),


    /**
     * Sorts by FeedbackReceived.
     */
    FEEDBACK_RECEIVED("FeedbackReceived"),


    /**
     * Sorts by Shipped Date.
     */
    SHIPPED_DATE("ShippedDate"),


    /**
     * Sorts by buyer Postal code.
     */
    BUYER_POSTAL_CODE("BuyerPostalCode"),


    /**
     * Sorts by Days since sale.
     */
    DAYS_SINCE_SALE("DaysSinceSale"),


    /**
     * Sort by Start price.
     */
    START_PRICE("StartPrice"),


    /**
     * Sort by ReservePrice.
     */
    RESERVE_PRICE("ReservePrice"),


    /**
     * Sorts by Sold site.
     */
    SOLD_ON("SoldOn"),


    /**
     * Sorts by Shipping cost.
     */
    SHIPPING_COST("ShippingCost"),


    /**
     * Sorts by Listed site.
     */
    LISTED_ON("ListedOn"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SellingManagerSoldListingsSortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerSoldListingsSortTypeCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerSoldListingsSortTypeCodeType c : SellingManagerSoldListingsSortTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}