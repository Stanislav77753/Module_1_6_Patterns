package com.stanislav.patterns.structural.adapter;

public class AdapterPrinterToComputer extends Printer implements Computer{
    @Override
    public void print(String string) {
        printString(string);
    }
}
