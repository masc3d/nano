package com.leansoft.nano;

import com.leansoft.nano.annotation.Attribute;
import com.leansoft.nano.annotation.Element;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class EncodingTest extends NanoBaseUnitTest {

    private static class Animal {
        @Element
        private String name;
        @Attribute
        private int age;
    }

    public void testEncodingXML() throws Exception {
        Format format = new Format(false, "iso-8859-1");
        IWriter xmlWriter = NanoFactory.getXMLWriter(format);
        IReader xmlReader = NanoFactory.getXMLReader(format);

        validate(xmlWriter, xmlReader);
    }

    private void validate(IWriter writer, IReader reader) throws Exception {
        Animal animal = new Animal();
        animal.name = "bulldog";
        animal.age = 10;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        writer.write(animal, baos);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        Animal copy = reader.read(Animal.class, bais);

        assertEquals("bulldog", copy.name);
        assertEquals(10, copy.age);
    }

    public void testEncodingJSON() throws Exception {

        Format format = new Format(false, "utf-16");
        IWriter jsonWriter = NanoFactory.getJSONWriter(format);
        IReader jsonReader = NanoFactory.getJSONReader(format);

        validate(jsonWriter, jsonReader);
    }
}
