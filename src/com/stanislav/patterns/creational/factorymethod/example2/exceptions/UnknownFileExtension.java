package com.stanislav.patterns.creational.factorymethod.example2.exceptions;

public class UnknownFileExtension extends Exception {

    public UnknownFileExtension(String message) {
        super(message);
    }
}
