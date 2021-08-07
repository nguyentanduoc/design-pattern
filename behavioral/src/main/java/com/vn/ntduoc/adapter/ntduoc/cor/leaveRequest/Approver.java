package com.vn.ntduoc.adapter.ntduoc.cor.leaveRequest;

public abstract class Approver {

    protected Approver nextApprover;

    public void approveLeave(LeaveRequest leaveRequest) {
        if (this.canApprove(leaveRequest.getDays())) {
            this.doApproving(leaveRequest);
        }
        if (this.nextApprover != null) {
            nextApprover.approveLeave(leaveRequest);
        }
    }

    public void setNext(Approver next) {
        this.nextApprover = next;
    }

    protected abstract boolean canApprove(int days);

    protected abstract void doApproving(LeaveRequest leaveRequest);
}
