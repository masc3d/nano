// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01.collections.collection;

import com.amazon.webservices.awsecommerceservice._2011_08_01.Price;

import java.io.Serializable;

public class CollectionSummary implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "LowestListPrice")
    @Order(value = 0)
    public Price lowestListPrice;

    @Element(name = "HighestListPrice")
    @Order(value = 1)
    public Price highestListPrice;

    @Element(name = "LowestSalePrice")
    @Order(value = 2)
    public Price lowestSalePrice;

    @Element(name = "HighestSalePrice")
    @Order(value = 3)
    public Price highestSalePrice;


}