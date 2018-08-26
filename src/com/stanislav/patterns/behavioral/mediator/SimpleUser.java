package com.stanislav.patterns.behavioral.mediator;

public class SimpleUser extends User {
    public SimpleUser(Chat chat, String userName) {
        super(chat, userName);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Пользователь " + getUserName() + " получает сообщение '" + message + "'");
    }
}
