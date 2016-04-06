// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

@RootElement(name = "GetMemberMessagesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetMemberMessagesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "MemberMessage")
    @Order(value = 0)
    public MemberMessageExchangeArrayType memberMessage;

    @Element(name = "PaginationResult")
    @Order(value = 1)
    public PaginationResultType paginationResult;

    @Element(name = "HasMoreItems")
    @Order(value = 2)
    public Boolean hasMoreItems;


}