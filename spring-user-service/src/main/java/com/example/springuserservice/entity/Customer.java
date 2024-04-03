package com.example.springuserservice.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private Timestamp createdAt;
    //foreign key for user id from userAuthentication table

    public Customer(){}

    public Long getId()
    {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public Long getUserId()
    {
        return userId;
    }
    public void setUserId(Long userId){
        this.userId = userId;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String lastName()
    {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public Timestamp getCreatedAt()
    {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt){
        this.createdAt = createdAt;
    }
}

