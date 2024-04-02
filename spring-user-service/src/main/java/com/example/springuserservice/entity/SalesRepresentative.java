package com.example.springuserservice.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SalesRepresentative")
public class SalesRepresentative {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    //department enum
    private String department;
    //role
    private String role;
    //admin role
    private String adminRole;
    private Timestamp createdAt;
}
