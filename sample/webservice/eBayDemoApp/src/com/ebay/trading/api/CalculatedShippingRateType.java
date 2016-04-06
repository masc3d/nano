// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Details pertinent to one or more items for which
 * calculated shipping (or flat rate shipping using shipping rate tables with
 * weight surcharges) has been offered by the seller, such as package
 * dimension and weight and packaging/handling costs. Also returned
 * with the data for an item's transaction.
 */
public class CalculatedShippingRateType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "OriginatingPostalCode")
    @Order(value = 0)
    public String originatingPostalCode;

    @Element(name = "MeasurementUnit")
    @Order(value = 1)
    public MeasurementSystemCodeType measurementUnit;

    @Element(name = "PackageDepth")
    @Order(value = 2)
    public MeasureType packageDepth;

    @Element(name = "PackageLength")
    @Order(value = 3)
    public MeasureType packageLength;

    @Element(name = "PackageWidth")
    @Order(value = 4)
    public MeasureType packageWidth;

    @Element(name = "PackagingHandlingCosts")
    @Order(value = 5)
    public AmountType packagingHandlingCosts;

    @Element(name = "ShippingIrregular")
    @Order(value = 6)
    public Boolean shippingIrregular;

    @Element(name = "ShippingPackage")
    @Order(value = 7)
    public ShippingPackageCodeType shippingPackage;

    @Element(name = "WeightMajor")
    @Order(value = 8)
    public MeasureType weightMajor;

    @Element(name = "WeightMinor")
    @Order(value = 9)
    public MeasureType weightMinor;

    @Element(name = "InternationalPackagingHandlingCosts")
    @Order(value = 10)
    public AmountType internationalPackagingHandlingCosts;

    @AnyElement
    @Order(value = 11)
    public List<Object> any;


}