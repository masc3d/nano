// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Specifies a predefined subset of item conditions. The predefined set of fields
 * can vary for different calls.
 */
public enum ItemConditionCodeType {

    /**
     * The seller specified the Item Condition as New, or
     * did not specify a condition.
     * (Excludes items that the seller listed as Used.)
     */
    NEW("New"),


    /**
     * The seller specified the Item Condition as Used, or
     * did not specify a condition.
     * (Excludes items that the seller listed as New.)
     */
    USED("Used"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    ItemConditionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemConditionCodeType fromValue(String v) {
        if (v != null) {
            for (ItemConditionCodeType c : ItemConditionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}