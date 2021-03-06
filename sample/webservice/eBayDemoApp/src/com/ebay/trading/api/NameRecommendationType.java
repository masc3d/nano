// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Defines details about recommended names and values for custom Item Specifics.
 */
public class NameRecommendationType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Name")
    @Order(value = 0)
    public String name;

    @Element(name = "ValidationRules")
    @Order(value = 1)
    public RecommendationValidationRulesType validationRules;

    @Element(name = "ValueRecommendation")
    @Order(value = 2)
    public List<ValueRecommendationType> valueRecommendation;

    @Element(name = "HelpURL")
    @Order(value = 3)
    public String helpURL;

    @Element(name = "Source")
    @Order(value = 4)
    public ItemSpecificSourceCodeType source;

    @Element(name = "HelpText")
    @Order(value = 5)
    public String helpText;

    @AnyElement
    @Order(value = 6)
    public List<Object> any;


}