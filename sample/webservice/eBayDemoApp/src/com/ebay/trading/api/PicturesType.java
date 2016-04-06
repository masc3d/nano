// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Defines variation-specific pictures associated with one
 * VariationSpecificName (e.g., Color) whose values differ across variations.
 */
public class PicturesType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "VariationSpecificName")
    @Order(value = 0)
    public String variationSpecificName;

    @Element(name = "VariationSpecificPictureSet")
    @Order(value = 1)
    public List<VariationSpecificPictureSetType> variationSpecificPictureSet;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}