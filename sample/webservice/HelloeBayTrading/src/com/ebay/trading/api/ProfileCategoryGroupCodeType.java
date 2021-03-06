// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Enumerated type that defines the category group values. Business Policies profiles (Payment,
 * Shipping, and Return Policy) are linked to category groups.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * Business Policies are not yet available for use on the eBay platform.
 * </span>
 */
public enum ProfileCategoryGroupCodeType {

    /**
     * Default value.
     */
    INHERIT("Inherit"),


    /**
     * None.
     */
    NONE("None"),


    /**
     * For Business Policies, the 'ALL' enumeration value represents all eBay categories
     * except for motor vehicles.
     */
    ALL("ALL"),


    /**
     * For Business Policies, the 'MOTORS_VEHICLE' enumeration value represents all motor vehicle
     * categories.
     */
    MOTORS_VEHICLE("MOTORS_VEHICLE");


    private final String value;

    ProfileCategoryGroupCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProfileCategoryGroupCodeType fromValue(String v) {
        if (v != null) {
            for (ProfileCategoryGroupCodeType c : ProfileCategoryGroupCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}