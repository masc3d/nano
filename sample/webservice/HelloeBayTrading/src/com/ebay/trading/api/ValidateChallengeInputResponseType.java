// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Validate the user response to botblock challenge.
 */
@RootElement(name = "ValidateChallengeInputResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ValidateChallengeInputResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ValidToken")
    @Order(value = 0)
    public Boolean validToken;


}