package com.vn.ntduoc.adapter.ntduoc.cor.leaveRequest;

public class Director extends Approver {
    @Override
    protected boolean canApprove(int days) {
        return days > 5;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("Approve by Director with " + leaveRequest.getDays() + " days");
    }
}
