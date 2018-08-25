package com.stanislav.patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Context context = new Context();
        Expression expression = context.evaluate("2*2-1*2");
        System.out.println(expression.interpret());
    }
}
