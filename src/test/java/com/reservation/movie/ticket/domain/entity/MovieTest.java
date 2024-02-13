package com.reservation.movie.ticket.domain.entity;

import com.reservation.movie.ticket.repository.CustomerRepository;
import com.reservation.movie.ticket.repository.MovieRepository;
import com.reservation.movie.ticket.repository.ScreeningRepository;
import com.reservation.movie.ticket.controller.request.CreateReservationRequest;
import com.reservation.movie.ticket.service.ReservationService;
import org.junit.jupiter.api.DisplayName;
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

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ReservationService reservationService;


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

    private Customer createCustomerForTest() {
        Customer customer = Customer.builder()
                .name("김몽룡")
                .build();

        return customerRepository.save(customer);
    }

    @DisplayName("예약이 정상적으로 수행되는지 확인")
    @Test
    void createReservation() {
        // given
        Movie movie = createMovieForTest();
        Screening screening = createScreeningForTest(movie);
        Customer customer = createCustomerForTest();

        CreateReservationRequest createReservationRequest = CreateReservationRequest.builder()
                .reservationName(customer.getName())
                .movieId(movie.getId())
                .screeningId(screening.getId())
                .build();

        // when


        // then
    }


}
