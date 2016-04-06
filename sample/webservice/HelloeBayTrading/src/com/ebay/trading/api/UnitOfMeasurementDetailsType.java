// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Type defining the <b>UnitOfMeasurementDetails</b> container, which consists
 * of suggested and alternative ways of referring to units of measurement.
 */
public class UnitOfMeasurementDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "UnitOfMeasurement")
    @Order(value = 0)
    public List<UnitOfMeasurementType> unitOfMeasurement;

    @Element(name = "DetailVersion")
    @Order(value = 1)
    public String detailVersion;

    @Element(name = "UpdateTime")
    @Order(value = 2)
    public Date updateTime;

    @AnyElement
    @Order(value = 3)
    public List<Object> any;


}