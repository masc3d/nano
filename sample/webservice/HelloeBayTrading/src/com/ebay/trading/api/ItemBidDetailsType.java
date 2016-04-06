// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Contains bidding details information of a user on an item.
 */
public class ItemBidDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;

    @Element(name = "CategoryID")
    @Order(value = 1)
    public String categoryID;

    @Element(name = "BidCount")
    @Order(value = 2)
    public Integer bidCount;

    @Element(name = "SellerID")
    @Order(value = 3)
    public String sellerID;

    @Element(name = "LastBidTime")
    @Order(value = 4)
    public Date lastBidTime;

    @AnyElement
    @Order(value = 5)
    public List<Object> any;


}