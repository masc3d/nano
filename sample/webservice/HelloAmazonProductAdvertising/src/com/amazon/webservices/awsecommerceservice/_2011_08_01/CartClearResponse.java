// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import java.io.Serializable;
import java.util.List;

@RootElement(name = "CartClearResponse", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class CartClearResponse implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "OperationRequest")
    @Order(value = 0)
    public OperationRequest operationRequest;

    @Element(name = "Cart")
    @Order(value = 1)
    public List<Cart> cart;


}