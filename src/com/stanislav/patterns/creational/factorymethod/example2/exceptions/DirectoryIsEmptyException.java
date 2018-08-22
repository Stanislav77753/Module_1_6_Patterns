package com.stanislav.patterns.creational.factorymethod.example2.exceptions;

public class DirectoryIsEmptyException extends Exception {
    public DirectoryIsEmptyException(String message) {
        super(message);
    }
}
