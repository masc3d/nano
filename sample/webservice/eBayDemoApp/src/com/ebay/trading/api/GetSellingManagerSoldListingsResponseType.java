// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Returns a Selling Manager user's sold listings. Response can be filtered by date, search
 * values, and stores.
 */
@RootElement(name = "GetSellingManagerSoldListingsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerSoldListingsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "SaleRecord")
    @Order(value = 0)
    public List<SellingManagerSoldOrderType> saleRecord;

    @Element(name = "PaginationResult")
    @Order(value = 1)
    public PaginationResultType paginationResult;


}