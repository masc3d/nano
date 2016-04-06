// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Contains product information that can be included in a listing.
 * Applicable for listings that use eBay's Pre-filled Item Information feature.
 * See the Developer's Guide for details on working with Pre-filled Item Information.
 */
public class ProductListingDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ProductID")
    @Order(value = 0)
    public String productID;

    @Element(name = "IncludeStockPhotoURL")
    @Order(value = 1)
    public Boolean includeStockPhotoURL;

    @Element(name = "IncludePrefilledItemInformation")
    @Order(value = 2)
    public Boolean includePrefilledItemInformation;

    @Element(name = "UseStockPhotoURLAsGallery")
    @Order(value = 3)
    public Boolean useStockPhotoURLAsGallery;

    @Element(name = "StockPhotoURL")
    @Order(value = 4)
    public String stockPhotoURL;

    @Element(name = "Copyright")
    @Order(value = 5)
    public List<String> copyright;

    @Element(name = "ProductReferenceID")
    @Order(value = 6)
    public String productReferenceID;

    @Element(name = "DetailsURL")
    @Order(value = 7)
    public String detailsURL;

    @Element(name = "ProductDetailsURL")
    @Order(value = 8)
    public String productDetailsURL;

    @Element(name = "ReturnSearchResultOnDuplicates")
    @Order(value = 9)
    public Boolean returnSearchResultOnDuplicates;

    @Element(name = "ListIfNoProduct")
    @Order(value = 10)
    public Boolean listIfNoProduct;

    @Element(name = "GTIN")
    @Order(value = 11)
    public String gtin;

    @Element(name = "ISBN")
    @Order(value = 12)
    public String isbn;

    @Element(name = "UPC")
    @Order(value = 13)
    public String upc;

    @Element(name = "EAN")
    @Order(value = 14)
    public String ean;

    @Element(name = "BrandMPN")
    @Order(value = 15)
    public BrandMPNType brandMPN;

    @Element(name = "TicketListingDetails")
    @Order(value = 16)
    public TicketListingDetailsType ticketListingDetails;

    @Element(name = "UseFirstProduct")
    @Order(value = 17)
    public Boolean useFirstProduct;

    @AnyElement
    @Order(value = 18)
    public List<Object> any;


}