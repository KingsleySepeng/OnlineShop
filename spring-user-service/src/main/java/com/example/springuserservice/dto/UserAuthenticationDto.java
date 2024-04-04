package com.example.springuserservice.dto;

import java.security.Timestamp;

public class UserAuthenticationDto {
    private Long id;
    private String email;
    private String passwordHash;
    private Boolean isActive;
    private Boolean isBlocked;
    private Timestamp lastLogin;
    private String role;

    public UserAuthenticationDto(){}

    public UserAuthenticationDto(Long id,String email,String passwordHash,Boolean isActive,Boolean isBlocked,Timestamp lastLogin,String role)
    {this.id=id;
    this.email=email;
    this.passwordHash=passwordHash;
    this.isActive=isActive;
    this.isBlocked=isBlocked;
    this.lastLogin=lastLogin;
    this.role=role; }

    public Long getId(){return id;}
    public void setId(Long id){ this.id = id;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getPasswordHash(){return passwordHash;}
    public void setPasswordHash(String passwordHash){this.passwordHash = passwordHash;}

    public Boolean getIsActive(){return isActive;}
    public void setIsActive(Boolean isActive){this.isActive = isActive;}

    public Boolean getIsBlocked(){return isBlocked;}
    public void setIsBlocked(Boolean isBlocked){this.isBlocked=isBlocked;}

    public Timestamp getLastLogin(){return lastLogin;}
    public void setLastLogin(Timestamp lastLogin){this.lastLogin=lastLogin;}

    public String getRole(){return role;}
    public void setRole(String role){this.role=role;}
}
