// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Defines properties associated with a particular event.
 */
public class NotificationEventPropertyType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "EventType")
    @Order(value = 0)
    public NotificationEventTypeCodeType eventType;

    @Element(name = "Name")
    @Order(value = 1)
    public NotificationEventPropertyNameCodeType name;

    @Element(name = "Value")
    @Order(value = 2)
    public String value;

    @AnyElement
    @Order(value = 3)
    public List<Object> any;


}