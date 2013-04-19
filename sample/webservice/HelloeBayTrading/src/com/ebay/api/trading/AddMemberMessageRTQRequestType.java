// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Enables a seller to reply to a question about an active item listing.
 * 
 */
@RootElement(name = "AddMemberMessageRTQRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddMemberMessageRTQRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "MemberMessage")
	@Order(value=1)
	public MemberMessageType memberMessage;	
	
    
}