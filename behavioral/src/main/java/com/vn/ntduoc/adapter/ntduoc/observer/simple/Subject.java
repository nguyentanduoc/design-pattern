package com.vn.ntduoc.adapter.ntduoc.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<IObserver> observers = new ArrayList<>();

    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    public void detach(IObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyChange(String message) {
        for (IObserver item : observers) {
            item.update(message);
        }
    }
}
