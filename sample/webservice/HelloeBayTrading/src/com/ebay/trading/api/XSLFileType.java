// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * This type is deprecated because the calls that use it are deprected.
 */
public class XSLFileType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "FileName")
    @Order(value = 0)
    public String fileName;

    @Element(name = "FileVersion")
    @Order(value = 1)
    public String fileVersion;

    @Element(name = "FileContent")
    @Order(value = 2)
    public String fileContent;

    @AnyElement
    @Order(value = 3)
    public List<Object> any;


}