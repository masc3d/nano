// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;

/**
 * Checks specified keywords for spelling errors and returns corrected keywords
 * that will provide better search results. If you make a keyword query search
 * that returns no results, use this call to check the keywords for
 * misspellings. The call checks the words in context of the entire query. For
 * example, if you submit "arry potter" in the request, the response will
 * recommend "harry potter." However, if you submit "potter arry" in the
 * request, the response will recommend "potter army." <br><br>
 * The response will not return recommended keywords in the following
 * conditions:
 * <ul>
 * <li>
 * Keywords value returns results (even a single item) in either
 * findItemsByKeywords or findItemsAdvanced.
 * </li>
 * <li>
 * Keywords value contains no misspelled words
 * (even if the keywords query returns no items).
 * </li>
 * </ul>
 */
@RootElement(name = "getSearchKeywordsRecommendationRequest", namespace = "http://www.ebay.com/marketplace/search/v1/services")
public class GetSearchKeywordsRecommendationRequest extends BaseServiceRequest implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element
    @Order(value = 0)
    public String keywords;


}