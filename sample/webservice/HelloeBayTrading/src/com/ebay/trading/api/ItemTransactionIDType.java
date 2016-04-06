// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This container is designed to return all order line items related to specific
 * multiple-item, fixed-price listings. Additionally, a SKU filter can be used to
 * return all order line items related to a specific product or variation of an
 * item.
 */
public class ItemTransactionIDType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;

    @Element(name = "TransactionID")
    @Order(value = 1)
    public String transactionID;

    @Element(name = "SKU")
    @Order(value = 2)
    public String sku;

    @Element(name = "OrderLineItemID")
    @Order(value = 3)
    public String orderLineItemID;

    @AnyElement
    @Order(value = 4)
    public List<Object> any;


}