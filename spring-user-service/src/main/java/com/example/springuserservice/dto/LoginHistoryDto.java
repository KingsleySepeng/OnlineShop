package com.example.springuserservice.dto;

public class LoginHistoryDto {
     
    private Long id;
    private Long userId;
    private String ipAddress;
    private Boolean success;
   
    private UserAuthenticationDto userAuthenticationDto;
    public LoginHistoryDto(){}

    public LoginHistoryDto(Long id,Long userId,String ipAddress,Boolean success,UserAuthenticationDto userAuthenticationDto)
    {this.id=id;
    this.userId=userId;
    this.ipAddress=ipAddress;
    this.success=success;
    this.userAuthenticationDto=userAuthenticationDto;}

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;} 

    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId=userId;}

    public String getIpAddress(){return ipAddress;}
    public void setIpAddress(String ipAddress){this.ipAddress=ipAddress;}

    public Boolean getSuccess(){return success;}
    public void setSuccess(Boolean success){this.success=success;}
    
    public UserAuthenticationDto getUserAuthenticationDto(){return userAuthenticationDto;}
    public void setUserAuthenticationDto(UserAuthenticationDto userAuthenticationDto){this.userAuthenticationDto=userAuthenticationDto;}
}
