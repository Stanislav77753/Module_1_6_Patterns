package com.stanislav.patterns.creational.factorymethod.example2.model;

public class XmlHandlerFactory implements HandlerFactory{
    @Override
    public Handler createHandler() {
        return new XmlHandler();
    }
}
