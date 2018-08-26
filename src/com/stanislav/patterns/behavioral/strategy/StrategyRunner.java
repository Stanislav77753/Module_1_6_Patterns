package com.stanislav.patterns.behavioral.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        Gamer gamer = new Gamer();

        gamer.setChessStrategy(new FirstStrategy());
        gamer.executeStrategy();
        gamer.setChessStrategy(new SecondStrategy());
        gamer.executeStrategy();
    }
}
