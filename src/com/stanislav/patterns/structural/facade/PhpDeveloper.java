package com.stanislav.patterns.structural.facade;

public class PhpDeveloper implements Staff {
    @Override
    public void doWork() {
        System.out.println("Php developer writes frontend code");
    }
}
