// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Retrieves top-ranked contextual eBay keywords and categories
 * for a specified web page.
 */
@RootElement(name = "GetContextualKeywordsRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetContextualKeywordsRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "URL")
    @Order(value = 0)
    public String url;

    @Element(name = "Encoding")
    @Order(value = 1)
    public String encoding;

    @Element(name = "CategoryID")
    @Order(value = 2)
    public List<String> categoryID;


}