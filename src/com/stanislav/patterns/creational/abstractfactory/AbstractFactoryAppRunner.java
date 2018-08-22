package com.stanislav.patterns.creational.abstractfactory;

public class AbstractFactoryAppRunner {
    public static void main(String[] args) {
        OrderHandler orderHandler = new OrderHandler();
        orderHandler.start();
    }
}
