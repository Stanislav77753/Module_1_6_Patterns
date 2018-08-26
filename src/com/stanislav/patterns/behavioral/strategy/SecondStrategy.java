package com.stanislav.patterns.behavioral.strategy;

public class SecondStrategy implements ChessStrategy {
    @Override
    public void makeMove() {
        System.out.println("do a move on the second strategy");
    }
}
