package com.vn.ntduoc.adapter.ntduoc.observer.simple;

public class Observer implements IObserver {

    private final String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Observer " + this.name + " updated message: " + message);
    }
}
