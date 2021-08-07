package com.vn.ntduoc.adapter.ntduoc.cor.log;

public class Main {

    public static void main(String[] args) {
        Logger logger = AppLogger.getLogger();
        logger.log(LogLevel.INFO, "info message");
        System.out.println("===================");
        logger.log(LogLevel.DEBUG, "DEBUG message");
        System.out.println("===================");
        logger.log(LogLevel.ERROR, "ERROR message");
        System.out.println("===================");
        logger.log(LogLevel.FATAL, "FATAL message");
    }
}
