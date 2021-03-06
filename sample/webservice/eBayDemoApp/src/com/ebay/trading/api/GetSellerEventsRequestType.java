// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Retrieves price changes, item revisions, description revisions,
 * and other changes that have occurred within the last 48 hours
 * related to a seller's eBay listings.
 */
@RootElement(name = "GetSellerEventsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerEventsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "UserID")
    @Order(value = 0)
    public String userID;

    @Element(name = "StartTimeFrom")
    @Order(value = 1)
    public Date startTimeFrom;

    @Element(name = "StartTimeTo")
    @Order(value = 2)
    public Date startTimeTo;

    @Element(name = "EndTimeFrom")
    @Order(value = 3)
    public Date endTimeFrom;

    @Element(name = "EndTimeTo")
    @Order(value = 4)
    public Date endTimeTo;

    @Element(name = "ModTimeFrom")
    @Order(value = 5)
    public Date modTimeFrom;

    @Element(name = "ModTimeTo")
    @Order(value = 6)
    public Date modTimeTo;

    @Element(name = "NewItemFilter")
    @Order(value = 7)
    public Boolean newItemFilter;

    @Element(name = "IncludeWatchCount")
    @Order(value = 8)
    public Boolean includeWatchCount;

    @Element(name = "IncludeVariationSpecifics")
    @Order(value = 9)
    public Boolean includeVariationSpecifics;

    @Element(name = "HideVariations")
    @Order(value = 10)
    public Boolean hideVariations;


}