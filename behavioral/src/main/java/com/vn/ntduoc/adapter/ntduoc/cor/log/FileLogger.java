package com.vn.ntduoc.adapter.ntduoc.cor.log;

public class FileLogger extends Logger {

    public FileLogger(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("file logger: " + message);
    }
}
