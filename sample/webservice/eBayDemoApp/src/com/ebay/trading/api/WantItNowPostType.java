// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Contains the data describing a single Want It Now post. Buyers create Want It Now
 * posts to communicate to sellers specific requirements for items they would like to
 * buy.
 */
public class WantItNowPostType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CategoryID")
    @Order(value = 0)
    public String categoryID;

    @Element(name = "Description")
    @Order(value = 1)
    public String description;

    @Element(name = "PostID")
    @Order(value = 2)
    public String postID;

    @Element(name = "Site")
    @Order(value = 3)
    public SiteCodeType site;

    @Element(name = "StartTime")
    @Order(value = 4)
    public Date startTime;

    @Element(name = "ResponseCount")
    @Order(value = 5)
    public Integer responseCount;

    @Element(name = "Title")
    @Order(value = 6)
    public String title;


}