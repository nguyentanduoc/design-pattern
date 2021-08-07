package com.vn.ntduoc.adapter.ntduoc.memento.state;

import java.util.ArrayList;
import java.util.List;

public class MementoApp {
    public static void main(String[] args) {
        List<Memento> mementos = new ArrayList<>();
        Original original = new Original();
        original.setState("state 1");
        original.setState("state 2");
        mementos.add(original.saveToMemento());

        original.setState("state 3");
        original.setState("state 4");
        mementos.add(original.saveToMemento());
        original.setState("state 5");

        original.restoreFromMemento(mementos.get(1));
    }
}
