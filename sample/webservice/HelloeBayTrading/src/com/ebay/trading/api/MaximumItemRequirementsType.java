// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Container for items bid.
 */
public class MaximumItemRequirementsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "MaximumItemCount")
    @Order(value = 0)
    public Integer maximumItemCount;

    @Element(name = "MinimumFeedbackScore")
    @Order(value = 1)
    public Integer minimumFeedbackScore;


}