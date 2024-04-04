package com.example.springuserservice.dto;

import java.security.Timestamp;


public class AdminAuditLogDto {
    
    private Long id;
    private Long userId;
    private String actionType;
    private Timestamp actionTimeStamp;
    private String details;

    private UserAuthenticationDto userAuthenticationDto;
    public AdminAuditLogDto(){}

    public AdminAuditLogDto(Long id,Long userId,String actionType,Timestamp actionTimestamp,String details,UserAuthenticationDto userAuthenticationDto)
    {this.id=id;
    this.userId=userId;
    this.actionType=actionType;
    this.actionTimeStamp=actionTimestamp;
    this.details=details;
    this.userAuthenticationDto=userAuthenticationDto;}

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

    public UserAuthenticationDto getUserAuthentication(){return userAuthenticationDto;}
    public void setUserAuthentication(UserAuthenticationDto userAuthenticationDto){this.userAuthenticationDto=userAuthenticationDto;}
}
