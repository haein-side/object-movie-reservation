package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.Duration;

@Entity
@Table
@Getter
@Builder
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "movie_type")
@NoArgsConstructor
@AllArgsConstructor
public abstract class Movie {

    @Id
    @GeneratedValue
    @Column(name = "movie_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Duration runningTime;

    @Column(nullable = false)
    private BigDecimal fee;

    public abstract BigDecimal calculateDiscountedFee();
}
