// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Enables a seller to define shipping cost discount profiles for things such as combined
 * payments for shipping and handling costs.
 */
@RootElement(name = "SetShippingDiscountProfilesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetShippingDiscountProfilesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CurrencyID")
    @Order(value = 0)
    public CurrencyCodeType currencyID;

    @Element(name = "CombinedDuration")
    @Order(value = 1)
    public CombinedPaymentPeriodCodeType combinedDuration;

    @Element(name = "ModifyActionCode")
    @Order(value = 2)
    public ModifyActionCodeType modifyActionCode;

    @Element(name = "FlatShippingDiscount")
    @Order(value = 3)
    public FlatShippingDiscountType flatShippingDiscount;

    @Element(name = "CalculatedShippingDiscount")
    @Order(value = 4)
    public CalculatedShippingDiscountType calculatedShippingDiscount;

    @Element(name = "CalculatedHandlingDiscount")
    @Order(value = 5)
    public CalculatedHandlingDiscountType calculatedHandlingDiscount;

    @Element(name = "PromotionalShippingDiscountDetails")
    @Order(value = 6)
    public PromotionalShippingDiscountDetailsType promotionalShippingDiscountDetails;

    @Element(name = "ShippingInsurance")
    @Order(value = 7)
    public ShippingInsuranceType shippingInsurance;

    @Element(name = "InternationalShippingInsurance")
    @Order(value = 8)
    public ShippingInsuranceType internationalShippingInsurance;


}