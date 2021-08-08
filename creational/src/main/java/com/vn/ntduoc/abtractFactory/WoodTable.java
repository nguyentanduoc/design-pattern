package com.vn.ntduoc.abtractFactory;

public class WoodTable implements Table {

    private static WoodTable instance;

    public WoodTable() {
    }

    public static WoodTable getInstance() {
        if (instance == null) {
            instance = new WoodTable();
        }
        return instance;
    }

    @Override
    public void create() {
        System.out.println("create WoodTable");
    }
}
