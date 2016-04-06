// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Variations are multiple similar (but not identical) items in a
 * single fixed-price (or Store Inventory Format) listing.
 * For example, a single listing could contain multiple items of the
 * same brand and model that vary by color and size (like "Blue, Large" and "Black, Medium"). Each variation can have its own quantity and
 * price. For example, a listing could include 10 "Blue, Large"
 * variations and 20 "Black, Medium" variations.
 */
public class VariationsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Variation")
    @Order(value = 0)
    public List<VariationType> variation;

    @Element(name = "Pictures")
    @Order(value = 1)
    public List<PicturesType> pictures;

    @Element(name = "VariationSpecificsSet")
    @Order(value = 2)
    public NameValueListArrayType variationSpecificsSet;

    @Element(name = "ModifyNameList")
    @Order(value = 3)
    public ModifyNameArrayType modifyNameList;

    @AnyElement
    @Order(value = 4)
    public List<Object> any;


}