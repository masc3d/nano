// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Information that identifies a buying guide. A buying guide provides content about particular
 * product areas, categories, or subjects to help buyers decide which type of item
 * to purchase based on their particular interests.
 * Buying guides are useful to buyers who do not have a specific product in mind.
 * For example, a digital camera buying guide could help a buyer determine what kind of
 * digital camera is right for them.
 */
public class BuyingGuideType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Name")
    @Order(value = 0)
    public String name;

    @Element(name = "URL")
    @Order(value = 1)
    public String url;

    @Element(name = "CategoryID")
    @Order(value = 2)
    public String categoryID;

    @Element(name = "ProductFinderID")
    @Order(value = 3)
    public Integer productFinderID;

    @Element(name = "Title")
    @Order(value = 4)
    public String title;

    @Element(name = "Text")
    @Order(value = 5)
    public String text;

    @Element(name = "CreationTime")
    @Order(value = 6)
    public Date creationTime;

    @Element(name = "UserID")
    @Order(value = 7)
    public String userID;

    @AnyElement
    @Order(value = 8)
    public List<Object> any;


}