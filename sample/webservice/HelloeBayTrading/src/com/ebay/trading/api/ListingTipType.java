// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A tip on improving a listing's details. Tips are returned from the Listing Analyzer engine.
 */
public class ListingTipType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ListingTipID")
    @Order(value = 0)
    public String listingTipID;

    @Element(name = "Priority")
    @Order(value = 1)
    public Integer priority;

    @Element(name = "Message")
    @Order(value = 2)
    public ListingTipMessageType message;

    @Element(name = "Field")
    @Order(value = 3)
    public ListingTipFieldType field;

    @AnyElement
    @Order(value = 4)
    public List<Object> any;


}