// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Defines the vehicle type to which parts compatibility applies. If the field is
 * present, the corresponding feature applies to the site. The field is returned as an
 * empty element (e.g., a boolean value is not returned).
 */
public class CompatibleVehicleTypeDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @AnyElement
    @Order(value = 0)
    public List<Object> any;


}