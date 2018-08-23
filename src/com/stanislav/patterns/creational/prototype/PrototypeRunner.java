package com.stanislav.patterns.creational.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        Tshirt masterTshirt = new Tshirt(48, "black");

        TshirtFactory tshirtFactory = new TshirtFactory(masterTshirt);
        Tshirt cloneTshirt = tshirtFactory.cloneTshirt();
        System.out.println(masterTshirt);
        System.out.println(cloneTshirt);
    }
}
