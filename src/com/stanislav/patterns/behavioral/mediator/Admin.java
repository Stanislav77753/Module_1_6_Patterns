package com.stanislav.patterns.behavioral.mediator;

public class Admin extends User {

    public Admin(Chat chat, String userName) {
        super(chat, userName);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Администратор " + getUserName() + " получает сообщение '" + message + "'");
    }
}
