// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Possible bid action types or states.
 */
public enum BidActionCodeType {

    /**
     * Unknown.
     */
    UNKNOWN("Unknown"),


    /**
     * The item is being offered (or was placed) as an auction listing.
     */
    BID("Bid"),


    /**
     * Not used.
     */
    NOT_USED("NotUsed"),


    /**
     * The offer was retracted by the user who extended the
     * offer. (This can only be done on the eBay site, not via API.)
     */
    RETRACTION("Retraction"),


    /**
     * The offer was automatically retracted. (This can only be done on the eBay site, not
     * via API.)
     */
    AUTO_RETRACTION("AutoRetraction"),


    /**
     * The offer was cancelled. (This can only be done on the eBay site, not via API.)
     */
    CANCELLED("Cancelled"),


    /**
     * The offer was automatically cancelled. (This can only be done on the eBay site, not
     * via API.)
     */
    AUTO_CANCEL("AutoCancel"),


    /**
     * The offer placed was an absentee bid. (This can only be done on the eBay site,
     * not via API.)
     */
    ABSENTEE("Absentee"),


    /**
     * The offer resulted in the successful exercise of the Buy It Now option for an
     * auction listing.
     */
    BUY_IT_NOW("BuyItNow"),


    /**
     * The offer is being placed, or was placed, on a fixed-price listing.
     * This value is used for fixed-price listings to purchase an item.
     * In PlaceOffer, for auction listings with the Buy It Now option,
     * specify 'Purchase' to buy the item.
     * In the case of fixed-price listings requiring immediate payment (AutoPay enabled),
     * PlaceOffer cannot be used for purchase. But for fixed-price listings with
     * AutoPay that have the BestOffer option,
     * PlaceOffer can be used to make an offer (but not to purchase).
     */
    PURCHASE("Purchase"),


    /**
     * Reserved for future use.
     */
    CUSTOM_CODE("CustomCode"),


    /**
     * If an item is best-offer enabled, use this value if a buyer is making a best offer on
     * the item. After a buyer makes a best offer (or counter-offer, etc.), the buyer can get
     * the status of the best offer (and of a possible seller-counter-offer, etc.) using the
     * GetBestOffers call.
     */
    OFFER("Offer"),


    /**
     * If an item is best-offer enabled, use this value if a buyer is making a counteroffer
     * to a seller's counteroffer.
     */
    COUNTER("Counter"),


    /**
     * If an item is best-offer enabled, use this value if a buyer is accepting a
     * counteroffer of a seller.
     */
    ACCEPT("Accept"),


    /**
     * If an item is best-offer enabled, use this value if a buyer is declining a
     * counteroffer of a seller.
     */
    DECLINE("Decline");


    private final String value;

    BidActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BidActionCodeType fromValue(String v) {
        if (v != null) {
            for (BidActionCodeType c : BidActionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}