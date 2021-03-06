// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import java.util.List;

/**
 * Contains a single ItemID or an array of ItemIDs.
 */
@RootElement(name = "GetItemStatusRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetItemStatusRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public List<String> itemID;


}