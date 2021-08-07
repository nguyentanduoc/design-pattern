package com.vn.ntduoc.adapter.ntduoc.visitor;

public class BusinessBook implements Book {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "The publisher of business book";
    }
}
