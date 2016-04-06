// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

public class StoreSubscriptionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Level")
    @Order(value = 0)
    public StoreSubscriptionLevelCodeType level;

    @Element(name = "Fee")
    @Order(value = 1)
    public AmountType fee;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}