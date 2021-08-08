package com.vn.ntduoc.prototype;

public class ComputerApp {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setOs("Win10");
        computer.setOthers("othor1 ");

        Computer computer1 = computer.clone();
        computer1.setOthers("other2");
        System.out.println(computer);
        System.out.println(computer1);
    }
}
