// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Defines the extended listing durations available to store owners. If the field is
 * present, the corresponding feature applies to the category. The field is returned as
 * anempty element (e.g., a boolean value is not returned). Applies to Fixed Price
 * Listings as well as Store Inventory Format Listings.
 */
public class StoreOwnerExtendedListingDurationsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Duration")
    @Order(value = 0)
    public List<String> duration;

    @AnyElement
    @Order(value = 1)
    public List<Object> any;


}