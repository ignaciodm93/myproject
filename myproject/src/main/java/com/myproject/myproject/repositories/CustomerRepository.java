package com.myproject.myproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.myproject.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
