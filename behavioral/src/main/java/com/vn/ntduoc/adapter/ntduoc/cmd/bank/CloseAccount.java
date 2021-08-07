package com.vn.ntduoc.adapter.ntduoc.cmd.bank;

public class CloseAccount implements BankCommand {

    private final Account account;

    public CloseAccount(Account account) {
        this.account = account;
    }

    @Override
    public void executed() {
        this.account.close();
    }
}
