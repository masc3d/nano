// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Specifies 1 year feedback metrics for a seller.
 */
public class SellerRoleMetricsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "PositiveFeedbackLeftCount")
    @Order(value = 0)
    public Integer positiveFeedbackLeftCount;

    @Element(name = "NegativeFeedbackLeftCount")
    @Order(value = 1)
    public Integer negativeFeedbackLeftCount;

    @Element(name = "NeutralFeedbackLeftCount")
    @Order(value = 2)
    public Integer neutralFeedbackLeftCount;

    @Element(name = "FeedbackLeftPercent")
    @Order(value = 3)
    public Float feedbackLeftPercent;

    @Element(name = "RepeatBuyerCount")
    @Order(value = 4)
    public Integer repeatBuyerCount;

    @Element(name = "RepeatBuyerPercent")
    @Order(value = 5)
    public Float repeatBuyerPercent;

    @Element(name = "UniqueBuyerCount")
    @Order(value = 6)
    public Integer uniqueBuyerCount;

    @Element(name = "TransactionPercent")
    @Order(value = 7)
    public Float transactionPercent;

    @Element(name = "CrossBorderTransactionCount")
    @Order(value = 8)
    public Integer crossBorderTransactionCount;

    @Element(name = "CrossBorderTransactionPercent")
    @Order(value = 9)
    public Float crossBorderTransactionPercent;

    @AnyElement
    @Order(value = 10)
    public List<Object> any;


}