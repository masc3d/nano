// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

public enum WarningLevelCodeType {

    /**
     * Do not return warnings when the application passes
     * unrecognized or deprecated elements in a request.
     * This is the default value if WarningLevel is not specified.
     */
    LOW("Low"),


    /**
     * Return warnings when the application passes
     * unrecognized or deprecated elements in a request.
     */
    HIGH("High");


    private final String value;

    WarningLevelCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WarningLevelCodeType fromValue(String v) {
        if (v != null) {
            for (WarningLevelCodeType c : WarningLevelCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}