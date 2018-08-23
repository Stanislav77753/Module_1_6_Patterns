package com.stanislav.patterns.creational.singleton;

public class Server {
    private static Server server = null;
    private static int hdd = 1000;

    private Server(){}

    public static Server getServer(){
        if(server == null){
            synchronized (Server.class){
                if(server == null){
                    server = new Server();
                }
            }
        }
        return server;
    }

    public int getFreeMemory(){
        return hdd;
    }

    public synchronized void sendProgrammToServer(Programm programm){
        hdd -= programm.getMemory();
    }
}
