package com.stanislav.patterns.structural.decorator;

public class ModifiedAudi extends CarDecorator {

    public ModifiedAudi(Car car) {
        super(car);
    }

    @Override
    public int getMaxSpeed() {
        return (int)(car.getMaxSpeed()*1.5);
    }
}
