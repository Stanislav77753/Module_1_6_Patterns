package com.stanislav.patterns.structural.decorator;

public class Audi implements Car {
    private int maximumSpeed;

    public Audi(int maxSpeed) {
        this.maximumSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maximumSpeed;
    }
}
