// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import java.util.List;

/**
 * At least one container is required (minOccurs="1") if Pictures container is present in the request.
 */
public class VariationSpecificPictureSetType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "VariationSpecificValue")
    @Order(value = 0)
    public String variationSpecificValue;

    @Element(name = "PictureURL")
    @Order(value = 1)
    public List<String> pictureURL;

    @Element(name = "GalleryURL")
    @Order(value = 2)
    public String galleryURL;

    @AnyElement
    @Order(value = 3)
    public List<Object> any;


}