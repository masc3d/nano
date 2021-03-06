// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;

/**
 * Retrieves Theme and Layout specifications for the display of an item's description.
 */
@RootElement(name = "GetDescriptionTemplatesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetDescriptionTemplatesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "CategoryID")
    @Order(value = 0)
    public String categoryID;

    @Element(name = "LastModifiedTime")
    @Order(value = 1)
    public Date lastModifiedTime;

    @Element(name = "MotorVehicles")
    @Order(value = 2)
    public Boolean motorVehicles;


}