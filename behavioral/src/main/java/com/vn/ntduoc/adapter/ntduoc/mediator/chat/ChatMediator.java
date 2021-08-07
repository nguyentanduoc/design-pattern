package com.vn.ntduoc.adapter.ntduoc.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

    private final List<User> users = new ArrayList<>();

    @Override
    public void sendMassage(String message, User user) {
        for (User iUser : users) {
            if (!iUser.equals(user)) {
                iUser.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
