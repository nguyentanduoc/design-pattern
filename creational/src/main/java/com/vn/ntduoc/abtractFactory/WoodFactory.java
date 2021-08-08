package com.vn.ntduoc.abtractFactory;

public class WoodFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return WoodChair.getInstance();
    }

    @Override
    public Table createTable() {
        return WoodTable.getInstance();
    }
}
