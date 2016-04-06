// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Type defining the call-specific response fields for the <b>GetSellingManagerAlerts</b>
 * call.
 */
@RootElement(name = "GetSellingManagerAlertsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerAlertsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Alert")
    @Order(value = 0)
    public List<SellingManagerAlertType> alert;


}