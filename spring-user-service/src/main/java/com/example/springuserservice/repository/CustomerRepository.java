package com.example.springuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springuserservice.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    
} 
