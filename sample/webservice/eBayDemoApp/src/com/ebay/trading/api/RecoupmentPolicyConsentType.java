// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Container for supported site information
 */
public class RecoupmentPolicyConsentType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Site")
    @Order(value = 0)
    public List<SiteCodeType> site;

    @AnyElement
    @Order(value = 1)
    public List<Object> any;


}