package com.leansoft.nano.transform;

import java.util.Locale;

import com.leansoft.nano.NanoBaseUnitTest;
import com.leansoft.nano.transform.LocaleTransform;

public class LocaleTransformTest extends NanoBaseUnitTest {
	
	public void testLocale() throws Exception {
		Locale locale = Locale.UK;
		LocaleTransform transform = new LocaleTransform();
		String value = transform.write(locale);
		Locale copy = transform.read(value);
		
		assertEquals(locale, copy);

		locale = Locale.CHINA;
		value = transform.write(locale);
		copy = transform.read(value);
		
		assertEquals(locale, copy);
	}
}
