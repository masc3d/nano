// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Sets the tax table for a seller on a given site.
 */
@RootElement(name = "SetTaxTableRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetTaxTableRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "TaxTable")
    @Order(value = 0)
    public TaxTableType taxTable;


}