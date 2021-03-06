// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Container consisting of detailed information on a Feedback entry for a specific
 * order line item.
 */
public class FeedbackDetailType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CommentingUser")
    @Order(value = 0)
    public String commentingUser;

    @Element(name = "CommentingUserScore")
    @Order(value = 1)
    public Integer commentingUserScore;

    @Element(name = "CommentText")
    @Order(value = 2)
    public String commentText;

    @Element(name = "CommentTime")
    @Order(value = 3)
    public Date commentTime;

    @Element(name = "CommentType")
    @Order(value = 4)
    public CommentTypeCodeType commentType;

    @Element(name = "FeedbackResponse")
    @Order(value = 5)
    public String feedbackResponse;

    @Element(name = "Followup")
    @Order(value = 6)
    public String followup;

    @Element(name = "ItemID")
    @Order(value = 7)
    public String itemID;

    @Element(name = "Role")
    @Order(value = 8)
    public TradingRoleCodeType role;

    @Element(name = "ItemTitle")
    @Order(value = 9)
    public String itemTitle;

    @Element(name = "ItemPrice")
    @Order(value = 10)
    public AmountType itemPrice;

    @Element(name = "FeedbackID")
    @Order(value = 11)
    public String feedbackID;

    @Element(name = "TransactionID")
    @Order(value = 12)
    public String transactionID;

    @Element(name = "CommentReplaced")
    @Order(value = 13)
    public Boolean commentReplaced;

    @Element(name = "ResponseReplaced")
    @Order(value = 14)
    public Boolean responseReplaced;

    @Element(name = "FollowUpReplaced")
    @Order(value = 15)
    public Boolean followUpReplaced;

    @Element(name = "Countable")
    @Order(value = 16)
    public Boolean countable;

    @Element(name = "FeedbackRevised")
    @Order(value = 17)
    public Boolean feedbackRevised;

    @Element(name = "OrderLineItemID")
    @Order(value = 18)
    public String orderLineItemID;

    @AnyElement
    @Order(value = 19)
    public List<Object> any;


}