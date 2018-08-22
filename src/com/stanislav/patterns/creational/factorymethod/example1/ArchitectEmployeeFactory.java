package com.stanislav.patterns.creational.factorymethod.example1;

public class ArchitectEmployeeFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Architect();
    }
}
