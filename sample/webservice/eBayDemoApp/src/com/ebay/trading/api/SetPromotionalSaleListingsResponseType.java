// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Contains the status of a promotional sale.
 */
@RootElement(name = "SetPromotionalSaleListingsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetPromotionalSaleListingsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Status")
    @Order(value = 0)
    public PromotionalSaleStatusCodeType status;


}