package com.vn.ntduoc.adapter.ntduoc.visitor;

public class VisitorApplication {
    public static void main(String[] args) {
        Book book = new BusinessBook();
        Book book1 = new JavaCoreBook();
        Book book2 = new DesignPatternBook();

        Visitor visitor = new VisitorImpl();
        book.accept(visitor);
        book2.accept(visitor);
        book1.accept(visitor);
    }
}

