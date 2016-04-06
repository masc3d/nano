// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

public enum ErrorClassificationCodeType {

    /**
     * An error has occurred either as a result of a problem in the sending
     * application or because the application's end-user has attempted to submit
     * invalid data (or missing data). In these cases, do not retry the request. The
     * problem must be corrected before the request can be made again. If the problem
     * is due to something in the application (such as a missing required field), the
     * application must be changed. If the problem is a result of end-user data, the
     * application must alert the end-user to the problem and provide the means for
     * the end-user to correct the data. Once the problem in the application or data
     * is resolved, resend the request to eBay with the corrected data.
     */
    REQUEST_ERROR("RequestError"),


    /**
     * Indicates that an error has occurred on the eBay system side, such as a
     * database or server down. An application can retry the request as-is a
     * reasonable number of times (eBay recommends twice). If the error persists,
     * contact Developer Technical Support. Once the problem has been resolved, the
     * request may be resent in its original form.
     */
    SYSTEM_ERROR("SystemError"),


    /**
     * (out) Reserved for internal or future use.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    ErrorClassificationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorClassificationCodeType fromValue(String v) {
        if (v != null) {
            for (ErrorClassificationCodeType c : ErrorClassificationCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}