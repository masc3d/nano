package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;

import java.math.BigDecimal;

public class BigDecimalTransformTest extends NanoBaseUnitTest {
    public void testBigDecimal() throws Exception {
        BigDecimal decimal = new BigDecimal("1.1");
        BigDecimalTransform format = new BigDecimalTransform();
        String value = format.write(decimal);
        BigDecimal copy = format.read(value);

        assertEquals(decimal, copy);
    }
}
