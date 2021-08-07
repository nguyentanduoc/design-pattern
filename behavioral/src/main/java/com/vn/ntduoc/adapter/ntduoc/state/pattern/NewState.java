package com.vn.ntduoc.adapter.ntduoc.state.pattern;

public class NewState implements State {
    @Override
    public void handleRequest() {
        System.out.println("create new a document");
    }
}
