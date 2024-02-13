package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("amount_discount")
public class AmountDiscountMovie extends Movie {

    private BigDecimal discountAmount;

    @Override
    public BigDecimal calculateDiscountedFee() {
        return super.getFee().subtract(this.discountAmount);
    }
}
