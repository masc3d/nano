// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;

/**
 * Returns stock product information in Half.com catalogs, such as
 * information about a particular DVD or book. Optionally,
 * also returns items that match the product.
 */
@RootElement(name = "FindHalfProductsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindHalfProductsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "DomainHistogram")
    @Order(value = 0)
    public DomainHistogramType domainHistogram;

    @Element(name = "PageNumber")
    @Order(value = 1)
    public Integer pageNumber;

    @Element(name = "ApproximatePages")
    @Order(value = 2)
    public Integer approximatePages;

    @Element(name = "MoreResults")
    @Order(value = 3)
    public Boolean moreResults;

    @Element(name = "TotalProducts")
    @Order(value = 4)
    public Integer totalProducts;

    @Element(name = "Products")
    @Order(value = 5)
    public HalfProductsType products;

    @Element(name = "ProductSearchURL")
    @Order(value = 6)
    public String productSearchURL;


}