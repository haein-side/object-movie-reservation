package com.reservation.movie.ticket.repository;

import com.reservation.movie.ticket.domain.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
