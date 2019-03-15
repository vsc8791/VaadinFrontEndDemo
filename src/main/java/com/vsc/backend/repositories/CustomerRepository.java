package com.vsc.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vsc.backend.data.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
