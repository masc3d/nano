// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

/**
 * Defines the type of treatment applied to a discounted item,
 * either Strikethrough Pricing or Minimum Advertised Price.
 */
public enum PricingTreatmentCodeType {

    /**
     * STP stands for Strikethrough Pricing.
     */
    STP("STP"),


    /**
     * MAP stands for Minimum Advertised Price.
     */
    MAP("MAP"),


    /**
     * None means the item does not qualify for either STP or MAP pricing.
     */
    NONE("None"),


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