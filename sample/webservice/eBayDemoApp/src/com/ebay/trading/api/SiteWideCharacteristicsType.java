// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A list of one or more characteristics sets mapped to the category,
 * if any. Use this information when working with Item Specifics (Attributes)
 * and Pre-filled Item Information (Catalogs) functionality.
 */
public class SiteWideCharacteristicsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CharacteristicsSet")
    @Order(value = 0)
    public CharacteristicsSetType characteristicsSet;

    @Element(name = "ExcludeCategoryID")
    @Order(value = 1)
    public List<String> excludeCategoryID;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}