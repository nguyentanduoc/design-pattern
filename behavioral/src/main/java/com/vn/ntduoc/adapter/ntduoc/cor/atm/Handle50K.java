package com.vn.ntduoc.adapter.ntduoc.cor.atm;

public class Handle50K extends WithdrawHandle {

    public int MAX = 50;

//    public Handle50K(int amount) {
//        super(amount);
//    }

    @Override
    protected boolean canHandle(int amount) {
        return amount >= MAX;
    }


    @Override
    protected int doingWithdraw(int amount) {
        int div = amount / this.MAX;
        if (div >= 1) {
            System.out.println("number" + this.MAX + " is: " + div);
            return amount - (this.MAX * div);
        }
        return amount;
    }
}
