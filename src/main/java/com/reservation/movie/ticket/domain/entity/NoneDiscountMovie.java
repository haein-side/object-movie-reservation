package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("none_discount")
public class NoneDiscountMovie extends Movie {
}
