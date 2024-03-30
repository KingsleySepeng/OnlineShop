package com.example.springuserservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springuserservice.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
