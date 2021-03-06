// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Specifies the action to take for an item's My eBay notes.
 */
public enum SetUserNotesActionCodeType {

    /**
     * Creates or replaces an item's My eBay notes. Note that if
     * the specified item already has notes in My eBay, the new
     * notes will completely replace the existing notes. They will
     * not be appended.
     */
    ADD_OR_UPDATE("AddOrUpdate"),


    /**
     * Deletes any existing My eBay notes for the specified item.
     * Specifying Delete when no notes exist does nothing, but does
     * not return an error.
     */
    DELETE("Delete"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SetUserNotesActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SetUserNotesActionCodeType fromValue(String v) {
        if (v != null) {
            for (SetUserNotesActionCodeType c : SetUserNotesActionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}