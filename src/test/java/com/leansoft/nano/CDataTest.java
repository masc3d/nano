package com.leansoft.nano;

import com.leansoft.nano.annotation.Element;


public class CDataTest extends NanoBaseUnitTest {

    private static class Book {
        @Element
        private String title;
        @Element(data = true)
        private String description;
    }

    public void testCData() throws Exception {
        Book book = new Book();
        book.title = "a test book";
        book.description = "a test description";

        IWriter xmlWriter = NanoFactory.getXMLWriter();
        String bookStr = xmlWriter.write(book);
        System.out.println(bookStr);

        IReader xmlReader = NanoFactory.getXMLReader();
        Book copy = xmlReader.read(Book.class, bookStr);

        assertEquals(copy.title, book.title);
        assertEquals(copy.description.trim(), book.description);
    }

}
