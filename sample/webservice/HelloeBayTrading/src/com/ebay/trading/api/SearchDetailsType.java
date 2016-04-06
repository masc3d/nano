// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

public class SearchDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "BuyItNowEnabled")
    @Order(value = 0)
    public Boolean buyItNowEnabled;

    @Element(name = "Picture")
    @Order(value = 1)
    public Boolean picture;

    @Element(name = "RecentListing")
    @Order(value = 2)
    public Boolean recentListing;

    @AnyElement
    @Order(value = 3)
    public List<Object> any;


}