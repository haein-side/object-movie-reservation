package com.reservation.movie.ticket.repository;

import com.reservation.movie.ticket.domain.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
