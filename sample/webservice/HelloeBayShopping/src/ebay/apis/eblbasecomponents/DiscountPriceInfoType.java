// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import java.util.List;

/**
 * Contains the discount pricing details for an item, including the original
 * retail price and the display treatment to be used for the item. The pricing
 * treatment displayed for a discounted item depends on the values specified
 * in this container when the item is listed. Discount pricing treatments
 * (Strikethrough Pricing and Minimum Advertised Price) apply to only fixed
 * price, BIN items. Sellers can apply Discount Pricing to both MSKU and
 * Non-MSKU items.
 */
public class DiscountPriceInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "OriginalRetailPrice")
    @Order(value = 0)
    public AmountType originalRetailPrice;

    @Element(name = "MinimumAdvertisedPrice")
    @Order(value = 1)
    public AmountType minimumAdvertisedPrice;

    @Element(name = "MinimumAdvertisedPriceExposure")
    @Order(value = 2)
    public MinimumAdvertisedPriceExposureCodeType minimumAdvertisedPriceExposure;

    @Element(name = "PricingTreatment")
    @Order(value = 3)
    public PricingTreatmentCodeType pricingTreatment;

    @Element(name = "SoldOneBay")
    @Order(value = 4)
    public Boolean soldOneBay;

    @Element(name = "SoldOffeBay")
    @Order(value = 5)
    public Boolean soldOffeBay;

    @AnyElement
    @Order(value = 6)
    public List<Object> any;


}