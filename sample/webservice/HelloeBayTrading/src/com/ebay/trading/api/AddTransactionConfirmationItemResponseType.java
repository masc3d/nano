// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Returns an item ID for a new Transaction Confirmation Request (TCR).
 */
@RootElement(name = "AddTransactionConfirmationItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddTransactionConfirmationItemResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;

    @Element(name = "StartTime")
    @Order(value = 1)
    public Date startTime;

    @Element(name = "EndTime")
    @Order(value = 2)
    public Date endTime;


}