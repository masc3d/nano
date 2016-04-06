// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * Applicable to sites that support the Detailed Seller Ratings feature.
 * The FeedbackRatingDetailCodeType is the list of areas for detailed seller ratings. When buyers leave an overall Feedback rating (positive, neutral, or negative) for a seller, they also can leave ratings in four areas: item as described, communication, shipping time, and charges for shipping and handling. Users retrieve detailed ratings as averages of the ratings left by buyers.
 */
public enum FeedbackRatingDetailCodeType {

    /**
     * Detailed seller rating in the area of "item as described."
     */
    ITEM_AS_DESCRIBED("ItemAsDescribed"),


    /**
     * Detailed seller rating in the area of "communication."
     */
    COMMUNICATION("Communication"),


    /**
     * Detailed seller rating in the area of "shipping time." Inapplicable to
     * motor vehicle items.
     */
    SHIPPING_TIME("ShippingTime"),


    /**
     * Detailed seller rating in the area of "charges for shipping and handling."
     * Inapplicable to motor vehicle items.
     */
    SHIPPING_AND_HANDLING_CHARGES("ShippingAndHandlingCharges"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    FeedbackRatingDetailCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FeedbackRatingDetailCodeType fromValue(String v) {
        if (v != null) {
            for (FeedbackRatingDetailCodeType c : FeedbackRatingDetailCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}