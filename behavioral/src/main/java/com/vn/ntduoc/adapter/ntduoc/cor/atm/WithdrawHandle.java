package com.vn.ntduoc.adapter.ntduoc.cor.atm;

public abstract class WithdrawHandle {

    protected WithdrawHandle next;

//    public WithdrawHandle(int maxAmount) {
//        this.maxAmount = maxAmount;
//    }

    public void handle(int amount) {
        if (this.canHandle(amount)) {
            amount = this.doingWithdraw(amount);
        }
        if (amount == 0) {
            return;
        }
        if (this.next != null) {
            this.next.handle(amount);
        }
    }

    protected abstract boolean canHandle(int amount);

    protected abstract int doingWithdraw(int amount);

    protected void setNext(WithdrawHandle next) {
        this.next = next;
    }
}
