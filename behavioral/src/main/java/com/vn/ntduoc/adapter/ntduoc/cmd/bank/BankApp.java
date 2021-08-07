package com.vn.ntduoc.adapter.ntduoc.cmd.bank;

public class BankApp {

    private BankCommand openAccount;

    private BankCommand closeAccount;

    public BankApp(BankCommand openAccount, BankCommand closeAccount) {
        this.closeAccount = closeAccount;
        this.openAccount = openAccount;
    }

    public void clickOpenAccount() {
        openAccount.executed();
    }

    public void clickCloseAccount() {
        closeAccount.executed();
    }
}
