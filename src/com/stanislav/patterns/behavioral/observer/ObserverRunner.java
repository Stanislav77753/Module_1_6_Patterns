package com.stanislav.patterns.behavioral.observer;

public class ObserverRunner {
    public static void main(String[] args) {
        NewsApplication newsApplication = new NewsApplication();

        newsApplication.addNews("first news");
        newsApplication.addNews("second news");

        Observer subscriber1 = new Subscriber("Sub1");
        Observer subscriber2 = new Subscriber("Sub2");
        Observer subscriber3 = new Subscriber("Sub3");

        newsApplication.addObserver(subscriber1);
        newsApplication.addObserver(subscriber2);
        newsApplication.addObserver(subscriber3);
        newsApplication.notifyObservers();

        newsApplication.addNews("third news");
    }
}
