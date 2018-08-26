package com.stanislav.patterns.behavioral.memento;

public class Save {
    private String nameSave;
    private Integer level;
    private User user;

    public Save(String nameSave, Integer level, User user) {
        this.nameSave = nameSave;
        this.level = level;
        this.user = user;
    }

    public String getNameSave() {
        return nameSave;
    }

    public Integer getLevel() {
        return level;
    }

    public User getUser() {
        return user;
    }
}
