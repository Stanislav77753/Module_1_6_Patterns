package com.stanislav.patterns.structural.bridge;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public void doLog(String smthInfo) {
        System.out.println(manufacturer.writeDate() + " " + smthInfo);
    }
}
