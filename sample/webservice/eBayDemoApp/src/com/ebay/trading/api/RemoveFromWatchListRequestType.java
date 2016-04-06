// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Enables a user to remove one or more items from their My eBay watch list.
 */
@RootElement(name = "RemoveFromWatchListRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RemoveFromWatchListRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public List<String> itemID;

    @Element(name = "RemoveAllItems")
    @Order(value = 1)
    public Boolean removeAllItems;

    @Element(name = "VariationKey")
    @Order(value = 2)
    public List<VariationKeyType> variationKey;


}