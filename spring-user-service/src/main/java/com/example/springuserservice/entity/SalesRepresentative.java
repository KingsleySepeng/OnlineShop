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
    //role enum
    private String role;
    //admin role enum
    private String adminRole;
    private Timestamp createdAt;

    public SalesRepresentative(){}

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

    public String getDepartment()
    {
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public String getRole()
    {
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }

    public String getAdminRole()
    {
        return adminRole;
    }
    public void setAdminRole(String adminRole){
        this.adminRole = adminRole;
    }

    public Timestamp getCreatedAt()
    {
        return createdAt;
    }
    public void setCreatedAt(Timestamp createdAt){
        this.createdAt = createdAt;
    }
}
