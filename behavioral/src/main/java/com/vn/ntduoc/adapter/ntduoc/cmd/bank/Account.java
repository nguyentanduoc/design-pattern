package com.vn.ntduoc.adapter.ntduoc.cmd.bank;

public class Account {

    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("open account [" + this.name + "]");
    }

    public void close() {
        System.out.println("open close [" + this.name + "]");
    }
}
