// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;

/**
 * Product ID has an attribute of ProductIDCodeType and a string value.
 */
public class ProductIDType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Value
    @Order(value = 0)
    public String value;

    @Attribute
    @Order(value = 1)
    public ProductIDCodeType type;


}