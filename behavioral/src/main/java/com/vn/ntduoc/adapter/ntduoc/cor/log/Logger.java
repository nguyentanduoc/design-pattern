package com.vn.ntduoc.adapter.ntduoc.cor.log;

public abstract class Logger {

    private LogLevel logLevel;

    protected Logger nextLogger;

    public Logger(LogLevel level) {
        this.logLevel = level;
    }

    public Logger setNext(Logger next) {
        this.nextLogger = next;
        return next;
    }

    public void log(LogLevel logLevel, String message) {
        if (this.logLevel.getLevel() <= logLevel.getLevel()) {
            writeMessage(message);
        }
        if (nextLogger != null) {
            nextLogger.log(logLevel, message);
        }
    }

    protected abstract void writeMessage(String message);
}
