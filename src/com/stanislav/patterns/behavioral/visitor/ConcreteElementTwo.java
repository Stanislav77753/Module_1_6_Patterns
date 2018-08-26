package com.stanislav.patterns.behavioral.visitor;

public class ConcreteElementTwo implements Element {
    @Override
    public void doSmth(Visitor visitor) {
        visitor.doSmth(this);
    }
}
