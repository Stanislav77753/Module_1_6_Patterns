package com.stanislav.patterns.behavioral.visitor;

public interface Visitor {

    public void doSmth(ConcreteElementOne concreteElementOne);
    public void doSmth(ConcreteElementTwo concreteElementTwo);
}
