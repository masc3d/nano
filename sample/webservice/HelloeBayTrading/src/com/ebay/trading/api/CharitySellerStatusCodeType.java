// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * CharitySellerStatusCodeType - Type declaration to be used by other schema.
 * Indicates the status of the seller's charity seller account.
 */
public enum CharitySellerStatusCodeType {

    /**
     * The seller's charity seller account is suspended.
     */
    SUSPENDED("Suspended"),


    /**
     * The seller is a registered charity seller.
     */
    REGISTERED("Registered"),


    /**
     * The seller is no longer a registered charity seller. The account with the eBay Giving Works provider is closed.
     */
    CLOSED("Closed"),


    /**
     * The credit card associated with a seller's charity seller account has expired.
     */
    CREDIT_CARD_EXPIRED("CreditCardExpired"),


    /**
     * The token associated with a seller's charity seller account has expired.
     */
    TOKEN_EXPIRED("TokenExpired"),


    /**
     * The credit card associated with a seller's charity seller account will expire in 15 (or fewer) days.
     */
    CREDIT_CARD_ABOUT_TO_EXPIRE("CreditCardAboutToExpire"),


    REGISTERED_NO_CREDIT_CARD("RegisteredNoCreditCard"),


    /**
     * The seller is no longer a registered charity seller and has lost direct seller status.
     */
    NOT_REGISTERED_LOST_DIRECT_SELLER_STATUS("NotRegisteredLostDirectSellerStatus"),


    DIRECT_DEBIT_REJECTED("DirectDebitRejected"),


    /**
     * The seller is a registered direct seller, but has no credit card associated with the charity seller account.
     */
    REGISTERED_DIRECT_SELLER("RegisteredDirectSeller"),


    /**
     * The seller is a registered charity seller with no donation payment method on file.
     */
    REGISTERED_NO_PAYMENT_METHOD("RegisteredNoPaymentMethod"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    CharitySellerStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CharitySellerStatusCodeType fromValue(String v) {
        if (v != null) {
            for (CharitySellerStatusCodeType c : CharitySellerStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}