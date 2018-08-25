package com.stanislav.patterns.structural.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        Computer myComputer = new MyComputer("198.0.0.0", "Z440");
        Computer computer = new Proxy(myComputer);

        System.out.println(computer.getIpAdress());
    }
}
