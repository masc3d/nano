// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;

/**
 * Type that represents the unique identifier for a single product.
 */
public class ProductId implements Serializable {

    private static final long serialVersionUID = -1L;

    @Value
    @Order(value = 0)
    public String value;

    @Attribute
    @Order(value = 1)
    public String type;


}