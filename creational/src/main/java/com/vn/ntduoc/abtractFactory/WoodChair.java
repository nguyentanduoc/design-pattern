package com.vn.ntduoc.abtractFactory;

public class WoodChair implements Chair {

    private static WoodChair instance;

    private WoodChair() {

    }

    public static WoodChair getInstance() {
        if (instance == null) {
            instance = new WoodChair();
        }
        return instance;
    }

    @Override
    public void create() {
        System.out.println("create WoodChair");
    }
}
