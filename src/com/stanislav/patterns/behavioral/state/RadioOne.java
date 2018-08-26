package com.stanislav.patterns.behavioral.state;

public class RadioOne implements Station {
    @Override
    public void play() {
        System.out.println("Playing radioOne");
    }
}
