// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type is deprecated as the <b>GetProduct*</b> calls are no longer available.
 */
public class DataElementSetType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "DataElement")
    @Order(value = 0)
    public String dataElement;

    @Element(name = "DataElementID")
    @Order(value = 1)
    public Integer dataElementID;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;

    @Attribute
    @Order(value = 3)
    public Integer attributeSetID;


}