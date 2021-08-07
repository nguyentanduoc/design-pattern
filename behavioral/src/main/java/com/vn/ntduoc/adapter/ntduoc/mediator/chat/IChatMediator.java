package com.vn.ntduoc.adapter.ntduoc.mediator.chat;

public interface IChatMediator {

    void sendMassage(String message, User user);

    void addUser(User user);
}
