// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Contains a seller's preferences for receiving bidder notices.
 */
public class BidderNoticePreferencesType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "UnsuccessfulBidderNoticeIncludeMyItems")
    @Order(value = 0)
    public Boolean unsuccessfulBidderNoticeIncludeMyItems;

    @AnyElement
    @Order(value = 1)
    public List<Object> any;


}