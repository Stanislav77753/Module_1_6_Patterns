package com.stanislav.patterns.creational.abstractfactory.model;

import java.util.List;

public interface OrderFactory {
    List<Product> createOrder(List<String> products);
}
