package com.stanislav.patterns.structural.flyweight;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("рисуем квадрат");
    }
}
