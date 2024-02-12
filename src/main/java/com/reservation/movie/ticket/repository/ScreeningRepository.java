package com.reservation.movie.ticket.repository;

import com.reservation.movie.ticket.domain.entity.Movie;
import com.reservation.movie.ticket.domain.entity.Screening;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScreeningRepository extends JpaRepository<Screening, Long> {
}
