package com.vn.ntduoc.adapter.ntduoc.strategy.ticketPromote;

public class NoPromotion implements Promotion {

    @Override
    public Double doPromote(Double amount) {
        return amount;
    }
}
