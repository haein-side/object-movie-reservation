package com.reservation.movie.ticket.domain.entity;

import lombok.Getter;

@Getter
public enum DiscountConditionType {

    SEQUENCE, // 순번 조건

    PERIOD; // 기간 조건
}
