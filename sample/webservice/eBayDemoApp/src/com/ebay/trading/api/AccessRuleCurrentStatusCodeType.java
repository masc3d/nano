// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * Describes the current status of your application with regard to
 * rules governing the number of times your application can
 * execute API calls.
 */
public enum AccessRuleCurrentStatusCodeType {

    /**
     * (out) The rule is not set and usage limits do not apply.
     */
    NOT_SET("NotSet"),


    /**
     * (out) Your application has exceeded its hourly hard limit.
     */
    HOURLY_LIMIT_EXCEEDED("HourlyLimitExceeded"),


    /**
     * (out) Your application has exceeded its daily hard limit.
     */
    DAILY_LIMIT_EXCEEDED("DailyLimitExceeded"),


    /**
     * (out) Your application has exceeded its periodic hard limit.
     */
    PERIODIC_LIMIT_EXCEEDED("PeriodicLimitExceeded"),


    /**
     * (out) Your application has exceeded its hourly soft limit.
     */
    HOURLY_SOFT_LIMIT_EXCEEDED("HourlySoftLimitExceeded"),


    /**
     * (out) Your application has exceeded its daily soft limit.
     */
    DAILY_SOFT_LIMIT_EXCEEDED("DailySoftLimitExceeded"),


    /**
     * (out) Your application has exceeded its periodic soft limit.
     */
    PERIODIC_SOFT_LIMIT_EXCEEDED("PeriodicSoftLimitExceeded"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    AccessRuleCurrentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccessRuleCurrentStatusCodeType fromValue(String v) {
        if (v != null) {
            for (AccessRuleCurrentStatusCodeType c : AccessRuleCurrentStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}