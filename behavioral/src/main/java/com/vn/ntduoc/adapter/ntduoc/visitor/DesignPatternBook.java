package com.vn.ntduoc.adapter.ntduoc.visitor;

public class DesignPatternBook implements ProgramingBook {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getSource() {
        return "http://daadadad.com";
    }

    public String getBestSeller() {
        return "the best Seller";
    }
}
