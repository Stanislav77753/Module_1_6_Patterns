package com.stanislav.patterns.behavioral.iterator;

public class Book implements Collection {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public Iterator getIterator() {
        return null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
