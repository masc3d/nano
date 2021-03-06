// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Type defining the <b>UserAgreementInfo</b> container, which consists of details related to the
 * current status of a DE or AT seller signing the required supplemental user agreement for the new eBay
 * payment process.
 */
public class UserAgreementInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "Site")
    @Order(value = 0)
    public SiteCodeType site;

    @Element(name = "SellereBayPaymentProcessStatus")
    @Order(value = 1)
    public SellereBayPaymentProcessStatusCodeType sellereBayPaymentProcessStatus;

    @Element(name = "AcceptedTime")
    @Order(value = 2)
    public Date acceptedTime;

    @Element(name = "SellereBayPaymentProcessEnableTime")
    @Order(value = 3)
    public Date sellereBayPaymentProcessEnableTime;

    @Element(name = "UserAgreementURL")
    @Order(value = 4)
    public String userAgreementURL;

    @AnyElement
    @Order(value = 5)
    public List<Object> any;


}