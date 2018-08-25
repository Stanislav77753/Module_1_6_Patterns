package com.stanislav.patterns.structural.decorator;

public abstract class CarDecorator implements Car {
    final Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
}
