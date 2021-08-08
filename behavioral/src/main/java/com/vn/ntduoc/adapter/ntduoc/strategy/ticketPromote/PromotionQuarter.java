package com.vn.ntduoc.adapter.ntduoc.strategy.ticketPromote;

public class PromotionQuarter implements Promotion {

    @Override
    public Double doPromote(Double amount) {
        return amount - amount * 0.5;
    }
}
