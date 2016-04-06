// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;

/**
 * An eBay-defined complex type for specifying monetary amounts.
 * <br><br>
 * A double value (e.g., 1.00 or 1.0) is meaningful as a monetary amount when accompanied by a specification of the currency, in which case the value specifies the amount in that currency. An AmountType expresses both the value (a double) and the currency.
 * <br><br>
 * The AmountType data type is typically used to specify details such as prices, fees, costs, and payments. In some cases, a whole number (i.e., without a period) can be passed or returned as a monetary value. This is necessary to support certain currencies that are only expressed as whole numbers (like the Italian Lira and Spanish Peseta).
 * <br><br>
 * Because a double is used to represent the amount, this also means whole monetary amounts may be returned with only one 0 after the decimal. For example, a dollar value could be returned as 1.0 instead of 1.00 in calls like AddItem. For fields of type AmountType, see the individual topics for specific restrictions beyond this.
 */
public class AmountType implements Serializable {

    private static final long serialVersionUID = -1L;

    @Value
    @Order(value = 0)
    public double value;

    @Attribute
    @Order(value = 1)
    public CurrencyCodeType currencyID;


}