// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A list of one or more valid names and corresponding values. Currently
 * used for Item Specifics and Variations.
 */
public class NameValueListArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "NameValueList")
    @Order(value = 0)
    public List<NameValueListType> nameValueList;


}