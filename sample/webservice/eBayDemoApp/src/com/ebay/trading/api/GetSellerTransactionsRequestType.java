// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Retrieves order line item (transaction) information for the user for which the
 * call is made, and not for any other user.&nbsp;<b>Also for
 * Half.com</b>. (To retrieve order line items for another seller's listings, use
 * GetItemTransactions.)
 */
@RootElement(name = "GetSellerTransactionsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerTransactionsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ModTimeFrom")
    @Order(value = 0)
    public Date modTimeFrom;

    @Element(name = "ModTimeTo")
    @Order(value = 1)
    public Date modTimeTo;

    @Element(name = "Pagination")
    @Order(value = 2)
    public PaginationType pagination;

    @Element(name = "IncludeFinalValueFee")
    @Order(value = 3)
    public Boolean includeFinalValueFee;

    @Element(name = "IncludeContainingOrder")
    @Order(value = 4)
    public Boolean includeContainingOrder;

    @Element(name = "SKUArray")
    @Order(value = 5)
    public SKUArrayType skuArray;

    @Element(name = "Platform")
    @Order(value = 6)
    public TransactionPlatformCodeType platform;

    @Element(name = "NumberOfDays")
    @Order(value = 7)
    public Integer numberOfDays;

    @Element(name = "InventoryTrackingMethod")
    @Order(value = 8)
    public InventoryTrackingMethodCodeType inventoryTrackingMethod;

    @Element(name = "IncludeCodiceFiscale")
    @Order(value = 9)
    public Boolean includeCodiceFiscale;


}