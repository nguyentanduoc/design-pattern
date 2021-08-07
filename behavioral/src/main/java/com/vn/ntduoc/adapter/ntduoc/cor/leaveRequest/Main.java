package com.vn.ntduoc.adapter.ntduoc.cor.leaveRequest;

public class Main {

    public static void main(String[] args) {
        Approver approverApplication = ApproverApplication.getApprove();
        approverApplication.approveLeave(new LeaveRequest(2));
        System.out.println("===================");
        approverApplication.approveLeave(new LeaveRequest(4));
        System.out.println("===================");
        approverApplication.approveLeave(new LeaveRequest(10));
    }
}
