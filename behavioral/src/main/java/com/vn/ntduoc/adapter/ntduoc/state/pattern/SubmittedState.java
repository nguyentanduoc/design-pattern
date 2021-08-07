package com.vn.ntduoc.adapter.ntduoc.state.pattern;

public class SubmittedState implements State {
    @Override
    public void handleRequest() {
        System.out.println("submitted document");
    }
}
