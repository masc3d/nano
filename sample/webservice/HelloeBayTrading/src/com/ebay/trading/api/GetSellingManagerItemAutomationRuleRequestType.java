// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Retrieves the set of Selling Manager automation rules
 * associated with an item.
 * This call is subject to change without notice; the
 * deprecation process is inapplicable to this call.
 */
@RootElement(name = "GetSellingManagerItemAutomationRuleRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerItemAutomationRuleRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemID")
    @Order(value = 0)
    public String itemID;


}