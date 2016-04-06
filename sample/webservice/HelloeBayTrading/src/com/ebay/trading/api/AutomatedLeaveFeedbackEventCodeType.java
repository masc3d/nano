// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Events that will trigger an automated feedback to a buyer. Applies to Selling Manager Pro users.
 */
public enum AutomatedLeaveFeedbackEventCodeType {

    /**
     * Leave feedback automatically when you receive positive feedback.
     */
    POSITIVE_FEEDBACK_RECEIVED("PositiveFeedbackReceived"),


    /**
     * Leave feedback automatically when you receive payment.
     */
    PAYMENT_RECEIVED("PaymentReceived"),


    /**
     * Do not leave feedback automatically.
     */
    NONE("None"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    AutomatedLeaveFeedbackEventCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutomatedLeaveFeedbackEventCodeType fromValue(String v) {
        if (v != null) {
            for (AutomatedLeaveFeedbackEventCodeType c : AutomatedLeaveFeedbackEventCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}