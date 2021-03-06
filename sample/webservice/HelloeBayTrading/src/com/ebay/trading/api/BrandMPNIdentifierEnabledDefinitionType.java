// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type defines the Brand/Manufacturer Part Number feature, and whether this
 * feature is enabled at the site level. An empty BrandMPNIdentifierEnabled field is
 * returned under the FeatureDefinitions container in GetCategoryFeatures if the feature
 * is applicable to the site and if BrandMPNIdentifierEnabled is passed in as a
 * FeatureID (or if no FeatureID is passed in, hence all features are returned).
 */
public class BrandMPNIdentifierEnabledDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @AnyElement
    @Order(value = 0)
    public List<Object> any;


}