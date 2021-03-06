// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Retrieves data pertaining to a single eBay user. Callers can use this call to
 * return their own user data or the data of another eBay user. Unless the caller
 * passes in an ItemID that identifies a current or past common order, not all
 * data (like email addresses) will be returned in the User object.
 */
@RootElement(name = "GetUserRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetUserRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;

    @Element(name = "UserID")
    @Order(value = 1)
    public String userID;

    @Element(name = "IncludeExpressRequirements")
    @Order(value = 2)
    public Boolean includeExpressRequirements;

    @Element(name = "IncludeFeatureEligibility")
    @Order(value = 3)
    public Boolean includeFeatureEligibility;


}