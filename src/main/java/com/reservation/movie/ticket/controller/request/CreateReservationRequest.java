package com.reservation.movie.ticket.controller.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
public class CreateReservationRequest {

    @NotBlank(message = "고객의 이름이 비어있을 수 없습니다.")
    private String reservationName;

    @NotBlank(message = "영화 ID는 비어있을 수 없습니다.")
    private Long movieId;

    @NotBlank(message = "상영 ID는 비어있을 수 없습니다.")
    private Long screeningId;
}
