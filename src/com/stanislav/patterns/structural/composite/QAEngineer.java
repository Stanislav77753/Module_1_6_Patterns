package com.stanislav.patterns.structural.composite;

public class QAEngineer implements Staff {
    @Override
    public void doWork() {
        System.out.println("QA engineer tests the application");
    }
}
