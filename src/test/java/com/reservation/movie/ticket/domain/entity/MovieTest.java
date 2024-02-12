package com.reservation.movie.ticket.domain.entity;

import com.reservation.movie.ticket.repository.MovieRepository;
import com.reservation.movie.ticket.repository.ScreeningRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

@SpringBootTest
@Rollback(false)
class MovieTest {

    @Autowired
    private ScreeningRepository screeningRepository;

    @Autowired
    private MovieRepository movieRepository;


    private Movie createMovieForTest() {
        Movie movie = Movie.builder()
                .title("전우치")
                .runningTime(Duration.ofHours(1))
                .fee(BigDecimal.valueOf(9000))
                .build();

        return movieRepository.save(movie);
    }

    private Screening createScreeningForTest(Movie movie) {
        Screening screening = Screening.builder()
                .sequence(2)
                .whenScreened(LocalDateTime.now())
                .movie(movie)
                .build();

        return screeningRepository.save(screening);
    }




}
