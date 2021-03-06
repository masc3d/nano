// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Returns a list of the items posted by the authenticated user, including
 * the related item data.
 */
@RootElement(name = "GetSellerListRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerListRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "UserID")
    @Order(value = 0)
    public String userID;

    @Element(name = "MotorsDealerUsers")
    @Order(value = 1)
    public UserIDArrayType motorsDealerUsers;

    @Element(name = "EndTimeFrom")
    @Order(value = 2)
    public Date endTimeFrom;

    @Element(name = "EndTimeTo")
    @Order(value = 3)
    public Date endTimeTo;

    @Element(name = "Sort")
    @Order(value = 4)
    public Integer sort;

    @Element(name = "StartTimeFrom")
    @Order(value = 5)
    public Date startTimeFrom;

    @Element(name = "StartTimeTo")
    @Order(value = 6)
    public Date startTimeTo;

    @Element(name = "Pagination")
    @Order(value = 7)
    public PaginationType pagination;

    @Element(name = "GranularityLevel")
    @Order(value = 8)
    public GranularityLevelCodeType granularityLevel;

    @Element(name = "SKUArray")
    @Order(value = 9)
    public SKUArrayType skuArray;

    @Element(name = "IncludeWatchCount")
    @Order(value = 10)
    public Boolean includeWatchCount;

    @Element(name = "AdminEndedItemsOnly")
    @Order(value = 11)
    public Boolean adminEndedItemsOnly;

    @Element(name = "CategoryID")
    @Order(value = 12)
    public Integer categoryID;

    @Element(name = "IncludeVariations")
    @Order(value = 13)
    public Boolean includeVariations;


}