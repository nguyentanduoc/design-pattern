package com.vn.ntduoc.adapter.ntduoc.visitor;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook businessBook) {
        System.out.println(businessBook.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook designPatternBook) {
        System.out.println(designPatternBook.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook javaCoreBook) {
        System.out.println(javaCoreBook.getFavouriteBook());
    }
}
