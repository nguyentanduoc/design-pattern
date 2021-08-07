package com.vn.ntduoc.adapter.ntduoc.mediator.chat;

import java.util.Objects;

public abstract class User {
    protected IChatMediator mediator;
    protected String name;

    public User(IChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(mediator, user.mediator) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator, name);
    }
}
