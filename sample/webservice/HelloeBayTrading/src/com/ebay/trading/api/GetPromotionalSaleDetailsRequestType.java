// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Retrieves information about promotional sales set up by an eBay store owner
 * (the authenticated caller).
 */
@RootElement(name = "GetPromotionalSaleDetailsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetPromotionalSaleDetailsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "PromotionalSaleID")
    @Order(value = 0)
    public Long promotionalSaleID;

    @Element(name = "PromotionalSaleStatus")
    @Order(value = 1)
    public List<PromotionalSaleStatusCodeType> promotionalSaleStatus;


}