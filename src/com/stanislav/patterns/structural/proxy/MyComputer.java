package com.stanislav.patterns.structural.proxy;

public class MyComputer implements Computer {
    private String ipAdress;
    private String computerName;

    public MyComputer(String ipAdress, String computerName) {
        this.ipAdress = ipAdress;
        this.computerName = computerName;
    }

    @Override
    public String getIpAdress() {
        return ipAdress;
    }

    public String getComputerName() {
        return computerName;
    }
}
