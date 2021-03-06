// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;
import java.util.List;

/**
 * Container for histogram fields.
 */
public class ConditionHistogram implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public Condition condition;

    @Element
    @Order(value = 1)
    public int count;

    @Element
    @Order(value = 2)
    public String delimiter;

    @AnyElement
    @Order(value = 3)
    public List<Object> any;


}