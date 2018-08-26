package com.stanislav.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class MyChat implements Chat{
    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if(admin != null && admin instanceof Admin){
            this.admin = admin;
        }else{
            throw new RuntimeException("не хватает прав");
        }
    }
    public void addUser(User user){
        if(admin == null){
            throw new RuntimeException("в чате нет админа!!!");
        }
        if(user instanceof SimpleUser){
            users.add(user);
        }else{
            throw new RuntimeException("!!!!!");
        }
    }

    @Override
    public void sendMessage(String message, User user, User targetUser) {
        if(user instanceof Admin){
            for(User u: users){
                if(u.getUserName().equals(targetUser.getUserName())){
                    u.getMessage(user.getUserName() + ": " + message);
                }
            }
        }
        if(user instanceof SimpleUser){
            for(User u: users){
                if(u.getUserName().equals(targetUser.getUserName())){
                    u.getMessage(user.getUserName() + ": " + message);
                }
            }
            if(admin.isEnable()){
                admin.getMessage(user.getUserName() + ": " + message);
            }
        }
    }
}
