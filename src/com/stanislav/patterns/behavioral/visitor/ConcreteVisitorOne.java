package com.stanislav.patterns.behavioral.visitor;

public class ConcreteVisitorOne implements Visitor {
    @Override
    public void doSmth(ConcreteElementOne concreteElementOne) {
        System.out.println("concrete visitor one");
    }

    @Override
    public void doSmth(ConcreteElementTwo concreteElementTwo) {
        System.out.println("concrete visitor one");
    }
}
