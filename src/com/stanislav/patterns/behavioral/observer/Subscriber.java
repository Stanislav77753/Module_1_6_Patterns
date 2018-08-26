package com.stanislav.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> news) {
        System.out.println("Dear," + name + ". We have news to you:" + news);
    }
}
