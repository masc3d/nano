// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.leansoft.nano.soap12;

import com.leansoft.nano.annotation.AnyElement;
import com.leansoft.nano.annotation.Order;
import com.leansoft.nano.annotation.RootElement;

import java.io.Serializable;
import java.util.List;

/**
 * Elements replacing the wildcard MUST be namespace qualified, but can be in the targetNamespace
 */
@RootElement(name = "Header", namespace = "http://www.w3.org/2003/05/soap-envelope")
public class Header implements Serializable {

    private static final long serialVersionUID = -1L;

    @AnyElement
    @Order(value = 0)
    public List<Object> any;


}