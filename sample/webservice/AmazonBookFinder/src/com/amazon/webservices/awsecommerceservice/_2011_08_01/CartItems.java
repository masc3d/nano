// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import java.util.List;

@RootElement(name = "CartItems", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class CartItems implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "SubTotal")
    @Order(value = 0)
    public Price subTotal;

    @Element(name = "CartItem")
    @Order(value = 1)
    public List<CartItem> cartItem;


}