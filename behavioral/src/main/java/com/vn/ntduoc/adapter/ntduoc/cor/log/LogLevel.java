package com.vn.ntduoc.adapter.ntduoc.cor.log;

public enum LogLevel {

    NONE(0), INFO(2), DEBUG(2), WARNING(4), ERROR(8), FATAL(16), ALL(32);

    private final int level;

    private LogLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
