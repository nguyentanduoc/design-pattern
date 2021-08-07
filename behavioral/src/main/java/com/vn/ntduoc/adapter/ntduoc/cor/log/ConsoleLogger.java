package com.vn.ntduoc.adapter.ntduoc.cor.log;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("console logger: " + message);
    }
}
