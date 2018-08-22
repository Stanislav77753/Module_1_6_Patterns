package com.stanislav.patterns.creational.factorymethod.example2;

import com.stanislav.patterns.creational.factorymethod.example2.view.ConsoleHelper;

public class FactoryMethodAppRunner {
    public static void main(String[] args) {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        consoleHelper.mainMenu();
    }
}
