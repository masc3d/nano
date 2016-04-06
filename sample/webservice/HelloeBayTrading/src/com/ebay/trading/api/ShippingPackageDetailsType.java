// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Details about type of package used to ship an item.
 */
public class ShippingPackageDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "PackageID")
    @Order(value = 0)
    public Integer packageID;

    @Element(name = "Description")
    @Order(value = 1)
    public String description;

    @Element(name = "ShippingPackage")
    @Order(value = 2)
    public ShippingPackageCodeType shippingPackage;

    @Element(name = "DefaultValue")
    @Order(value = 3)
    public Boolean defaultValue;

    @Element(name = "DimensionsSupported")
    @Order(value = 4)
    public Boolean dimensionsSupported;

    @Element(name = "DetailVersion")
    @Order(value = 5)
    public String detailVersion;

    @Element(name = "UpdateTime")
    @Order(value = 6)
    public Date updateTime;

    @AnyElement
    @Order(value = 7)
    public List<Object> any;


}