// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Identifies a set of one or more fees that a member pays to eBay (or
 * an eBay company). Instances of this type can hold one or more fees.
 */
public class FeesType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Fee")
    @Order(value = 0)
    public List<FeeType> fee;


}