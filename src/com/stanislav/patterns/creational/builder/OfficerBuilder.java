package com.stanislav.patterns.creational.builder;

public class OfficerBuilder extends WariorBuilder {

    @Override
    void buildMilitaryRank() {
        warior.setMilitaryRank(MilitaryRank.Officer);
    }

    @Override
    void buildSkill() {
        warior.setSkill(7);
    }

    @Override
    void buildForce() {
        warior.setForce(50);
    }

    @Override
    void buildProtection() {
        warior.setProtection(80);
    }

    @Override
    void buildHealth() {
        warior.setHealth(95);
    }
}
