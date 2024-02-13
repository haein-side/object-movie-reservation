package com.reservation.movie.ticket.service;

import com.reservation.movie.ticket.controller.request.CreateReservationRequest;
import com.reservation.movie.ticket.domain.entity.Screening;
import com.reservation.movie.ticket.repository.ScreeningRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    public Screening findScreening(Long screeningId) {
        return screeningRepository.findById(screeningId)
                .orElseThrow(() -> new EntityNotFoundException("상영을 찾을 수 없습니다."));
    }

    public void calculateFee(CreateReservationRequest createReservationRequest) {

    }
}
