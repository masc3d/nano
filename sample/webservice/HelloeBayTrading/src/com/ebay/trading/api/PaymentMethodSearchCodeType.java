// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Used for specifying items for which a specific payment method or methods are accepted.
 */
public enum PaymentMethodSearchCodeType {

    /**
     * PayPal payment method.
     */
    PAY_PAL("PayPal"),


    /**
     * PaisaPay payment method. The PaisaPay payment method is only for the India site (site ID 203).
     */
    PAISA_PAY("PaisaPay"),


    /**
     * Either the PayPal or the PaisaPay payment method. The PaisaPay payment method is only for the India site (site ID 203).
     */
    PAY_PAL_OR_PAISA_PAY("PayPalOrPaisaPay"),


    CUSTOM_CODE("CustomCode"),


    /**
     * PaisaPayEscrowEMI (Equal Monthly Installments) payment method. The PaisaPayEscrowEMI payment method is only for the India site (site ID 203).
     */
    PAISA_PAY_ESCROW_EMI("PaisaPayEscrowEMI");


    private final String value;

    PaymentMethodSearchCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodSearchCodeType fromValue(String v) {
        if (v != null) {
            for (PaymentMethodSearchCodeType c : PaymentMethodSearchCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}