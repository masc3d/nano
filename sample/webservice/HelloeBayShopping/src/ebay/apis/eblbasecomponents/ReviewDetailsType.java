// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import java.util.List;

/**
 * Contains product reviews written by eBay members.
 */
public class ReviewDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "AverageRating")
    @Order(value = 0)
    public Float averageRating;

    @Element(name = "Review")
    @Order(value = 1)
    public List<ReviewType> review;

    @AnyElement
    @Order(value = 2)
    public List<Object> any;


}