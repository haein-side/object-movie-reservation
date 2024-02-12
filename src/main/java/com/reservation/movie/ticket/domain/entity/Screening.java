package com.reservation.movie.ticket.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ScreeningEntity {

    @Id
    @GeneratedValue
    @Column(name = "screening_id")
    private Long id;

    private int sequence;

    private LocalDateTime whenScreened;

    


}
