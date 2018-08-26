package com.stanislav.patterns.behavioral.mediator;

public abstract class User {
    private Chat chat;
    private String userName;
    private boolean isEnable = true;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean isEnable){
        this.isEnable = isEnable;
    }

    public String getUserName() {
        return userName;
    }

    public User(Chat chat, String userName) {
        this.chat = chat;
        this.userName = userName;
    }

    public void sendMessage(String message, User user){
        chat.sendMessage(message, this, user);
    }
    public abstract void getMessage(String message);

    @Override
    public String toString() {
        return "User{ userName='" + userName + '}';
    }
}
