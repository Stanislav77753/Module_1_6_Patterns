package com.stanislav.patterns.behavioral.interpreter;

public class Context {
    public Expression evaluate(String s){
        int pos = s.length() - 1;
        while (pos > 0){
            if(Character.isDigit(s.charAt(pos))){
                pos--;
            }else{
                Expression left = evaluate(s.substring(0,pos));
                Expression right = new NumberExpression(Double.valueOf(s.substring(pos + 1, s .length())));
                char operation = s.charAt(pos);
                switch (operation){
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left,right);
                    case '*':
                        return new MultiplicationExpression(left,right);
                    case '/':
                        return new DivideExpression(left, right);
                }
            }
        }
        double result = Double.valueOf(s);
        return new NumberExpression(result);
    }
}
