package com.stanislav.patterns.creational.factorymethod.example2.model;

public class JsonHandlerFactory implements HandlerFactory {
    @Override
    public Handler createHandler() {
        return new JsonHandler();
    }
}
