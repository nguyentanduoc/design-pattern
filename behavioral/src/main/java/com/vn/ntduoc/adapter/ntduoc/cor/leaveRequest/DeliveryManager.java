package com.vn.ntduoc.adapter.ntduoc.cor.leaveRequest;

public class DeliveryManager extends Approver {
    @Override
    protected boolean canApprove(int days) {
        return days <= 5;
    }

    @Override
    protected void doApproving(LeaveRequest leaveRequest) {
        System.out.println("Approve by DeliveryManager with " + leaveRequest.getDays() + " days");
    }
}
