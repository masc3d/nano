package com.leansoft.nano.sample;

import com.leansoft.nano.annotation.Element;

import java.util.ArrayList;
import java.util.List;

public class Books {

    @Element(name = "book")
    private List<Book> books = new ArrayList<Book>();

    public Books() {
    }

    public Books(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
