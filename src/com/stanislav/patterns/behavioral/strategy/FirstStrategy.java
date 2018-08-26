package com.stanislav.patterns.behavioral.strategy;

public class FirstStrategy implements ChessStrategy {
    @Override
    public void makeMove() {
        System.out.println("do a move on the first strategy");
    }
}
