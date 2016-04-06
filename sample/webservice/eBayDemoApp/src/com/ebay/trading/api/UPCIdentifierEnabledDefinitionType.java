// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type defines the Universal Product Code (UPC) feature, and whether this feature
 * is enabled at the site level. An empty UPCIdentifierEnabled field is returned under
 * the FeatureDefinitions container in GetCategoryFeatures if the feature is applicable
 * to the site and if UPCIdentifierEnabled is passed in as a FeatureID (or if no
 * FeatureID is passed in, hence all features are returned).
 */
public class UPCIdentifierEnabledDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @AnyElement
    @Order(value = 0)
    public List<Object> any;


}