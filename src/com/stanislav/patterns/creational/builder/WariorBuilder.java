package com.stanislav.patterns.creational.builder;

public abstract class WariorBuilder {
    Warior warior;

    void createWarior(){
        warior = new Warior();
    }
    abstract void buildMilitaryRank();
    abstract void buildSkill();
    abstract void buildForce();
    abstract void buildProtection();
    abstract void buildHealth();

    Warior getWarior(){
        return warior;
    }
}
