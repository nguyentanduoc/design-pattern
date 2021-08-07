package com.vn.ntduoc.adapter.ntduoc.cmd.bank;

public class OpenAccount implements BankCommand {

    private final Account account;

    public OpenAccount(Account account) {
        this.account = account;
    }

    @Override
    public void executed() {
        this.account.open();
    }
}
