package com.stanislav.patterns.creational.abstractfactory.model;

public class Sweets implements Product {
    String name;
    Double price;
    Integer count;

    public Sweets(Double price, Integer count) {
        this.name = "Sweets";
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
