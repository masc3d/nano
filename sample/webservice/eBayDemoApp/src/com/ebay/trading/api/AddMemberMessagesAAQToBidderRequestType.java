// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Enables a seller to send up to 10 messages to bidders, or to users who have
 * made offers via Best Offer, regarding an active item listing.
 */
@RootElement(name = "AddMemberMessagesAAQToBidderRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddMemberMessagesAAQToBidderRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "AddMemberMessagesAAQToBidderRequestContainer")
    @Order(value = 0)
    public List<AddMemberMessagesAAQToBidderRequestContainerType> addMemberMessagesAAQToBidderRequestContainer;


}