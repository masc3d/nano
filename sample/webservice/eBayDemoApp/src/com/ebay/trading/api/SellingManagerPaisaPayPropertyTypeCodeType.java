// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Container for the PaisaPay alert types.
 */
public enum SellingManagerPaisaPayPropertyTypeCodeType {

    /**
     * PaisaPay items awaiting shipment.
     */
    PAISA_PAY_AWAITING_SHIPMENT("PaisaPayAwaitingShipment"),


    /**
     * PaisaPay items for which time extension requests are rejected by the buyers.
     */
    PAISA_PAY_TIME_EXTENSION_REQUEST_DECLINED("PaisaPayTimeExtensionRequestDeclined"),


    /**
     * PaisaPay items for which the item receipt has not yet been confirmed by the buyer or not
     * yet been auto-confirmed by the system.
     */
    PAISA_PAY_PENDING_RECEIVED("PaisaPayPendingReceived"),


    /**
     * PaisaPay items for which buyers have filed "Item not received".
     */
    PAISA_PAY_REFUND_INITIATED("PaisaPayRefundInitiated"),


    /**
     * PaisaPay items for which the seller has requested a time extension to enter the
     * shipping information.
     */
    PAISA_PAY_TIME_EXTENSION_REQUESTED("PaisaPayTimeExtensionRequested"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SellingManagerPaisaPayPropertyTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellingManagerPaisaPayPropertyTypeCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerPaisaPayPropertyTypeCodeType c : SellingManagerPaisaPayPropertyTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}