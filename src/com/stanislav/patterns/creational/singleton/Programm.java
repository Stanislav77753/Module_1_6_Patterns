package com.stanislav.patterns.creational.singleton;

public class Programm {
    private String name;
    private int memory;

    public Programm(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void startProgramm(Server server){
        server.sendProgrammToServer(this);
    }
}
