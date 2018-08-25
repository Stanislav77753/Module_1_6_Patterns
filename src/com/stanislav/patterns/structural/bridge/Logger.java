package com.stanislav.patterns.structural.bridge;

public abstract class Logger {
    Manufacturer manufacturer;

    public Logger(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public abstract void doLog(String smthInfo);
}
