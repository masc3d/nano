// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.shopping.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Base type definition of a response payload that can carry any
 * type of payload content with following optional elements:<br>
 * - timestamp of response message<br>
 * - application-level acknowledgement<br>
 * - application-level (business-level) errors and warnings
 */
public abstract class AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Timestamp")
    @Order(value = 0)
    public Date timestamp;

    @Element(name = "Ack")
    @Order(value = 1)
    public AckCodeType ack;

    @Element(name = "Errors")
    @Order(value = 2)
    public List<ErrorType> errors;

    @Element(name = "Build")
    @Order(value = 3)
    public String build;

    @Element(name = "Version")
    @Order(value = 4)
    public String version;

    @Element(name = "CorrelationID")
    @Order(value = 5)
    public String correlationID;

    @AnyElement
    @Order(value = 6)
    public List<Object> any;


}