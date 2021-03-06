// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * The PaymentOptionsGroupEnabled field is returned in the GetCategoryFeature response if the Payment Options Group feature
 * applies to the category. The field is returned as an empty element. The Payment Options Group feature is only applicable to
 * DE and AT listings.
 */
public class PaymentOptionsGroupEnabledDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @AnyElement
    @Order(value = 0)
    public List<Object> any;


}