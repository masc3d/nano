// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Returns the set of orders that match the order IDs or filter criteria specified.
 */
@RootElement(name = "GetOrdersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetOrdersResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "PaginationResult")
    @Order(value = 0)
    public PaginationResultType paginationResult;

    @Element(name = "HasMoreOrders")
    @Order(value = 1)
    public Boolean hasMoreOrders;

    @Element(name = "OrderArray")
    @Order(value = 2)
    public OrderArrayType orderArray;

    @Element(name = "OrdersPerPage")
    @Order(value = 3)
    public Integer ordersPerPage;

    @Element(name = "PageNumber")
    @Order(value = 4)
    public Integer pageNumber;

    @Element(name = "ReturnedOrderCountActual")
    @Order(value = 5)
    public Integer returnedOrderCountActual;


}