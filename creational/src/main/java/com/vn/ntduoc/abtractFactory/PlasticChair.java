package com.vn.ntduoc.abtractFactory;

public class PlasticChair implements Chair {

    private static PlasticChair instance;

    private PlasticChair() {

    }

    public static PlasticChair getInstance() {
        if (instance == null) {
            instance = new PlasticChair();
        }
        return instance;
    }

    @Override
    public void create() {
        System.out.println("create PlasticChair");
    }
}
