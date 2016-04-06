// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Enables a seller to respond to a Want It Now post with an item listed on the eBay
 * site. Responses appear on the Want It Now post page, with the item title, the
 * price of the item, the number of bids on the item, and the time left before the
 * listing ends. If the item has a picture, the picture is also included on the Want
 * It Now post page.
 */
@RootElement(name = "RespondToWantItNowPostRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class RespondToWantItNowPostRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;

    @Element(name = "PostID")
    @Order(value = 1)
    public String postID;


}