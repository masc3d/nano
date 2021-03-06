// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Defines the <b>SetUserPreferences</b> request container.
 */
@RootElement(name = "SetUserPreferencesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetUserPreferencesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "BidderNoticePreferences")
    @Order(value = 0)
    public BidderNoticePreferencesType bidderNoticePreferences;

    @Element(name = "CombinedPaymentPreferences")
    @Order(value = 1)
    public CombinedPaymentPreferencesType combinedPaymentPreferences;

    @Element(name = "CrossPromotionPreferences")
    @Order(value = 2)
    public CrossPromotionPreferencesType crossPromotionPreferences;

    @Element(name = "SellerPaymentPreferences")
    @Order(value = 3)
    public SellerPaymentPreferencesType sellerPaymentPreferences;

    @Element(name = "SellerFavoriteItemPreferences")
    @Order(value = 4)
    public SellerFavoriteItemPreferencesType sellerFavoriteItemPreferences;

    @Element(name = "EndOfAuctionEmailPreferences")
    @Order(value = 5)
    public EndOfAuctionEmailPreferencesType endOfAuctionEmailPreferences;

    @Element(name = "EmailShipmentTrackingNumberPreference")
    @Order(value = 6)
    public Boolean emailShipmentTrackingNumberPreference;

    @Element(name = "RequiredShipPhoneNumberPreference")
    @Order(value = 7)
    public Boolean requiredShipPhoneNumberPreference;

    @Element(name = "UnpaidItemAssistancePreferences")
    @Order(value = 8)
    public UnpaidItemAssistancePreferencesType unpaidItemAssistancePreferences;

    @Element(name = "PurchaseReminderEmailPreferences")
    @Order(value = 9)
    public PurchaseReminderEmailPreferencesType purchaseReminderEmailPreferences;

    @Element(name = "SellerThirdPartyCheckoutDisabled")
    @Order(value = 10)
    public Boolean sellerThirdPartyCheckoutDisabled;

    @Element(name = "DispatchCutoffTimePreference")
    @Order(value = 11)
    public DispatchCutoffTimePreferencesType dispatchCutoffTimePreference;


}