// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Type defining the <b>SupportedSellerProfiles</b> container for all payment,
 * return, and shipping policy profiles that a seller has defined for a site.
 * <br><br>
 * <span class="tablenote"><strong>Note:</strong>
 * Business Policies are not yet available for use on the eBay platform.
 * </span>
 */
public class SupportedSellerProfilesType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "SupportedSellerProfile")
    @Order(value = 0)
    public List<SupportedSellerProfileType> supportedSellerProfile;


}