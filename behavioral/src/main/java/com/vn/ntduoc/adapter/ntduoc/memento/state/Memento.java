package com.vn.ntduoc.adapter.ntduoc.memento.state;

public class Memento {
    private final String state;

    public Memento(String stateToRemove) {
        state = stateToRemove;
    }

    public String getSavedState() {
        return state;
    }
}
