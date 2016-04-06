// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * Sets the read state for messages, sets the flagged state of messages,
 * and moves messages into and out of folders.
 */
@RootElement(name = "ReviseMyMessagesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class ReviseMyMessagesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "MessageIDs")
    @Order(value = 0)
    public MyMessagesMessageIDArrayType messageIDs;

    @Element(name = "AlertIDs")
    @Order(value = 1)
    public MyMessagesAlertIDArrayType alertIDs;

    @Element(name = "Read")
    @Order(value = 2)
    public Boolean read;

    @Element(name = "Flagged")
    @Order(value = 3)
    public Boolean flagged;

    @Element(name = "FolderID")
    @Order(value = 4)
    public Long folderID;


}