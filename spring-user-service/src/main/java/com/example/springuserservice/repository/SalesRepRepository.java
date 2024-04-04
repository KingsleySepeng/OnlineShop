package com.example.springuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springuserservice.entity.SalesRepresentative;

@Repository
public interface SalesRepRepository extends JpaRepository<SalesRepresentative,Long> {
    
}
