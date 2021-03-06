// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Shipping costs and options related to an international shipping service. When used
 * as input, if one is provided, at least one domestic ShippingService must be
 * provided. This type does not exist before compatibility level 383.
 */
public class InternationalShippingServiceOptionType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ShippingInsuranceCost")
    @Order(value = 0)
    public AmountType shippingInsuranceCost;

    @Element(name = "ShippingServiceName")
    @Order(value = 1)
    public String shippingServiceName;

    @Element(name = "ShippingServiceAdditionalCost")
    @Order(value = 2)
    public AmountType shippingServiceAdditionalCost;

    @Element(name = "ShippingServiceCost")
    @Order(value = 3)
    public AmountType shippingServiceCost;

    @Element(name = "ShippingServicePriority")
    @Order(value = 4)
    public Integer shippingServicePriority;

    @Element(name = "ShipsTo")
    @Order(value = 5)
    public List<String> shipsTo;

    @Element(name = "EstimatedDeliveryMinTime")
    @Order(value = 6)
    public Date estimatedDeliveryMinTime;

    @Element(name = "EstimatedDeliveryMaxTime")
    @Order(value = 7)
    public Date estimatedDeliveryMaxTime;

    @Element(name = "ImportCharge")
    @Order(value = 8)
    public AmountType importCharge;

    @AnyElement
    @Order(value = 9)
    public List<Object> any;


}