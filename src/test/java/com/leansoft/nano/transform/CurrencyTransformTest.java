package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;

import java.util.Currency;
import java.util.Locale;

public class CurrencyTransformTest extends NanoBaseUnitTest {
    public void testCurrency() throws Exception {
        Currency currency = Currency.getInstance(Locale.UK);
        CurrencyTransform format = new CurrencyTransform();
        String value = format.write(currency);
        Currency copy = format.read(value);

        assertEquals(currency, copy);
    }
}
