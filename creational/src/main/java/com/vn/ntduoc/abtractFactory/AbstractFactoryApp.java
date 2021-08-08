package com.vn.ntduoc.abtractFactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);
        Chair chair = factory.createChair();
        chair.create();
        Table table = factory.createTable();
        table.create();
    }
}
