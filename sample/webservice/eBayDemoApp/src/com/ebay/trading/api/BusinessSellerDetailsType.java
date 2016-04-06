// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.List;

/**
 * Displays the seller's information (in a business card format)
 * as part of the data returned in the GetItem call if the seller's SellerBusinessCodeType is set to 'Commercial'. Note that this
 * option is only available for sites that have Business Seller
 * options enabled.
 */
public class BusinessSellerDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Address")
    @Order(value = 0)
    public AddressType address;

    @Element(name = "Fax")
    @Order(value = 1)
    public String fax;

    @Element(name = "Email")
    @Order(value = 2)
    public String email;

    @Element(name = "AdditionalContactInformation")
    @Order(value = 3)
    public String additionalContactInformation;

    @Element(name = "TradeRegistrationNumber")
    @Order(value = 4)
    public String tradeRegistrationNumber;

    @Element(name = "LegalInvoice")
    @Order(value = 5)
    public Boolean legalInvoice;

    @Element(name = "TermsAndConditions")
    @Order(value = 6)
    public String termsAndConditions;

    @Element(name = "VATDetails")
    @Order(value = 7)
    public VATDetailsType vatDetails;

    @AnyElement
    @Order(value = 8)
    public List<Object> any;


}