// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import java.util.List;

/**
 * Information about an Half.com catalog product.
 */
public class HalfCatalogProductType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Title")
    @Order(value = 0)
    public String title;

    @Element(name = "DetailsURL")
    @Order(value = 1)
    public String detailsURL;

    @Element(name = "StockPhotoURL")
    @Order(value = 2)
    public String stockPhotoURL;

    @Element(name = "ShippingCostSummary")
    @Order(value = 3)
    public ShippingCostSummaryType shippingCostSummary;

    @Element(name = "DisplayStockPhotos")
    @Order(value = 4)
    public Boolean displayStockPhotos;

    @Element(name = "ItemCount")
    @Order(value = 5)
    public Integer itemCount;

    @Element(name = "ProductID")
    @Order(value = 6)
    public List<ProductIDType> productID;

    @Element(name = "DomainName")
    @Order(value = 7)
    public String domainName;

    @Element(name = "ItemSpecifics")
    @Order(value = 8)
    public NameValueListArrayType itemSpecifics;

    @Element(name = "ItemArray")
    @Order(value = 9)
    public SimpleItemArrayType itemArray;

    @Element(name = "ReviewCount")
    @Order(value = 10)
    public Integer reviewCount;

    @Element(name = "MinPrice")
    @Order(value = 11)
    public AmountType minPrice;

    @AnyElement
    @Order(value = 12)
    public List<Object> any;


}