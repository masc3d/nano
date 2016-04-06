// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import java.util.List;

/**
 * Returns items in one or more specified categories. Filters can be used to
 * restrict the results.
 */
@RootElement(name = "findItemsByCategoryRequest", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsByCategoryRequest extends BaseFindingServiceRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public List<String> categoryId;

    @Element
    @Order(value = 1)
    public List<ItemFilter> itemFilter;

    @Element
    @Order(value = 2)
    public List<AspectFilter> aspectFilter;

    @Element
    @Order(value = 3)
    public List<OutputSelectorType> outputSelector;

    @Element
    @Order(value = 4)
    public List<DomainFilter> domainFilter;


}