package com.vn.ntduoc.adapter.ntduoc.strategy.ticketPromote;

public class TicketPromoteApplication {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setAmount(120D);
        ticket.setName("ticket A");
        ticket.setPromotion(new NoPromotion());
        ticket.getTotalAfterDiscount();
        System.out.println(ticket);

        ticket.setPromotion(new PromotionQuarter());
        ticket.getTotalAfterDiscount();
        System.out.println(ticket);

        ticket.setPromotion(new PromotionHalfQuarter());
        ticket.getTotalAfterDiscount();
        System.out.println(ticket);
    }
}
