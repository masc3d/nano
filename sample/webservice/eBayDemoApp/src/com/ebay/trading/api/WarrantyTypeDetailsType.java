// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

public class WarrantyTypeDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "WarrantyTypeOption")
    @Order(value = 0)
    public String warrantyTypeOption;

    @Element(name = "Description")
    @Order(value = 1)
    public String description;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}