package com.vn.ntduoc.adapter.ntduoc.cor.atm;

public class Handle500K extends WithdrawHandle {
    private int MAX = 500;

//    public Handle500K(int maxAmount) {
//        super(maxAmount);
//    }

    @Override
    protected boolean canHandle(int amount) {
        return amount >= MAX;
    }


    @Override
    protected int doingWithdraw(int amount) {
        int div = amount / this.MAX;
        if (div >= 1) {
            System.out.println("number " + this.MAX + " is: " + div);
            return amount - (this.MAX * div);
        }
        return amount;
    }
}
