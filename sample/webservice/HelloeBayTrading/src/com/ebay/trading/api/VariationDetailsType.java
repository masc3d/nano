// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Type defining the <b>VariationDetails</b> container that is returned in
 * <b>GeteBayDetails</b> if <b>VariationDetails</b> is included
 * in the request as a <b>DetailName</b> filter, or if <b>GeteBayDetails</b>
 * is called with no <b>DetailName</b> filters.
 */
public class VariationDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "MaxVariationsPerItem")
    @Order(value = 0)
    public Integer maxVariationsPerItem;

    @Element(name = "MaxNamesPerVariationSpecificsSet")
    @Order(value = 1)
    public Integer maxNamesPerVariationSpecificsSet;

    @Element(name = "MaxValuesPerVariationSpecificsSetName")
    @Order(value = 2)
    public Integer maxValuesPerVariationSpecificsSetName;

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