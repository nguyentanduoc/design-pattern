package com.vn.ntduoc.adapter.ntduoc.cmd.bank;

public class BankAppMain {
    public static void main(String[] args) {
        Account account = new Account("ntduoc");
        BankCommand open = new OpenAccount(account);
        BankCommand close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);
        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
