// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Contains the set of automation rules associated with the specified template.
 */
@RootElement(name = "SetSellingManagerTemplateAutomationRuleResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetSellingManagerTemplateAutomationRuleResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "AutomatedListingRule")
    @Order(value = 0)
    public SellingManagerAutoListType automatedListingRule;

    @Element(name = "AutomatedRelistingRule")
    @Order(value = 1)
    public SellingManagerAutoRelistType automatedRelistingRule;

    @Element(name = "AutomatedSecondChanceOfferRule")
    @Order(value = 2)
    public SellingManagerAutoSecondChanceOfferType automatedSecondChanceOfferRule;

    @Element(name = "Fees")
    @Order(value = 3)
    public FeesType fees;


}