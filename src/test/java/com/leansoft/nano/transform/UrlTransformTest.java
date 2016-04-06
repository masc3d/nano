package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;

import java.net.URL;

public class UrlTransformTest extends NanoBaseUnitTest {
    public void testURL() throws Exception {
        URL file = new URL("http://www.google.com/");
        UrlTransform format = new UrlTransform();
        String value = format.write(file);
        URL copy = format.read(value);

        assertEquals(file, copy);
    }
}
