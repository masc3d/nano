// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Indicates the field and direction (ascending or
 * descending) by which to sort a returned list of items.
 */
public enum ItemSortTypeCodeType {

    /**
     * Sort by Item ID (ascending).
     */
    ITEM_ID("ItemID"),


    /**
     * Sort by price (ascending).
     */
    PRICE("Price"),


    /**
     * Sort by start price (ascending).
     */
    START_PRICE("StartPrice"),


    /**
     * Sort by item title (ascending).
     */
    TITLE("Title"),


    /**
     * Sort by number of bids on the item (ascending).
     */
    BID_COUNT("BidCount"),


    /**
     * Sort by quantity (ascending).
     */
    QUANTITY("Quantity"),


    /**
     * Sort by listing start time (ascending).
     */
    START_TIME("StartTime"),


    /**
     * Sort by listing end time (ascending).
     */
    END_TIME("EndTime"),


    /**
     * Sort by the seller's user ID, in alphabetical order.
     */
    SELLER_USER_ID("SellerUserID"),


    /**
     * Sort by the time left for the item's listing,
     * in ascending order: active items, good-til-cancelled items,
     * and completed items.
     */
    TIME_LEFT("TimeLeft"),


    /**
     * Sort by listing duration (ascending).
     */
    LISTING_DURATION("ListingDuration"),


    /**
     * Sort by listing type (ascending).
     */
    LISTING_TYPE("ListingType"),


    /**
     * Sort by current price (ascending).
     */
    CURRENT_PRICE("CurrentPrice"),


    /**
     * Sort by reserve price (ascending).
     */
    RESERVE_PRICE("ReservePrice"),


    /**
     * Sort by maximum bid price (ascending).
     */
    MAX_BID("MaxBid"),


    /**
     * Sort by number of bidders (ascending).
     */
    BIDDER_COUNT("BidderCount"),


    /**
     * Sort by the user ID of the highest bidder (ascending).
     */
    HIGH_BIDDER_USER_ID("HighBidderUserID"),


    /**
     * Sort by the user ID of the buyer (ascending).
     */
    BUYER_USER_ID("BuyerUserID"),


    /**
     * Sort by the buyer's postal code (ascending).
     */
    BUYER_POSTAL_CODE("BuyerPostalCode"),


    /**
     * Sort by the buyer's email address, in alphabetical order.
     */
    BUYER_EMAIL("BuyerEmail"),


    /**
     * Sort by the seller's email address, in alphabetical order.
     */
    SELLER_EMAIL("SellerEmail"),


    /**
     * Sort by total price (ascending).
     */
    TOTAL_PRICE("TotalPrice"),


    /**
     * Sort by the number of items being watched (ascending). The WatchCount of an item is the number of watches that buyers have placed on an item using their eBay accounts.
     */
    WATCH_COUNT("WatchCount"),


    /**
     * Sort by the number of Best Offers (ascending).
     */
    BEST_OFFER_COUNT("BestOfferCount"),


    /**
     * Sort by the number of questions (ascending).
     */
    QUESTION_COUNT("QuestionCount"),


    /**
     * Sort by the cost indicated for shipping (ascending).
     */
    SHIPPING_SERVICE_COST("ShippingServiceCost"),


    /**
     * Sort by type of feedback received, positive, negative, or neutral.
     * In ascending order - negative, neutral, positive.
     */
    FEEDBACK_RECEIVED("FeedbackReceived"),


    /**
     * Sort by type of feedback received, positive, negative, or neutral.
     * In ascending order - negative, neutral, positive.
     */
    FEEDBACK_LEFT("FeedbackLeft"),


    /**
     * Sort by user ID, in alphabetical order.
     */
    USER_ID("UserID"),


    /**
     * Sort by the number of items sold (ascending).
     */
    QUANTITY_SOLD("QuantitySold"),


    /**
     * Sort items with Best Offers first.
     */
    BEST_OFFER("BestOffer"),


    /**
     * Sort by the number of items available (ascending).
     */
    QUANTITY_AVAILABLE("QuantityAvailable"),


    /**
     * Sort by the number of items purchased (ascending).
     */
    QUANTITY_PURCHASED("QuantityPurchased"),


    /**
     * Sort by the platform on which the item was won (eBay items last).
     */
    WON_PLATFORM("WonPlatform"),


    /**
     * Sort by the platform on which the item was sold (eBay items last).
     */
    SOLD_PLATFORM("SoldPlatform"),


    /**
     * Sort by the duration of the listing (descending).
     */
    LISTING_DURATION_DESCENDING("ListingDurationDescending"),


    /**
     * Sort by the listing type (descending).
     */
    LISTING_TYPE_DESCENDING("ListingTypeDescending"),


    /**
     * Sort by the current price of the listed item (descending).
     */
    CURRENT_PRICE_DESCENDING("CurrentPriceDescending"),


    /**
     * Sort by the listing's reserve price (descending).
     */
    RESERVE_PRICE_DESCENDING("ReservePriceDescending"),


    /**
     * Sort by the highest bid on the item (descending).
     */
    MAX_BID_DESCENDING("MaxBidDescending"),


    /**
     * Sort by number of bidders (descending).
     */
    BIDDER_COUNT_DESCENDING("BidderCountDescending"),


    /**
     * Sort by the user ID of the highest bidder (descending).
     */
    HIGH_BIDDER_USER_ID_DESCENDING("HighBidderUserIDDescending"),


    /**
     * Sort by the user ID of the buyer, in reverse
     * alphabetical order.
     */
    BUYER_USER_ID_DESCENDING("BuyerUserIDDescending"),


    /**
     * Sort by the buyer's postal code, in descending
     * order.
     */
    BUYER_POSTAL_CODE_DESCENDING("BuyerPostalCodeDescending"),


    /**
     * Sort by the buyer's email address, in
     * reverse alphabetical order.
     */
    BUYER_EMAIL_DESCENDING("BuyerEmailDescending"),


    /**
     * Sort by the seller's email address,
     * in reverse alphabetical order.
     */
    SELLER_EMAIL_DESCENDING("SellerEmailDescending"),


    /**
     * Sort by the total price of the order, (descending).
     */
    TOTAL_PRICE_DESCENDING("TotalPriceDescending"),


    /**
     * Sort by watch count (descending).
     */
    WATCH_COUNT_DESCENDING("WatchCountDescending"),


    /**
     * Sort by number of questions (descending).
     */
    QUESTION_COUNT_DESCENDING("QuestionCountDescending"),


    /**
     * Sort by the cost of shipping (descending).
     */
    SHIPPING_SERVICE_COST_DESCENDING("ShippingServiceCostDescending"),


    /**
     * Sort by type of feedback received, positive, negative, or neutral.
     * In descending order - positive, neutral, negative.
     */
    FEEDBACK_RECEIVED_DESCENDING("FeedbackReceivedDescending"),


    /**
     * Sort by type of feedback received, positive, negative, or neutral.
     * In descending order - positive, neutral, negative.
     */
    FEEDBACK_LEFT_DESCENDING("FeedbackLeftDescending"),


    /**
     * Sort by user ID, in descending order.
     */
    USER_ID_DESCENDING("UserIDDescending"),


    /**
     * Sort by the number of items sold, in descending order.
     */
    QUANTITY_SOLD_DESCENDING("QuantitySoldDescending"),


    /**
     * Sort items by the number of Best Offers on an item, in descending order.
     */
    BEST_OFFER_COUNT_DESCENDING("BestOfferCountDescending"),


    /**
     * Sort items by the number there are available, in descending order.
     */
    QUANTITY_AVAILABLE_DESCENDING("QuantityAvailableDescending"),


    /**
     * Sort items by the number that have been purchased, in descending order.
     */
    QUANTITY_PURCHASED_DESCENDING("QuantityPurchasedDescending"),


    /**
     * Sort items with Best Offers last.
     */
    BEST_OFFER_DESCENDING("BestOfferDescending"),


    /**
     * Sort by Item ID (descending).
     */
    ITEM_ID_DESCENDING("ItemIDDescending"),


    /**
     * Sort by price (descending).
     */
    PRICE_DESCENDING("PriceDescending"),


    /**
     * Sort by start price (descending).
     */
    START_PRICE_DESCENDING("StartPriceDescending"),


    /**
     * Sort by item title (descending).
     */
    TITLE_DESCENDING("TitleDescending"),


    /**
     * Sort by number of bids on the item (descending).
     */
    BID_COUNT_DESCENDING("BidCountDescending"),


    /**
     * Sort by the quantity of items sold (descending).
     */
    QUANTITY_DESCENDING("QuantityDescending"),


    /**
     * Sort by listing start time (descending).
     */
    START_TIME_DESCENDING("StartTimeDescending"),


    /**
     * Sort by listing end time (descending).
     */
    END_TIME_DESCENDING("EndTimeDescending"),


    /**
     * Sort by seller user ID, in reverse alphabetical order.
     */
    SELLER_USER_ID_DESCENDING("SellerUserIDDescending"),


    /**
     * Sort by time left on the listing, in descending
     * order: completed items, good-til-cancelled items,
     * and active items.
     */
    TIME_LEFT_DESCENDING("TimeLeftDescending"),


    /**
     * Sort by the platform on which the item was won.
     */
    WON_PLATFORM_DESCENDING("WonPlatformDescending"),


    /**
     * Sort by the platform on which the item was sold.
     */
    SOLD_PLATFORM_DESCENDING("SoldPlatformDescending"),


    /**
     * Sort by the lead (emails) count (ascending).
     */
    LEAD_COUNT("LeadCount"),


    /**
     * Sort by the new lead (new emails) count (ascending).
     */
    NEW_LEAD_COUNT("NewLeadCount"),


    /**
     * Sort by the lead count (descending).
     */
    LEAD_COUNT_DESCENDING("LeadCountDescending"),


    /**
     * Sort by the new contact count (descending).
     */
    NEW_LEAD_COUNT_DESCENDING("NewLeadCountDescending"),


    /**
     * The pay-per-lead feature is no longer available, so this value is no longer
     * applicable.
     */
    CLASSIFIED_AD_PAY_PER_LEAD_FEE("ClassifiedAdPayPerLeadFee"),


    /**
     * The pay-per-lead feature is no longer available, so this value is no longer
     * applicable.
     */
    CLASSIFIED_AD_PAY_PER_LEAD_FEE_DESCENDING("ClassifiedAdPayPerLeadFeeDescending"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    ItemSortTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSortTypeCodeType fromValue(String v) {
        if (v != null) {
            for (ItemSortTypeCodeType c : ItemSortTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}