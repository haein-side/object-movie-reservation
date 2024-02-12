package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("percent_discount")
public class PercentDiscountMovie extends Movie {
}
