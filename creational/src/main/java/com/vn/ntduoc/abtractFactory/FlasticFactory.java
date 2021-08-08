package com.vn.ntduoc.abtractFactory;

public class FlasticFactory implements FurnitureAbstractFactory {
    @Override
    public Chair createChair() {
        return PlasticChair.getInstance();
    }

    @Override
    public Table createTable() {
        return PlasticTable.getInstance();
    }
}
