package com.stanislav.patterns.behavioral.chain;

public class TvInformer extends Informer {
    public TvInformer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println(message + "We recommend not to leave the house");
    }
}
