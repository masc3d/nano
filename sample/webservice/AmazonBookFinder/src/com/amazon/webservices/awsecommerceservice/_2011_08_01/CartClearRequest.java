// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import java.util.List;

public class CartClearRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CartId")
    @Order(value = 0)
    public String cartId;

    @Element(name = "HMAC")
    @Order(value = 1)
    public String hmac;

    @Element(name = "MergeCart")
    @Order(value = 2)
    public String mergeCart;

    @Element(name = "ResponseGroup")
    @Order(value = 3)
    public List<String> responseGroup;


}