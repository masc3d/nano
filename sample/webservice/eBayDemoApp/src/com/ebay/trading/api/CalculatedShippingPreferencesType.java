// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type contains Calculated Shipping rules and preferences for the seller.
 */
public class CalculatedShippingPreferencesType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CalculatedShippingAmountForEntireOrder")
    @Order(value = 0)
    public AmountType calculatedShippingAmountForEntireOrder;

    @Element(name = "CalculatedShippingChargeOption")
    @Order(value = 1)
    public CalculatedShippingChargeOptionCodeType calculatedShippingChargeOption;

    @Element(name = "CalculatedShippingRateOption")
    @Order(value = 2)
    public CalculatedShippingRateOptionCodeType calculatedShippingRateOption;

    @Element(name = "InsuranceOption")
    @Order(value = 3)
    public InsuranceOptionCodeType insuranceOption;

    @AnyElement
    @Order(value = 4)
    public List<Object> any;


}