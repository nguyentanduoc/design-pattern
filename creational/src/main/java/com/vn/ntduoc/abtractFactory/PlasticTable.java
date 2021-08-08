package com.vn.ntduoc.abtractFactory;

public class PlasticTable implements Table {

    private static PlasticTable instance;

    private PlasticTable() {
    }

    public static PlasticTable getInstance() {
        if (instance == null) {
            instance = new PlasticTable();
        }
        return instance;
    }

    @Override
    public void create() {
        System.out.println("create PlasticTable");
    }
}
