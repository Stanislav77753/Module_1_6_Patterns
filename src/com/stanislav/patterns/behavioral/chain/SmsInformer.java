package com.stanislav.patterns.behavioral.chain;

public class SmsInformer extends Informer {
    public SmsInformer(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println( message + "Be careful on the street");
    }
}
