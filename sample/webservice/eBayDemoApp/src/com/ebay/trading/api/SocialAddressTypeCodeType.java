// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Enumerated type that defines the social networking sites that are supported by eBay Giving
 * Works.
 */
public enum SocialAddressTypeCodeType {

    /**
     * This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * is associated with the nonprofit company's Facebook account.
     */
    FACEBOOK("Facebook"),


    /**
     * This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * is associated with the nonprofit company's Twitter account.
     */
    TWITTER("Twitter"),


    /**
     * This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * is associated with the nonprofit company's LinkedIn account.
     */
    LINKEDIN("Linkedin"),


    /**
     * This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * is associated with the nonprofit company's Google+ account.
     */
    GOOGLE_PLUS("GooglePlus"),


    /**
     * This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * is associated with the nonprofit company's MySpace account.
     */
    MYSPACE("Myspace"),


    /**
     * This value indicates that the <b>Charity.NonProfitSocialAddress.SocialAddressId</b>
     * is associated with the nonprofit company's Orkut account.
     */
    ORKUT("Orkut"),


    /**
     * Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SocialAddressTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SocialAddressTypeCodeType fromValue(String v) {
        if (v != null) {
            for (SocialAddressTypeCodeType c : SocialAddressTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}