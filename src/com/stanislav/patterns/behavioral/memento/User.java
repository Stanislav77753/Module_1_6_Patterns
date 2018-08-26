package com.stanislav.patterns.behavioral.memento;

public class User {
    private String name;
    private Integer forse;
    private Integer protection;

    public User(String name, Integer forse, Integer protection) {
        this.name = name;
        this.forse = forse;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getForse() {
        return forse;
    }

    public void setForse(int forse) {
        this.forse = forse;
    }

    public Integer getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", forse=" + forse +
                ", protection=" + protection +
                '}';
    }
}
