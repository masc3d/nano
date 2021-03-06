// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Returns the item ID and the estimated fees for the new listing, as well as
 * the start and end times of the listing.
 */
@RootElement(name = "AddItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddItemResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;

    @Element(name = "StartTime")
    @Order(value = 1)
    public Date startTime;

    @Element(name = "EndTime")
    @Order(value = 2)
    public Date endTime;

    @Element(name = "Fees")
    @Order(value = 3)
    public FeesType fees;

    @Element(name = "CategoryID")
    @Order(value = 4)
    public String categoryID;

    @Element(name = "Category2ID")
    @Order(value = 5)
    public String category2ID;

    @Element(name = "DiscountReason")
    @Order(value = 6)
    public List<DiscountReasonCodeType> discountReason;

    @Element(name = "ProductSuggestions")
    @Order(value = 7)
    public ProductSuggestionsType productSuggestions;


}