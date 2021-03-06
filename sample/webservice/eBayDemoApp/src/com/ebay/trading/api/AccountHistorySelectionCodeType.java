// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Specifies a report format to be used to describe the seller's account.
 */
public enum AccountHistorySelectionCodeType {

    /**
     * (in) Contains the entries since the last invoice eBay sent to the seller.
     * If you use LastInvoice, then InvoiceDate, BeginDate and EndDate are ignored.
     */
    LAST_INVOICE("LastInvoice"),


    /**
     * (in) Contains the entries for a specific invoice, identified
     * by the invoice month and year. If you use SpecifiedInvoice, then you
     * must also use InvoiceDate. If you use SpecifiedInvoice, then BeginDate and EndDate are ignored.
     */
    SPECIFIED_INVOICE("SpecifiedInvoice"),


    /**
     * (in) Contains entries that were posted to the seller's account between two dates.
     * The period covered may cross the boundaries of formal invoices.
     * If you use BetweenSpecifiedDates, then you also must specify BeginDate and EndDate.
     * If you use BetweenSpecifiedDates, then InvoiceDate is ignored.
     */
    BETWEEN_SPECIFIED_DATES("BetweenSpecifiedDates"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    AccountHistorySelectionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountHistorySelectionCodeType fromValue(String v) {
        if (v != null) {
            for (AccountHistorySelectionCodeType c : AccountHistorySelectionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}