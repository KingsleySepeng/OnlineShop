package com.example.springuserservice.entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime createdAt;

    public User (){}
    public User (String name,LocalDateTime createdAt)
        {
        this.name=name;
        this.createdAt = createdAt;
        }
        
    public void setId(Long id){this.id = id;}
    public Long getId(){return id;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setCreatedAt(LocalDateTime createdAt){this.createdAt = createdAt;}
    public LocalDateTime getCreatedAt(){return createdAt;}

}
