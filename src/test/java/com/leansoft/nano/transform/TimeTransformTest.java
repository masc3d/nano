package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;

import java.sql.Time;

public class TimeTransformTest extends NanoBaseUnitTest {

    public void testTime() throws Exception {
        long now = System.currentTimeMillis();
        Time time = new Time(now);
        TimeTransform transform = new TimeTransform();
        String value = transform.write(time);
        Time copy = transform.read(value);

        assertEquals(time.toString(), copy.toString());
    }

}
