// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * A generic type used for histograms.
 */
public class CharacteristicsSetProductHistogramType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "HistogramEntry")
    @Order(value = 0)
    public List<HistogramEntryType> histogramEntry;

    @AnyElement
    @Order(value = 1)
    public List<Object> any;


}