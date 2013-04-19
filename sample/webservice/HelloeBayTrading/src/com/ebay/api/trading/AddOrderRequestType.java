// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Combines two or more order line items into a single order, enabling a buyer to pay for all of those order line items with a single payment (and, if so arranged, ship all of the items together).
 * 
 */
@RootElement(name = "AddOrderRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddOrderRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Order")
	@Order(value=0)
	public OrderType order;	
	
    
}