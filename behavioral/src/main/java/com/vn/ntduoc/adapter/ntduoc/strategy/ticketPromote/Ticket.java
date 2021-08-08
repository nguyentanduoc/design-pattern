package com.vn.ntduoc.adapter.ntduoc.strategy.ticketPromote;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Ticket {

    private Double amount;

    private String name;

    private Double promote;

    private Promotion promotion;

    void getTotalAfterDiscount() {
        this.promote = this.promotion.doPromote(this.amount);
    }
}
