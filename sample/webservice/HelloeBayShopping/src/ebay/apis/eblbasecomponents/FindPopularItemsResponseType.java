// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;

/**
 * Popular items, detail level is default for simple item type. addition with WatchCount.
 */
@RootElement(name = "FindPopularItemsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindPopularItemsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Element(name = "ItemArray")
    @Order(value = 0)
    public SimpleItemArrayType itemArray;


}