// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Contains information about the status of email correspondence for the lead.
 */
public enum AdFormatLeadStatusCodeType {

    /**
     * A new message from a prospective buyer that the seller has not yet responded to.
     */
    NEW("New"),


    /**
     * A message from a prospective buyer that the seller has responded to.
     */
    RESPONDED("Responded"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    AdFormatLeadStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AdFormatLeadStatusCodeType fromValue(String v) {
        if (v != null) {
            for (AdFormatLeadStatusCodeType c : AdFormatLeadStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}