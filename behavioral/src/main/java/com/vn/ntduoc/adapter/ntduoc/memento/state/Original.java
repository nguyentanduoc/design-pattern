package com.vn.ntduoc.adapter.ntduoc.memento.state;

public class Original {

    private String state;

    public Memento saveToMemento() {
        System.out.println("originator: Saving to memento");
        return new Memento(this.state);
    }

    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
