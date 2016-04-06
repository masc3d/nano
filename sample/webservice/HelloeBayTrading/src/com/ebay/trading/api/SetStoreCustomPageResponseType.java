// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Returned after calling SetStoreCustomPageRequest. This serves as
 * confirmation that the custom page was successfully submitted.
 */
@RootElement(name = "SetStoreCustomPageResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class SetStoreCustomPageResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CustomPage")
    @Order(value = 0)
    public StoreCustomPageType customPage;


}