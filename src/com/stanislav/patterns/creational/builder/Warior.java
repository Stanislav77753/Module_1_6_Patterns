package com.stanislav.patterns.creational.builder;

public class Warior {
    private MilitaryRank militaryRank;
    private int skill;
    private int force;
    private int protection;
    private int health;

    public void setMilitaryRank(MilitaryRank militaryRank) {
        this.militaryRank = militaryRank;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Warior{" +
                "militaryRank=" + militaryRank +
                ", skill=" + skill +
                ", force=" + force +
                ", protection=" + protection +
                ", health=" + health +
                '}';
    }
}
