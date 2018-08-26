package com.stanislav.patterns.behavioral.visitor;

public class VisitorRunner {
    public static void main(String[] args) {
        ConcreteElementOne concreteElementOne = new ConcreteElementOne();
        ConcreteElementTwo concreteElementTwo = new ConcreteElementTwo();
        ConcreteVisitorOne concreteVisitorOne = new ConcreteVisitorOne();
        ConcreteVisitorTwo concreteVisitorTwo = new ConcreteVisitorTwo();

        concreteElementOne.doSmth(concreteVisitorOne);
        concreteElementTwo.doSmth(concreteVisitorOne);
        concreteElementOne.doSmth(concreteVisitorTwo);
        concreteElementTwo.doSmth(concreteVisitorTwo);
    }
}
