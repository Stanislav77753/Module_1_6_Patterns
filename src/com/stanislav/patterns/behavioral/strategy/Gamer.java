package com.stanislav.patterns.behavioral.strategy;

public class Gamer {
    ChessStrategy chessStrategy;

    public void setChessStrategy(ChessStrategy chessStrategy){
        this.chessStrategy = chessStrategy;
    }

    public void executeStrategy(){
        chessStrategy.makeMove();
    }
}
