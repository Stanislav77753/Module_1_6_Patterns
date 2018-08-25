package com.stanislav.patterns.behavioral.interpreter;

public class MultiplicationExpression implements Expression {
    private Expression left;
    private Expression right;

    public MultiplicationExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() * right.interpret();
    }
}
