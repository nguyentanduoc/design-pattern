package com.vn.ntduoc.adapter.ntduoc.cmd.remote;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        CommandIncrease increase = new CommandIncrease(fan);
        CommandDecrease decrease = new CommandDecrease(fan);
        CommandInvoker commandInvoker = new CommandInvoker(increase, decrease);
        commandInvoker.clickIncrease();
        commandInvoker.clickDecrease();
    }
}
