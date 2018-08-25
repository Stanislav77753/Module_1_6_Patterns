package com.stanislav.patterns.behavioral.interpreter;

public class NumberExpression implements Expression {
    double number;

    public NumberExpression(double number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return number;
    }
}
