// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A pairing of range and insurance cost.
 */
public class FlatRateInsuranceRangeCostType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "FlatRateInsuranceRange")
    @Order(value = 0)
    public FlatRateInsuranceRangeCodeType flatRateInsuranceRange;

    @Element(name = "InsuranceCost")
    @Order(value = 1)
    public AmountType insuranceCost;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}