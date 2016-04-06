// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * Reserved for future use.
 */
public class ExtensionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public BigInteger id;

    @Element
    @Order(value = 1)
    public String version;

    @Element
    @Order(value = 2)
    public String contentType;

    @Element
    @Order(value = 3)
    public String value;

    @AnyElement
    @Order(value = 4)
    public List<Object> any;


}