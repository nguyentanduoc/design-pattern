package com.vn.ntduoc.adapter.ntduoc.cor.leaveRequest;

public class Supervisor extends Approver {
    @Override
    protected boolean canApprove(int days) {
        return days <= 3;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("Approve by Supervisor with " + leaveRequest.getDays() + " days");
    }
}
