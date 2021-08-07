package com.vn.ntduoc.adapter.ntduoc.state.pattern;

public class ApprovedState implements State{

    @Override
    public void handleRequest() {
        System.out.println("approved document");
    }
}
