// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type is deprecated as the call is no longer available.
 */
@RootElement(name = "GetProductSearchResultsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductSearchResultsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "DataElementSets")
    @Order(value = 0)
    public List<DataElementSetType> dataElementSets;

    @Element(name = "ProductSearchResult")
    @Order(value = 1)
    public List<ProductSearchResultType> productSearchResult;


}