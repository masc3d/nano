// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * SeverityCodeType - Type declaration to be used by other schema. This code
 * identifies the severity of an API error. A code indicates whether there is an API-
 * level error or warning that needs to be communicated to the client.
 */
public enum SeverityCodeType {

    /**
     * (out) The request was processed successfully, but something occurred
     * that may affect your application or the user. For example, eBay may have
     * changed a value the user sent in. In this case, eBay returns a normal,
     * successful response and also returns the warning.
     */
    WARNING("Warning"),


    /**
     * (out) The request that triggered the error was not processed
     * successfully. When a serious application-level error occurs, the error
     * is returned instead of the business data.
     */
    ERROR("Error"),


    /**
     * (out) Reserved for internal or future use
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SeverityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeverityCodeType fromValue(String v) {
        if (v != null) {
            for (SeverityCodeType c : SeverityCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}