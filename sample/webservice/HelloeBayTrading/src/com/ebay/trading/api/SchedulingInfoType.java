// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Contains information for scheduling limits for the user.
 */
public class SchedulingInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "MaxScheduledMinutes")
    @Order(value = 0)
    public Integer maxScheduledMinutes;

    @Element(name = "MinScheduledMinutes")
    @Order(value = 1)
    public Integer minScheduledMinutes;

    @Element(name = "MaxScheduledItems")
    @Order(value = 2)
    public Integer maxScheduledItems;

    @AnyElement
    @Order(value = 3)
    public List<Object> any;


}