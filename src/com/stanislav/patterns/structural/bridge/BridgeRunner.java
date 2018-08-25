package com.stanislav.patterns.structural.bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger(new ManufacturerTwo());
        logger.doLog("start programm");
        logger.doLog("close programm");
    }
}
