package com.stanislav.patterns.behavioral.memento;

import com.stanislav.patterns.behavioral.memento.repository.SaveRepository;

public class MementoRunner {
    public static void main(String[] args) {
        User user = new User("Stas", 5,5);
        Game game = new Game(1, user);
        SaveRepository saver = new SaveRepository();
        saver.addSave(game.save("SaveOne"));
        game.toNextLevel();
        System.out.println(game);
        saver.addSave(game.save("SaveTwo"));
        game.loadSave(saver.getSave("SaveOne"));
        System.out.println(game);


    }
}
