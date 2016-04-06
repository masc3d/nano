// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.finding.api;

import java.io.Serializable;
import java.util.List;

/**
 * Name of the domain to which search results will be restricted.
 */
public class DomainFilter implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public List<String> domainName;

    @Element
    @Order(value = 1)
    public String delimiter;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}