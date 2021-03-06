// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Manages notification and alert preferences for applications and users.
 */
@RootElement(name = "SetNotificationPreferencesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetNotificationPreferencesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ApplicationDeliveryPreferences")
    @Order(value = 0)
    public ApplicationDeliveryPreferencesType applicationDeliveryPreferences;

    @Element(name = "UserDeliveryPreferenceArray")
    @Order(value = 1)
    public NotificationEnableArrayType userDeliveryPreferenceArray;

    @Element(name = "UserData")
    @Order(value = 2)
    public NotificationUserDataType userData;

    @Element(name = "EventProperty")
    @Order(value = 3)
    public List<NotificationEventPropertyType> eventProperty;

    @Element(name = "DeliveryURLName")
    @Order(value = 4)
    public String deliveryURLName;


}