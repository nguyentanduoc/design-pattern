package com.vn.ntduoc.adapter.ntduoc.state.pattern;

public class RejectState implements State {
    @Override
    public void handleRequest() {
        System.out.println("rejected document");
    }
}
