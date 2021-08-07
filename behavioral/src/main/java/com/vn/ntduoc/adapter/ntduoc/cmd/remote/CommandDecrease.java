package com.vn.ntduoc.adapter.ntduoc.cmd.remote;

public class CommandDecrease implements RemoteCommand {

    private final Fan fan;

    public CommandDecrease(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void executed() {
        this.fan.decrease();
    }
}
