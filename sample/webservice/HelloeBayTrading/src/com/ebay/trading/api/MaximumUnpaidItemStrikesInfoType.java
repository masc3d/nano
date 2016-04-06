// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Type defining the <b>MaximumUnpaidItemStrikesInfo</b> container, which is
 * used by the seller as a mechanism to block prospective buyers who have unpaid item
 * strikes on their account exceeding the value set in the <b>Count</b>
 * field during a specified time period (set in the <b>Period</b> field).
 */
public class MaximumUnpaidItemStrikesInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Count")
    @Order(value = 0)
    public Integer count;

    @Element(name = "Period")
    @Order(value = 1)
    public PeriodCodeType period;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}