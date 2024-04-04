package com.example.springuserservice.entity;

import java.security.Timestamp;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_audit_log")
public class AdminAuditLog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String actionType;
    private Timestamp actionTimeStamp;
    private String details;
    @JoinColumn
    private UserAuthentication userAuthentication;

    public AdminAuditLog(){}

    public AdminAuditLog(Long id,Long userId,String actionType,Timestamp actionTimestamp,String details,UserAuthentication userAuthentication)
    {this.id=id;
    this.userId=userId;
    this.actionType=actionType;
    this.actionTimeStamp=actionTimestamp;
    this.details=details;
    this.userAuthentication=userAuthentication;}
    
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}

    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId=userId;}

    public String getActionType(){return actionType;}
    public void setActionType(String actionType){this.actionType=actionType;}

    public Timestamp getActionTimestamp(){return actionTimeStamp;}
    public void setActionTimeStamp(Timestamp actionTimestamp){this.actionTimeStamp=actionTimestamp;}

    public String getDetails(){return details;}
    public void setDetails(String details){this.details=details;}

    public UserAuthentication getUserAuthentication(){return userAuthentication;}
    public void setUserAuthentication(UserAuthentication userAuthentication){this.userAuthentication=userAuthentication;}
}
