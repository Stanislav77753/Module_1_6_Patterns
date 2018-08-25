package com.stanislav.patterns.behavioral.chain;

public abstract class Informer {
    private int priority;
    private Informer nextInformer;

    public Informer(int priority) {
        this.priority = priority;
    }

    public void setNextInformer(Informer informer){
        this.nextInformer = informer;
    }

    public void notifyInformer(String message, int level){
        if(level > priority){
            write(message);
        }
        if(nextInformer != null){
            nextInformer.notifyInformer(message,level);
        }
    }

    public abstract void write(String message);
}
