package com.stanislav.patterns.creational.factorymethod.example2.model;

public class JsonHandler implements Handler {
    @Override
    public void readFromFile() {
        System.out.println("read from json file");
    }

    @Override
    public void writeInFile() {
        System.out.println("write in json file");
    }
}
