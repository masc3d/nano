// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

@RootElement(name = "RelatedItems", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class RelatedItems implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Relationship")
    @Order(value = 0)
    public String relationship;

    @Element(name = "RelationshipType")
    @Order(value = 1)
    public String relationshipType;

    @Element(name = "RelatedItemCount")
    @Order(value = 2)
    public BigInteger relatedItemCount;

    @Element(name = "RelatedItemPageCount")
    @Order(value = 3)
    public BigInteger relatedItemPageCount;

    @Element(name = "RelatedItemPage")
    @Order(value = 4)
    public BigInteger relatedItemPage;

    @Element(name = "RelatedItem")
    @Order(value = 5)
    public List<RelatedItem> relatedItem;


}