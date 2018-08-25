package com.stanislav.patterns.structural.decorator;

public class DecoratorRunner {
    public static void main(String[] args) {
        Car modCar = new ModifiedAudi(new Audi(200));
        System.out.println("max speed - " + modCar.getMaxSpeed());
    }
}
