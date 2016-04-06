// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Container for the list of site-specific locations supported by the Exclude Ship To
 * Locations feature.
 */
public class ExcludeShippingLocationDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Description")
    @Order(value = 0)
    public String description;

    @Element(name = "Location")
    @Order(value = 1)
    public String location;

    @Element(name = "Region")
    @Order(value = 2)
    public String region;

    @Element(name = "DetailVersion")
    @Order(value = 3)
    public String detailVersion;

    @Element(name = "UpdateTime")
    @Order(value = 4)
    public Date updateTime;

    @AnyElement
    @Order(value = 5)
    public List<Object> any;


}