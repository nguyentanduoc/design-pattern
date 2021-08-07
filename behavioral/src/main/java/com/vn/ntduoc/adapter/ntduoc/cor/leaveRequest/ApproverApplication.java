package com.vn.ntduoc.adapter.ntduoc.cor.leaveRequest;

public class ApproverApplication {

    public static Approver getApprove() {
        Approver supper = new Supervisor();
        Approver diliver = new DeliveryManager();
        Approver director = new Director();

        supper.setNext(diliver);
        diliver.setNext(director);
        return supper;
    }
}
