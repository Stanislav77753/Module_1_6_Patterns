package com.stanislav.patterns.creational.factorymethod.example1;

public class BuilderEmployeeFactory implements EmployeeFactory {
    @Override
    public Employee createEmployee() {
        return new Builder();
    }
}
