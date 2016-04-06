// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;

/**
 * This type provides information about the weight, volume or other quantity measurement of a
 * listed item. The European Union requires listings for certain types of products to include the
 * price per unit so buyers can accurately compare prices. eBay uses the
 * <strong>UnitType</strong> and <strong>UnitQuantity</strong> values and
 * the item's listed price to calculate and display the per-unit price on eBay EU sites.
 */
public class UnitPriceInfo implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public String type;

    @Element
    @Order(value = 1)
    public double quantity;


}