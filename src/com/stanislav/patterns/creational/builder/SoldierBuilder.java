package com.stanislav.patterns.creational.builder;

public class SoldierBuilder extends WariorBuilder {

    @Override
    void buildMilitaryRank() {
        warior.setMilitaryRank(MilitaryRank.Soldier);
    }

    @Override
    void buildSkill() {
        warior.setSkill(1);
    }

    @Override
    void buildForce() {
        warior.setForce(10);
    }

    @Override
    void buildProtection() {
        warior.setProtection(50);
    }

    @Override
    void buildHealth() {
        warior.setHealth(80);
    }
}
