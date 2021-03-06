// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import java.util.List;

/**
 * Type for the return policy details of an item.
 */
public class ReturnPolicyType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Refund")
    @Order(value = 0)
    public String refund;

    @Element(name = "ReturnsWithin")
    @Order(value = 1)
    public String returnsWithin;

    @Element(name = "ReturnsAccepted")
    @Order(value = 2)
    public String returnsAccepted;

    @Element(name = "Description")
    @Order(value = 3)
    public String description;

    @Element(name = "WarrantyOffered")
    @Order(value = 4)
    public String warrantyOffered;

    @Element(name = "WarrantyType")
    @Order(value = 5)
    public String warrantyType;

    @Element(name = "WarrantyDuration")
    @Order(value = 6)
    public String warrantyDuration;

    @Element(name = "EAN")
    @Order(value = 7)
    public String ean;

    @Element(name = "ShippingCostPaidBy")
    @Order(value = 8)
    public String shippingCostPaidBy;

    @Element(name = "RestockingFeeValue")
    @Order(value = 9)
    public String restockingFeeValue;

    @Element(name = "RestockingFeeValueOption")
    @Order(value = 10)
    public String restockingFeeValueOption;

    @AnyElement
    @Order(value = 11)
    public List<Object> any;


}