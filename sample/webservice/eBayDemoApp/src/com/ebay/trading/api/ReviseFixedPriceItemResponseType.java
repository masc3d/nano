// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Returns the item ID and the estimated fees for the revised listing.
 */
@RootElement(name = "ReviseFixedPriceItemResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseFixedPriceItemResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;

    @Element(name = "SKU")
    @Order(value = 1)
    public String sku;

    @Element(name = "StartTime")
    @Order(value = 2)
    public Date startTime;

    @Element(name = "EndTime")
    @Order(value = 3)
    public Date endTime;

    @Element(name = "Fees")
    @Order(value = 4)
    public FeesType fees;

    @Element(name = "CategoryID")
    @Order(value = 5)
    public String categoryID;

    @Element(name = "Category2ID")
    @Order(value = 6)
    public String category2ID;

    @Element(name = "DiscountReason")
    @Order(value = 7)
    public List<DiscountReasonCodeType> discountReason;

    @Element(name = "ProductSuggestions")
    @Order(value = 8)
    public ProductSuggestionsType productSuggestions;


}