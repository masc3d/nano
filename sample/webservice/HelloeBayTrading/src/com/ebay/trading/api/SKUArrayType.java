// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A list of stock-keeping unit (SKU) identifiers that a seller uses in listings.
 */
public class SKUArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "SKU")
    @Order(value = 0)
    public List<String> sku;


}