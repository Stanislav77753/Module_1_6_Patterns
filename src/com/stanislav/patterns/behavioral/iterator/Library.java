package com.stanislav.patterns.behavioral.iterator;

public class Library implements Collection {
    private String nameLibrary;
    private Book[] books;

    public Library(String nameLibrary, Book[] books) {
        this.nameLibrary = nameLibrary;
        this.books = books;
    }

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public Iterator getIterator() {
        return new BookIterator();
    }
    private class BookIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index < books.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return books[index++];
        }
    }
}

