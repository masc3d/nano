// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Defines the source for discount price treatment.
 */
public enum PricingTreatmentCodeType {

    /**
     * STP stands for Strike Through Pricing.
     */
    STP("STP"),


    /**
     * MAP stands for MinimumAdvertisedPrice
     */
    MAP("MAP"),


    /**
     * None means neither STP nor MinimumAdvertisedPrice.
     */
    NONE("None"),


    /**
     * MFO means stands for MadeForOutletComparisonPrice.
     */
    MFO("MFO"),


    /**
     * Reserved for future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    PricingTreatmentCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PricingTreatmentCodeType fromValue(String v) {
        if (v != null) {
            for (PricingTreatmentCodeType c : PricingTreatmentCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}