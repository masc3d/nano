// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type is deprecated because attributes are deprecated.
 */
public class LookupAttributeType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Name")
    @Order(value = 0)
    public String name;

    @Element(name = "Value")
    @Order(value = 1)
    public String value;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}