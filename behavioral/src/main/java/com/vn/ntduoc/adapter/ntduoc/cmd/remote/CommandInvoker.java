package com.vn.ntduoc.adapter.ntduoc.cmd.remote;

public class CommandInvoker {

    private final CommandIncrease increase;

    private final CommandDecrease decrease;

    public CommandInvoker(CommandIncrease increase, CommandDecrease decrease) {
        this.decrease = decrease;
        this.increase = increase;
    }

    public void clickIncrease() {
        this.increase.executed();
    }

    public void clickDecrease() {
        this.decrease.executed();
    }

}
