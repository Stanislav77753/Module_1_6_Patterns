package com.stanislav.patterns.creational.builder;

public class Director {
    WariorBuilder wariorBuilder;
    public void setBuilder(WariorBuilder wariorBuilder){
        this.wariorBuilder = wariorBuilder;
    }

    Warior buildWarior(){
        wariorBuilder.createWarior();
        wariorBuilder.buildMilitaryRank();
        wariorBuilder.buildForce();
        wariorBuilder.buildHealth();
        wariorBuilder.buildProtection();
        wariorBuilder.buildSkill();
        return wariorBuilder.getWarior();
    }
}
