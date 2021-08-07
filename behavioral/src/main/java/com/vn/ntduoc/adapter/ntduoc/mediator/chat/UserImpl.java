package com.vn.ntduoc.adapter.ntduoc.mediator.chat;

public class UserImpl extends User {

    public UserImpl(IChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("----");
        System.out.println(this.name + " is send the message: " + msg);
        this.mediator.sendMassage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + " received the message: " + msg);
    }
}
