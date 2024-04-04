package com.example.springuserservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="login_history")
public class LoginHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String ipAddress;
    private Boolean success;
    @JoinColumn
    private UserAuthentication userAuthentication;

    public LoginHistory(){}

    public LoginHistory(Long id,Long userId,String ipAddress,Boolean success,UserAuthentication userAuthentication)
    {this.id=id;
    this.userId=userId;
    this.ipAddress=ipAddress;
    this.success=success;
    this.userAuthentication=userAuthentication;}
    
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;} 

    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId=userId;}

    public String getIpAddress(){return ipAddress;}
    public void setIpAddress(String ipAddress){this.ipAddress=ipAddress;}

    public Boolean getSuccess(){return success;}
    public void setSuccess(Boolean success){this.success=success;}
    
    public UserAuthentication getUserAuthentication(){return userAuthentication;}
    public void setUserAuthentication(UserAuthentication userAuthentication){this.userAuthentication=userAuthentication;}
}
