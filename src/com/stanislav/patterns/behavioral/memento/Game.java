package com.stanislav.patterns.behavioral.memento;

public class Game {
    private Integer level;
    private User user;

    public Game(Integer level, User user) {
        this.level = level;
        this.user = user;
    }

    public void toNextLevel(){
        this.level++;
        this.user.setForse(user.getForse() + 1);
        this.user.setProtection(user.getProtection() + 1);
    }

    public void loadSave(Save save){
        this.level = save.getLevel();
        this.user = save.getUser();

    }

    public Save save(String nameSave){
        return new Save(nameSave, level, user);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", user=" + user +
                '}';
    }
}
