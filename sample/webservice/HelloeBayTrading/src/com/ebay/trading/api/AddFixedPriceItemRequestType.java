// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Defines and lists a new fixed-price listing (not auction-style listings).
 * The main difference between AddFixedPriceItem and AddItem is that
 * AddFixedPriceItem supports the creation of fixed-price listings only,
 * whereas AddItem supports all listing formats.<br>
 * <br>
 * Also, only AddFixedPriceItem supports multi-variation listings
 * and tracking inventory by SKU. AddItem does not support
 * Variations or InventoryTrackingMethod.<br>
 * <br>
 * See the AddFixedPriceItem documentation for additional information.
 */
@RootElement(name = "AddFixedPriceItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddFixedPriceItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Item")
    @Order(value = 0)
    public ItemType item;


}