package com.stanislav.patterns.creational.abstractfactory.model;

public class Milk implements Product {
    String name;
    Double price;
    Integer count;

    public Milk(Double price, Integer count) {
        this.name = "milk";
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

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public Integer getCount() {
        return count;
    }
}
