// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type is deprecated as Pictures Manager was retired.
 */
public class PictureManagerPictureDisplayType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "DisplayType")
    @Order(value = 0)
    public PictureManagerPictureDisplayTypeCodeType displayType;

    @Element(name = "URL")
    @Order(value = 1)
    public String url;

    @Element(name = "Size")
    @Order(value = 2)
    public Integer size;

    @Element(name = "Height")
    @Order(value = 3)
    public Integer height;

    @Element(name = "Width")
    @Order(value = 4)
    public Integer width;

    @AnyElement
    @Order(value = 5)
    public List<Object> any;


}