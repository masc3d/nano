// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import com.amazon.webservices.awsecommerceservice._2011_08_01.promotion.Summary;

import java.io.Serializable;

@RootElement(name = "Promotion", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class Promotion implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Summary")
    @Order(value = 0)
    public Summary summary;


}