// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Retrieves the requesting application's notification preferences. Details are only returned for events for which a
 * preference has been set. For example, if you enabled notification for the EndOfAuction event and later disabled it,
 * the GetNotificationPreferences response would cite the EndOfAuction event preference as Disabled. Otherwise, no
 * details would be returned regarding EndOfAuction.
 */
@RootElement(name = "GetNotificationPreferencesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetNotificationPreferencesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "PreferenceLevel")
    @Order(value = 0)
    public NotificationRoleCodeType preferenceLevel;


}