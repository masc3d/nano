package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;

import java.util.TimeZone;

public class TimeZoneTransformTest extends NanoBaseUnitTest {
    public void testTimeZone() throws Exception {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        TimeZoneTransform format = new TimeZoneTransform();
        String value = format.write(zone);
        TimeZone copy = format.read(value);

        assertEquals(zone, copy);
    }
}
