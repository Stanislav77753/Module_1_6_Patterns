package com.stanislav.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsApplication implements Observed {
    List<String> newsList = new ArrayList<>();

    List<Observer> observers = new ArrayList<>();

    public void addNews(String news){
        this.newsList.add(news);
        notifyObservers();
    }

    public void removeNews(String news){
        this.newsList.remove(news);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.handleEvent(this.newsList);
        }
    }
}
