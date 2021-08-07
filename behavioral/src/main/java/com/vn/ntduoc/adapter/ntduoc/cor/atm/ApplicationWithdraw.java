package com.vn.ntduoc.adapter.ntduoc.cor.atm;

public class ApplicationWithdraw {

    public static WithdrawHandle getWithdraw() {
        WithdrawHandle _500 = new Handle500K();
        WithdrawHandle _200 = new Handle200K();
        WithdrawHandle _100 = new Handle100K();
        WithdrawHandle _50 = new Handle50K();
        WithdrawHandle _20 = new Handle20K();
        WithdrawHandle _10 = new Handle10K();
        WithdrawHandle _5 = new Handle5K();
        WithdrawHandle _0 = new HandleRestOff();
        _500.setNext(_200);
        _200.setNext(_100);
        _100.setNext(_50);
        _50.setNext(_20);
        _20.setNext(_10);
        _10.setNext(_5);
        _5.setNext(_0);
        return _500;
    }
}
