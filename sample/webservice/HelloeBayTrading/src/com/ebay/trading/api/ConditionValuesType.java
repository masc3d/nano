// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Fields in this type provide condition values and display names.
 */
public class ConditionValuesType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Condition")
    @Order(value = 0)
    public List<ConditionType> condition;

    @Element(name = "ConditionHelpURL")
    @Order(value = 1)
    public String conditionHelpURL;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}