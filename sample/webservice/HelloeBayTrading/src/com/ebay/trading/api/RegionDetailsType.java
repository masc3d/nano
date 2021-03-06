// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * This type is no longer used; replaced by <b>ShippingLocationDetails</b>.
 */
public class RegionDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "RegionID")
    @Order(value = 0)
    public String regionID;

    @Element(name = "Description")
    @Order(value = 1)
    public String description;

    @Element(name = "DetailVersion")
    @Order(value = 2)
    public String detailVersion;

    @Element(name = "UpdateTime")
    @Order(value = 3)
    public Date updateTime;

    @AnyElement
    @Order(value = 4)
    public List<Object> any;


}