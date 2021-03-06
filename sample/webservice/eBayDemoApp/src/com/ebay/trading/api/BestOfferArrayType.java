// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A collection of Best Offers. Empty if there are no best offers.
 */
public class BestOfferArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "BestOffer")
    @Order(value = 0)
    public List<BestOfferType> bestOffer;


}