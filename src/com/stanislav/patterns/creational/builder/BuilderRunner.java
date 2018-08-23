package com.stanislav.patterns.creational.builder;

import com.stanislav.patterns.creational.factorymethod.example1.Builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderRunner {
    public static void main(String[] args) {
        List<Warior> platoon = new ArrayList<>();
        Director director = new Director();
        director.setBuilder(new SoldierBuilder());
        for(int i = 0; i < 100; i++){
            platoon.add(director.buildWarior());
        }
        director.setBuilder(new SergeantBuilder());
        for(int i = 0; i < 20; i++){
            platoon.add(director.buildWarior());
        }

        director.setBuilder(new OfficerBuilder());
        for(int i = 0; i < 10; i++){
            platoon.add(director.buildWarior());
        }

        for(Warior warior: platoon){
            System.out.println(warior);
        }
    }
}
