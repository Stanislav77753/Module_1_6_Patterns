package com.stanislav.patterns.creational.factorymethod.example1;

public class Architect implements Employee {
    @Override
    public void doSmth() {
        System.out.println("Architect designs buildings");
    }
}
