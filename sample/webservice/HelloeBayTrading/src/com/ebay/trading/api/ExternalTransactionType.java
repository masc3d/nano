// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Container consisting of details related to payment of an eBay order on an
 * external system such as PayPal. This container is only returned if payment has
 * been made on an order. For GetSellerTransaactions and GetItemTransactions, this
 * container is not returned for multiple line item orders.
 */
public class ExternalTransactionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ExternalTransactionID")
    @Order(value = 0)
    public String externalTransactionID;

    @Element(name = "ExternalTransactionTime")
    @Order(value = 1)
    public Date externalTransactionTime;

    @Element(name = "FeeOrCreditAmount")
    @Order(value = 2)
    public AmountType feeOrCreditAmount;

    @Element(name = "PaymentOrRefundAmount")
    @Order(value = 3)
    public AmountType paymentOrRefundAmount;

    @AnyElement
    @Order(value = 4)
    public List<Object> any;


}