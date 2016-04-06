package com.leansoft.nano.transform;

import com.leansoft.nano.NanoBaseUnitTest;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTransformTest extends NanoBaseUnitTest {

    public void testCalendar() throws Exception {
        Calendar calendar = new GregorianCalendar();
        CalendarTransform transform = new CalendarTransform();

        calendar.setTime(new Date());

        String value = transform.write(calendar);
        Calendar copy = transform.read(value);

        assertEquals(calendar, copy);
    }

}
