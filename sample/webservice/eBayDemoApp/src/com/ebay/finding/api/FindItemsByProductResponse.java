// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;

/**
 * Response container for the findItemsByProduct call.
 */
@RootElement(name = "findItemsByProductResponse", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class FindItemsByProductResponse extends BaseFindingServiceResponse implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public AspectHistogramContainer aspectHistogramContainer;

    @Element
    @Order(value = 1)
    public ConditionHistogramContainer conditionHistogramContainer;


}