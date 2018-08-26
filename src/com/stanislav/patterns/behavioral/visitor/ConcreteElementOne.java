package com.stanislav.patterns.behavioral.visitor;

public class ConcreteElementOne implements Element {
    @Override
    public void doSmth(Visitor visitor) {
        visitor.doSmth(this);
    }
}
