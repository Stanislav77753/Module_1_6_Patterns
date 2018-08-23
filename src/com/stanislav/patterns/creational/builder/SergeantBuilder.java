package com.stanislav.patterns.creational.builder;

public class SergeantBuilder extends WariorBuilder {

    @Override
    void buildMilitaryRank() {
        warior.setMilitaryRank(MilitaryRank.Sergeant);
    }

    @Override
    void buildSkill() {
        warior.setSkill(3);
    }

    @Override
    void buildForce() {
        warior.setForce(25);
    }

    @Override
    void buildProtection() {
        warior.setProtection(60);
    }

    @Override
    void buildHealth() {
        warior.setHealth(85);
    }
}
