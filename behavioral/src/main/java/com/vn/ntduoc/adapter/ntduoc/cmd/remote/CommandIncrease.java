package com.vn.ntduoc.adapter.ntduoc.cmd.remote;

public class CommandIncrease implements RemoteCommand {

    private final Fan fan;

    public CommandIncrease(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void executed() {
        this.fan.increase();
    }
}
