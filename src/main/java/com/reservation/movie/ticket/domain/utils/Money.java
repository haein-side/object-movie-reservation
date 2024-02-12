package com.reservation.movie.ticket.domain.utils;

import java.math.BigDecimal;

public class Money {
    public static final BigDecimal ZERO = BigDecimal.valueOf(0);

    private BigDecimal plus(BigDecimal fee, BigDecimal amount) {
        return fee.add(amount);
    }

    private BigDecimal minus(BigDecimal fee, BigDecimal amount) {
        return fee.subtract(amount);
    }

    private BigDecimal times(BigDecimal fee, BigDecimal amount) {
        return fee.multiply(amount);
    }

    private boolean isLessThan(BigDecimal fee, BigDecimal other) {
        return fee.compareTo(other) < 0;
    }

    private boolean isGreaterThanOrEqual(BigDecimal fee, BigDecimal other) {
        return fee.compareTo(other) >= 0;
    }
    public String toString(BigDecimal fee) {
        return fee.toString() + "원";
    }
}
