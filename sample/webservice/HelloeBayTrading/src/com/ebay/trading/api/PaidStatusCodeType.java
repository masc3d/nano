// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Specifies the payment status of an order, as
 * seen by the buyer and seller.
 */
public enum PaidStatusCodeType {

    /**
     * The buyer has not completed checkout, but has not paid through PayPal or
     * PaisaPay (but please also see the documentation for PaymentHoldStatus and its applicable values).
     * The buyer might have paid using another method, but the payment
     * might not have been received or cleared.
     * Important: Please see the documentation for PaymentHoldStatus and its applicable values.
     * PaymentHoldStatus contains the current status of a hold on a PayPal payment.
     */
    NOT_PAID("NotPaid"),


    /**
     * The buyer has not completed the checkout process and so has not made payment.
     */
    BUYER_HAS_NOT_COMPLETED_CHECKOUT("BuyerHasNotCompletedCheckout"),


    /**
     * The buyer has made a PayPal payment, but the seller has not yet received it.
     */
    PAYMENT_PENDING_WITH_PAY_PAL("PaymentPendingWithPayPal"),


    /**
     * The buyer has made a PayPal payment, and the payment is complete.
     * But please also see the documentation for PaymentHoldStatus and its applicable values.
     * PaymentHoldStatus contains the current status of a hold on a PayPal payment.
     */
    PAID_WITH_PAY_PAL("PaidWithPayPal"),


    /**
     * The order is marked as paid by either buyer or seller.
     */
    MARKED_AS_PAID("MarkedAsPaid"),


    /**
     * The buyer has made an escrow payment, but the seller has not yet received it.
     */
    PAYMENT_PENDING_WITH_ESCROW("PaymentPendingWithEscrow"),


    /**
     * The buyer has made an escrow payment, and the seller has received payment.
     */
    PAID_WITH_ESCROW("PaidWithEscrow"),


    /**
     * The buyer has made an escrow payment, but has cancelled the payment.
     */
    ESCROW_PAYMENT_CANCELLED("EscrowPaymentCancelled"),


    /**
     * The buyer has paid with PaisaPay, but the payment is still being processed.
     * The seller has not yet received payment.
     */
    PAYMENT_PENDING_WITH_PAISA_PAY("PaymentPendingWithPaisaPay"),


    /**
     * The buyer has paid with PaisaPay, and the payment is complete.
     */
    PAID_WITH_PAISA_PAY("PaidWithPaisaPay"),


    /**
     * The buyer has made a payment other than PayPal, escrow, or PaisaPay, but the
     * payment is still being processed.
     */
    PAYMENT_PENDING("PaymentPending"),


    /**
     * Payment Pending With PaisaPay Escrow
     */
    PAYMENT_PENDING_WITH_PAISA_PAY_ESCROW("PaymentPendingWithPaisaPayEscrow"),


    /**
     * Paid With PaisaPay Escrow
     */
    PAID_WITH_PAISA_PAY_ESCROW("PaidWithPaisaPayEscrow"),


    /**
     * Paisa Pay Not Paid
     */
    PAISA_PAY_NOT_PAID("PaisaPayNotPaid"),


    /**
     * Refunded
     */
    REFUNDED("Refunded"),


    /**
     * WaitingForCODPayment
     */
    WAITING_FOR_COD_PAYMENT("WaitingForCODPayment"),


    /**
     * PaidCOD
     */
    PAID_COD("PaidCOD"),


    /**
     * Reserved for future use.
     */
    CUSTOM_CODE("CustomCode"),


    /**
     * Paid
     */
    PAID("Paid");


    private final String value;

    PaidStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaidStatusCodeType fromValue(String v) {
        if (v != null) {
            for (PaidStatusCodeType c : PaidStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}