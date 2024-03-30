package main.java.com.example.springuserservice.entity;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlID;

@entity
public class User {

    @Id
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
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
    public Long getName(){return name;}

    public void setCreatedAt(LocalDateTime createdAt){this.createdAt = createdAt;}
    public Long getCreatedAt(){return createdAt;}

}
