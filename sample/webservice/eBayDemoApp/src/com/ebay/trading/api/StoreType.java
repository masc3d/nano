// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * The configuration of an eBay Store.
 */
public class StoreType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Name")
    @Order(value = 0)
    public String name;

    @Element(name = "URLPath")
    @Order(value = 1)
    public String urlPath;

    @Element(name = "URL")
    @Order(value = 2)
    public String url;

    @Element(name = "SubscriptionLevel")
    @Order(value = 3)
    public StoreSubscriptionLevelCodeType subscriptionLevel;

    @Element(name = "Description")
    @Order(value = 4)
    public String description;

    @Element(name = "Logo")
    @Order(value = 5)
    public StoreLogoType logo;

    @Element(name = "Theme")
    @Order(value = 6)
    public StoreThemeType theme;

    @Element(name = "HeaderStyle")
    @Order(value = 7)
    public StoreHeaderStyleCodeType headerStyle;

    @Element(name = "HomePage")
    @Order(value = 8)
    public Long homePage;

    @Element(name = "ItemListLayout")
    @Order(value = 9)
    public StoreItemListLayoutCodeType itemListLayout;

    @Element(name = "ItemListSortOrder")
    @Order(value = 10)
    public StoreItemListSortOrderCodeType itemListSortOrder;

    @Element(name = "CustomHeaderLayout")
    @Order(value = 11)
    public StoreCustomHeaderLayoutCodeType customHeaderLayout;

    @Element(name = "CustomHeader")
    @Order(value = 12)
    public String customHeader;

    @Element(name = "ExportListings")
    @Order(value = 13)
    public Boolean exportListings;

    @Element(name = "CustomCategories")
    @Order(value = 14)
    public StoreCustomCategoryArrayType customCategories;

    @Element(name = "CustomListingHeader")
    @Order(value = 15)
    public StoreCustomListingHeaderType customListingHeader;

    @Element(name = "MerchDisplay")
    @Order(value = 16)
    public MerchDisplayCodeType merchDisplay;

    @Element(name = "LastOpenedTime")
    @Order(value = 17)
    public Date lastOpenedTime;

    @Element(name = "TitleWithCompatibility")
    @Order(value = 18)
    public Boolean titleWithCompatibility;

    @AnyElement
    @Order(value = 19)
    public List<Object> any;


}