// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

/**
 * Indicates the order of sorting.
 */
public enum SortOrderCodeType {

    /**
     * Sorts results in ascending (low to high) order.
     */
    ASCENDING("Ascending"),


    /**
     * Sorts results in descending (high to low) order.
     */
    DESCENDING("Descending"),


    /**
     * Placeholder value. See
     * <a href="types/simpleTypes.html#token">token</a>.
     */
    CUSTOM_CODE("CustomCode");


    private final String value;

    SortOrderCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortOrderCodeType fromValue(String v) {
        if (v != null) {
            for (SortOrderCodeType c : SortOrderCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}