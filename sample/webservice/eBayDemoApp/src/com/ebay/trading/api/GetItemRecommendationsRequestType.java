// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * No longer recommended.
 */
@RootElement(name = "GetItemRecommendationsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemRecommendationsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "GetRecommendationsRequestContainer")
    @Order(value = 0)
    public List<GetRecommendationsRequestContainerType> getRecommendationsRequestContainer;


}