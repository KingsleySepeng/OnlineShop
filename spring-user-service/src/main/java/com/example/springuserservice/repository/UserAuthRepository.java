package com.example.springuserservice.repository;

import org.springframework.stereotype.Repository;

import com.example.springuserservice.entity.UserAuthentication;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserAuthRepository extends JpaRepository<UserAuthentication,Long> {
    
}
