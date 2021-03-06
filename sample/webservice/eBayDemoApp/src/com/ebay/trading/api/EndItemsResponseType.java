// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Contains a response of the resulting status of ending each item.
 */
@RootElement(name = "EndItemsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class EndItemsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "EndItemResponseContainer")
    @Order(value = 0)
    public List<EndItemResponseContainerType> endItemResponseContainer;


}