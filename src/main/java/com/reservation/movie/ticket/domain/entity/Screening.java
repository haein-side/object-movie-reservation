package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Screening {

    @Id
    @GeneratedValue
    @Column(name = "screening_id")
    private Long id;

    private int sequence; // 상영 순번

    private LocalDateTime whenScreened; // 상영 일자

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
