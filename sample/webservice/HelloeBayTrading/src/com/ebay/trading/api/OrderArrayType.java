// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * An array of Orders.
 */
public class OrderArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Order")
    @Order(value = 0)
    public List<OrderType> order;


}