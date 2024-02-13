package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.math.BigDecimal;

@Entity
@DiscriminatorValue("none_discount")
public class NoneDiscountMovie extends Movie {
    @Override
    public BigDecimal calculateDiscountedFee() {
        return super.getFee();
    }
}
