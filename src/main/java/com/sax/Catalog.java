package com.sax;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<Book> books;

    public Catalog() {
        books = new ArrayList<>();
    }

    public void push(Book b) {
        books.add(b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book b : books) {
            sb.append(b.toString());
        }
        return sb.toString();
    }
}