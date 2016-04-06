// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;

/**
 * Find reviews and guides response type.
 */
@RootElement(name = "FindReviewsAndGuidesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindReviewsAndGuidesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ReviewCount")
    @Order(value = 0)
    public Integer reviewCount;

    @Element(name = "BuyingGuideCount")
    @Order(value = 1)
    public Integer buyingGuideCount;

    @Element(name = "ReviewerRank")
    @Order(value = 2)
    public Integer reviewerRank;

    @Element(name = "TotalHelpfulnessVotes")
    @Order(value = 3)
    public Integer totalHelpfulnessVotes;

    @Element(name = "ProductID")
    @Order(value = 4)
    public ProductIDType productID;

    @Element(name = "ReviewsAndGuidesURL")
    @Order(value = 5)
    public String reviewsAndGuidesURL;

    @Element(name = "PageNumber")
    @Order(value = 6)
    public Integer pageNumber;

    @Element(name = "TotalPages")
    @Order(value = 7)
    public Integer totalPages;

    @Element(name = "BuyingGuideDetails")
    @Order(value = 8)
    public BuyingGuideDetailsType buyingGuideDetails;

    @Element(name = "ReviewDetails")
    @Order(value = 9)
    public ReviewDetailsType reviewDetails;

    @Element(name = "PositiveHelpfulnessVotes")
    @Order(value = 10)
    public Integer positiveHelpfulnessVotes;


}