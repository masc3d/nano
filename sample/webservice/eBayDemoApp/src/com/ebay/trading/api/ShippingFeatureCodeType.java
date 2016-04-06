// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Miscellaneous details of the shipment.
 */
public enum ShippingFeatureCodeType {

    /**
     * Confirmation requested.
     */
    DELIVERY_CONFIRMATION("DeliveryConfirmation"),


    /**
     * Signature requested upon receipt.
     */
    SIGNATURE_CONFIRMATION("SignatureConfirmation"),


    /**
     * Stealth postage.
     */
    STEALTH_POSTAGE("StealthPostage"),


    /**
     * Saturday delivery.
     */
    SATURDAY_DELIVERY("SaturdayDelivery"),


    /**
     * Other.
     */
    OTHER("Other"),


    /**
     * Not defined.
     */
    NOT_DEFINED("NotDefined"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    ShippingFeatureCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingFeatureCodeType fromValue(String v) {
        if (v != null) {
            for (ShippingFeatureCodeType c : ShippingFeatureCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}