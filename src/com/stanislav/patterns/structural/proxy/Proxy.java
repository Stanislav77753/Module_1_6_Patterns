package com.stanislav.patterns.structural.proxy;

public class Proxy implements Computer {
    private static final String ipAdress = "192.168.0.1";
    private Computer computer;
    private String computerName;

    public Proxy(Computer computer) {
        this.computerName = computer.getComputerName();
    }


    @Override
    public String getIpAdress() {
        return ipAdress;
    }

    @Override
    public String getComputerName() {
        return computerName;
    }
}
