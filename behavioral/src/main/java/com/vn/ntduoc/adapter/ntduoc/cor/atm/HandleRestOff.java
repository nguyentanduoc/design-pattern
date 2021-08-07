package com.vn.ntduoc.adapter.ntduoc.cor.atm;

public class HandleRestOff extends WithdrawHandle {

    public int MAX = 5;

//    public HandleRestOff(int amount) {
//        super(amount);
//    }

    @Override
    protected boolean canHandle(int amount) {
        return amount >= MAX;
    }

    @Override
    protected int doingWithdraw(int amount) {
        System.out.println("rest off amount: " + amount);
        return 0;
    }
}
