package com.vn.ntduoc.adapter.ntduoc.cor.atm;

public class Main {
    public static void main(String[] args) {
        WithdrawHandle applicationWithdraw = ApplicationWithdraw.getWithdraw();
        applicationWithdraw.handle(15252);
    }
}
