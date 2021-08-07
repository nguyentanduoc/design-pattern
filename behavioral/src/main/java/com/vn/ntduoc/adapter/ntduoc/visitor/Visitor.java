package com.vn.ntduoc.adapter.ntduoc.visitor;

public interface Visitor {

    void visit(BusinessBook businessBook);

    void visit(DesignPatternBook designPatternBook);

    void visit(JavaCoreBook javaCoreBook);
}
