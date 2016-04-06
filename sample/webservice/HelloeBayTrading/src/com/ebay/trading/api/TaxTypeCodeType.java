// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Type that defines the Imposition field. The Imposition field allows the seller to
 * provide a description of the sales tax type.
 */
public enum TaxTypeCodeType {

    /**
     * A standard sales tax charge.
     */
    SALES_TAX("SalesTax"),


    /**
     * A charge for an electronic waste recycling fee.
     */
    WASTE_RECYCLING_FEE("WasteRecyclingFee"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    TaxTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeCodeType fromValue(String v) {
        if (v != null) {
            for (TaxTypeCodeType c : TaxTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}