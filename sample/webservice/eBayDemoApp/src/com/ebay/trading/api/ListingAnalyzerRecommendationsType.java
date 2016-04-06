// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Contains results returned from the Listing Analyzer recommendation engine.
 */
public class ListingAnalyzerRecommendationsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ListingTipArray")
    @Order(value = 0)
    public ListingTipArrayType listingTipArray;

    @AnyElement
    @Order(value = 1)
    public List<Object> any;


}