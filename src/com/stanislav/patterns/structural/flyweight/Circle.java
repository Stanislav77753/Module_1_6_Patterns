package com.stanislav.patterns.structural.flyweight;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("рисуем круг");
    }
}
