package com.stanislav.patterns.behavioral.visitor;

public class ConcreteVisitorTwo implements Visitor {
    @Override
    public void doSmth(ConcreteElementOne concreteElementOne) {
        System.out.println("concrete visitor two");
    }

    @Override
    public void doSmth(ConcreteElementTwo concreteElementTwo) {
        System.out.println("concrete visitor two");
    }
}
