// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Regions to which the seller is willing to ship the item.
 * These values are applicable to ShipToLocation.
 */
public enum ShippingRegionCodeType {

    /**
     * Africa
     */
    AFRICA("Africa"),


    /**
     * Asia
     */
    ASIA("Asia"),


    /**
     * Caribbean
     */
    CARIBBEAN("Caribbean"),


    /**
     * Europe
     */
    EUROPE("Europe"),


    /**
     * Latin America
     */
    LATIN_AMERICA("LatinAmerica"),


    /**
     * Middle East
     */
    MIDDLE_EAST("MiddleEast"),


    /**
     * North America
     */
    NORTH_AMERICA("NorthAmerica"),


    /**
     * Oceania (Pacific region other than Asia)
     */
    OCEANIA("Oceania"),


    /**
     * South America
     */
    SOUTH_AMERICA("SouthAmerica"),


    /**
     * European Union
     */
    EUROPEAN_UNION("EuropeanUnion"),


    /**
     * Seller will not ship the item.
     */
    WILL_NOT_SHIP("WillNotShip"),


    /**
     * Seller has specified Worldwide or eBay has
     * determined that the specified regions add up to Worldwide.
     */
    WORLDWIDE("Worldwide"),


    AMERICAS("Americas"),


    NONE("None"),


    /**
     * Reserved for internal or future use
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    ShippingRegionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingRegionCodeType fromValue(String v) {
        if (v != null) {
            for (ShippingRegionCodeType c : ShippingRegionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}