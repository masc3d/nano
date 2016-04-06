// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * The <b>PlaceOffer</b> response notifies you about the success and result
 * of the call.
 */
@RootElement(name = "PlaceOfferResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class PlaceOfferResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "SellingStatus")
    @Order(value = 0)
    public SellingStatusType sellingStatus;

    @Element(name = "TransactionID")
    @Order(value = 1)
    public String transactionID;

    @Element(name = "BestOffer")
    @Order(value = 2)
    public BestOfferType bestOffer;

    @Element(name = "OrderLineItemID")
    @Order(value = 3)
    public String orderLineItemID;


}