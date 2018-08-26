package com.stanislav.patterns.behavioral.mediator;

public class ChatRunner {
    public static void main(String[] args) {
        MyChat myChat = new MyChat();
        User admin = new Admin(myChat, "ADMIN");
        User user1 = new SimpleUser(myChat, "USER1");
        User user2 = new SimpleUser(myChat, "USER2");
        User user3 = new SimpleUser(myChat, "USER3");
        User user4 = new SimpleUser(myChat, "USER4");

        myChat.setAdmin(admin);
        myChat.addUser(user1);
        myChat.addUser(user2);
        myChat.addUser(user3);
        myChat.addUser(user4);

        user1.sendMessage("Hello", user2);
    }
}
