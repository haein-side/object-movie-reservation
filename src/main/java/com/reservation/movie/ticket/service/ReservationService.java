package com.reservation.movie.ticket.service;

import com.reservation.movie.ticket.controller.request.CreateReservationRequest;
import com.reservation.movie.ticket.controller.response.CreateReservationResponse;
import com.reservation.movie.ticket.domain.entity.Screening;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ScreeningService screeningService;

    @Transactional
    public CreateReservationResponse createReservation(CreateReservationRequest createReservationRequest) {
        // 1. 할인이 되는 상영인지 확인
        createReservationRequest.getMovieId()
//        calculateDiscountedFee()
        // 2. 계산
        screeningService.calculateFee(createReservationRequest);
        // 3. 예약
    }

}
