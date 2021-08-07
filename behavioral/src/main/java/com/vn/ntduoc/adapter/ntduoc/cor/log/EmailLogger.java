package com.vn.ntduoc.adapter.ntduoc.cor.log;

public class EmailLogger extends Logger {

    public EmailLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("EmailLogger " + message);
    }
}
