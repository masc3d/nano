// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type is deprecated as the call is no longer available.
 */
@RootElement(name = "GetProductFinderXSLResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetProductFinderXSLResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "XSLFile")
    @Order(value = 0)
    public List<XSLFileType> xslFile;


}