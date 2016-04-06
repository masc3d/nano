// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * SearchFlagCodeType - Search flags for FindItemsAdvanced.
 */
public enum SearchFlagCodeType {

    /**
     * Return only charity item listings.
     */
    CHARITY("Charity"),


    /**
     * Return only gift items.
     */
    GIFT("Gift"),


    NOW_AND_NEW("NowAndNew"),


    /**
     * Perform a local search.
     */
    LOCAL_SEARCH("LocalSearch"),


    /**
     * If specified, only items with free shipping for the user's location are
     * returned. The user's location is determined from the site ID specified
     * in the request. If false, no filtering is done via this attribute. A
     * listing is not considered a free shipping listing if it requires
     * insurance or requires pick up or requires a shipping surcharge.
     */
    FREE_SHIPPING("FreeShipping"),


    /**
     * Return Gallery items only.
     */
    GALLERY("Gallery"),


    /**
     * Picture.
     */
    PICTURE("Picture"),


    /**
     * Limits the results to Get It Fast listings.
     */
    GET_IT_FAST("GetItFast"),


    /**
     * Limits the results to only those listings for which lot size is 2 or greater.
     */
    LOT("Lot"),


    /**
     * Limits the results based on each item's eligibility to appear on the
     * mobile.de site. If
     * specified, queries for eligible items only. If not specified, the search
     * results are not affected. Only applicable for items listed on the eBay
     * Germany site (site ID 77) in subcategories of mobile.de search-enabled
     * categories.
     */
    GERMAN_MOTORS_SEARCHABLE("GermanMotorsSearchable"),


    /**
     * Returns items that are also listed on the WorldOfGood.com website. (The Item IDs
     * are the same on both websites.)
     */
    WORLD_OF_GOOD("WorldOfGood"),


    DIGITAL_DELIVERY("DigitalDelivery"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SearchFlagCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchFlagCodeType fromValue(String v) {
        if (v != null) {
            for (SearchFlagCodeType c : SearchFlagCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}