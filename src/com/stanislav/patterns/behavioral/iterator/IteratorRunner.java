package com.stanislav.patterns.behavioral.iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        Book[] books = {new Book("book1"), new Book("book2"), new Book("book3")};
        Library library = new Library("Library of the Russian Academy of Sciences", books);
        Iterator iterator = library.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
