// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Specifies how to return the result list for My eBay features such as saved
 * searches, favorite sellers, and second chance offers.
 */
public class MyeBaySelectionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Include")
    @Order(value = 0)
    public Boolean include;

    @Element(name = "IncludeItemCount")
    @Order(value = 1)
    public Boolean includeItemCount;

    @Element(name = "IncludeFavoriteSellerCount")
    @Order(value = 2)
    public Boolean includeFavoriteSellerCount;

    @Element(name = "Sort")
    @Order(value = 3)
    public SortOrderCodeType sort;

    @Element(name = "MaxResults")
    @Order(value = 4)
    public Integer maxResults;

    @Element(name = "UserDefinedListName")
    @Order(value = 5)
    public String userDefinedListName;

    @Element(name = "IncludeListContents")
    @Order(value = 6)
    public Boolean includeListContents;

    @AnyElement
    @Order(value = 7)
    public List<Object> any;


}