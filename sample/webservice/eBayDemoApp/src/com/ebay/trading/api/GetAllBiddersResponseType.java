// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Includes the list of bidders for the requested item as part of the general item listing data. Some bidder information is anonymous, to protect bidders from fraud. If the seller makes this API call, the actual ids of all bidders on the seller's item will be returned. If a bidder makes this API call, the bidder's actual id will be returned. Information for all competing bidders or outside watchers will be returned as anonymized userIDs. See See <a href="http://developer.ebay.com/DevZone/XML/docs/WebHelp/index.htm?context=eBay_XML_API&topic=AnonymousUserInfo">Working with Anonymous User Information</a>in the eBay Web Services Guide for more information.
 */
@RootElement(name = "GetAllBiddersResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetAllBiddersResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "BidArray")
    @Order(value = 0)
    public OfferArrayType bidArray;

    @Element(name = "HighBidder")
    @Order(value = 1)
    public String highBidder;

    @Element(name = "HighestBid")
    @Order(value = 2)
    public AmountType highestBid;

    @Element(name = "ListingStatus")
    @Order(value = 3)
    public ListingStatusCodeType listingStatus;


}