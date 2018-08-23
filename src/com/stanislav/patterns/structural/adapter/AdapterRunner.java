package com.stanislav.patterns.structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        Computer computer = new AdapterPrinterToComputer();
        computer.print("String to print");
    }
}
