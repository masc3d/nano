// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.amazon.webservices.awsecommerceservice._2011_08_01;

import com.amazon.webservices.awsecommerceservice._2011_08_01.accessories.Accessory;

import java.io.Serializable;
import java.util.List;

@RootElement(name = "Accessories", namespace = "http://webservices.amazon.com/AWSECommerceService/2011-08-01")
public class Accessories implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Accessory")
    @Order(value = 0)
    public List<Accessory> accessory;


}