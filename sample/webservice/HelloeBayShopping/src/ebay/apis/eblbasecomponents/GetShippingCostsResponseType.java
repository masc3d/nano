// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;

/**
 * Response to call of GetShippingCosts.
 */
@RootElement(name = "GetShippingCostsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetShippingCostsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ShippingDetails")
    @Order(value = 0)
    public ShippingDetailsType shippingDetails;

    @Element(name = "ShippingCostSummary")
    @Order(value = 1)
    public ShippingCostSummaryType shippingCostSummary;


}