package com.stanislav.patterns.creational.factorymethod.example1;

public class Builder implements Employee {
    @Override
    public void doSmth() {
        System.out.println("builder builds buildings");
    }
}
