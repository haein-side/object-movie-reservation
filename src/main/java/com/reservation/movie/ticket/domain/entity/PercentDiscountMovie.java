package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("percent_discount")
public class PercentDiscountMovie extends Movie {
    private double discountPercent;
    @Override
    public BigDecimal calculateDiscountedFee() {
        return super.getFee().multiply(BigDecimal.valueOf(this.discountPercent));
    }
}
