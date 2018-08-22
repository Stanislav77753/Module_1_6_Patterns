package com.stanislav.patterns.creational.factorymethod.example2.model;

public class XmlHandler implements Handler {
    @Override
    public void readFromFile() {
        System.out.println("read from xml file");
    }

    @Override
    public void writeInFile() {
        System.out.println("write in xml file");
    }
}
