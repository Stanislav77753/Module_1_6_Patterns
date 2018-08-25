package com.stanislav.patterns.structural.facade;

public class JavaDeveloper implements Staff {

    @Override
    public void doWork() {
        System.out.println("Java developer writes backend code");
    }
}
