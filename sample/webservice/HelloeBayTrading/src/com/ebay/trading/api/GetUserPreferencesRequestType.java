// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Retrieves the specified user preferences for the authenticated caller.
 */
@RootElement(name = "GetUserPreferencesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetUserPreferencesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ShowBidderNoticePreferences")
    @Order(value = 0)
    public boolean showBidderNoticePreferences;

    @Element(name = "ShowCombinedPaymentPreferences")
    @Order(value = 1)
    public boolean showCombinedPaymentPreferences;

    @Element(name = "ShowCrossPromotionPreferences")
    @Order(value = 2)
    public boolean showCrossPromotionPreferences;

    @Element(name = "ShowSellerPaymentPreferences")
    @Order(value = 3)
    public boolean showSellerPaymentPreferences;

    @Element(name = "ShowEndOfAuctionEmailPreferences")
    @Order(value = 4)
    public Boolean showEndOfAuctionEmailPreferences;

    @Element(name = "ShowSellerFavoriteItemPreferences")
    @Order(value = 5)
    public Boolean showSellerFavoriteItemPreferences;

    @Element(name = "ShowProStoresPreferences")
    @Order(value = 6)
    public Boolean showProStoresPreferences;

    @Element(name = "ShowEmailShipmentTrackingNumberPreference")
    @Order(value = 7)
    public Boolean showEmailShipmentTrackingNumberPreference;

    @Element(name = "ShowRequiredShipPhoneNumberPreference")
    @Order(value = 8)
    public Boolean showRequiredShipPhoneNumberPreference;

    @Element(name = "ShowSellerExcludeShipToLocationPreference")
    @Order(value = 9)
    public Boolean showSellerExcludeShipToLocationPreference;

    @Element(name = "ShowUnpaidItemAssistancePreference")
    @Order(value = 10)
    public Boolean showUnpaidItemAssistancePreference;

    @Element(name = "ShowPurchaseReminderEmailPreferences")
    @Order(value = 11)
    public Boolean showPurchaseReminderEmailPreferences;

    @Element(name = "ShowUnpaidItemAssistanceExclusionList")
    @Order(value = 12)
    public Boolean showUnpaidItemAssistanceExclusionList;

    @Element(name = "ShowSellerProfilePreferences")
    @Order(value = 13)
    public boolean showSellerProfilePreferences;

    @Element(name = "ShowSellerReturnPreferences")
    @Order(value = 14)
    public Boolean showSellerReturnPreferences;

    @Element(name = "ShowGlobalShippingProgramPreference")
    @Order(value = 15)
    public Boolean showGlobalShippingProgramPreference;

    @Element(name = "ShowDispatchCutoffTimePreferences")
    @Order(value = 16)
    public Boolean showDispatchCutoffTimePreferences;


}