package com.stanislav.patterns.creational.abstractfactory.model;

public class Coffee implements Product {
    String name;
    Double price;
    Integer count;

    public Coffee(Double price, Integer count) {
        this.name = "Coffee";
        this.price = price;
        this.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public Integer getCount() {
        return count;
    }
}
