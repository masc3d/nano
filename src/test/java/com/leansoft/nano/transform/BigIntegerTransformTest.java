package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;

import java.math.BigInteger;

public class BigIntegerTransformTest extends NanoBaseUnitTest {
    public void testBigInteger() throws Exception {
        BigInteger integer = new BigInteger("1");
        BigIntegerTransform format = new BigIntegerTransform();
        String value = format.write(integer);
        BigInteger copy = format.read(value);

        assertEquals(integer, copy);
    }
}
