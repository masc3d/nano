package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;
import com.leansoft.nano.custom.types.Duration;

public class DurationTransformTest extends NanoBaseUnitTest {

    public void testDuration() throws Exception {

        String[] durationStrings = {"P3Y6M4DT12H30M5S", "PT1M33S", "PT1004199059S", "PT130S", "PT2M10S", "P1DT2S", "-P1Y", "P1Y2M3DT5H20M30.12S"};

        DurationTransform durationTransform = new DurationTransform();

        for (String durationsString : durationStrings) {
            Duration duration = durationTransform.read(durationsString);
            String durationStringCopy = durationTransform.write(duration);
            assertEquals(durationsString, durationStringCopy);
            Duration durationCopy = durationTransform.read(durationStringCopy);
            assertEquals(durationCopy, duration);
        }
    }

}
