// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Contains the order status, e.g. the buyer's online
 * payment and whether the checkout process for the order is complete.
 */
public class TransactionStatusType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public PaymentStatusCodeType eBayPaymentStatus;

    @Element(name = "CheckoutStatus")
    @Order(value = 1)
    public CheckoutStatusCodeType checkoutStatus;

    @Element(name = "LastTimeModified")
    @Order(value = 2)
    public Date lastTimeModified;

    @Element(name = "PaymentMethodUsed")
    @Order(value = 3)
    public BuyerPaymentMethodCodeType paymentMethodUsed;

    @Element(name = "CompleteStatus")
    @Order(value = 4)
    public CompleteStatusCodeType completeStatus;

    @Element(name = "BuyerSelectedShipping")
    @Order(value = 5)
    public Boolean buyerSelectedShipping;

    @Element(name = "PaymentHoldStatus")
    @Order(value = 6)
    public PaymentHoldStatusCodeType paymentHoldStatus;

    @Element(name = "IntegratedMerchantCreditCardEnabled")
    @Order(value = 7)
    public Boolean integratedMerchantCreditCardEnabled;

    @Element
    @Order(value = 8)
    public EBayPaymentMismatchDetailsType eBayPaymentMismatchDetails;

    @AnyElement
    @Order(value = 9)
    public List<Object> any;


}