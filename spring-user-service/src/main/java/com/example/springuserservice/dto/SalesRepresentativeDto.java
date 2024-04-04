package com.example.springuserservice.dto;

import java.sql.Timestamp;

import com.example.springuserservice.entity.UserAuthentication;

public class SalesRepresentativeDto {
    private Long id;
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
    private String department;
    private String role;
    private String adminRole;
    private Timestamp createdAt;

   
    private UserAuthenticationDto userAuthenticationDto;
    public SalesRepresentativeDto(){}

    public SalesRepresentativeDto(Long id,Long userId,String firstName,String lastName,String email,String phoneNumber,String address,String department,String role,String adminRole,Timestamp createdAt,UserAuthenticationDto userAuthenticationDto)
    {this.id=id;
    this.userId=userId;
    this.firstName=firstName;
    this.lastName=lastName;
    this.email=email;
    this.phoneNumber=phoneNumber;
    this.address=address;
    this.department=department;
    this.role=role;
    this.adminRole=adminRole;
    this.createdAt=createdAt;
    this.userAuthenticationDto=userAuthenticationDto;}
    
    public Long getId(){return id;}
    public void setId(Long id){this.id = id;}

    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId = userId;}

    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName){this.firstName = firstName;}

    public String lastName(){return lastName;}
    public void setLastName(String lastName){this.lastName = lastName;}

    public String getEmail(){return email;}
    public void setEmail(String email){this.email = email;}

    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

    public String getAddress(){return address;}
    public void setAddress(String address){this.address = address;}

    public String getDepartment(){return department;}
    public void setDepartment(String department){this.department = department;}

    public String getRole(){return role;}
    public void setRole(String role){this.role = role;}

    public String getAdminRole(){return adminRole;}
    public void setAdminRole(String adminRole){this.adminRole = adminRole;}

    public Timestamp getCreatedAt(){return createdAt;}
    public void setCreatedAt(Timestamp createdAt){this.createdAt = createdAt;}

    public UserAuthenticationDto getUserAuthenticationDto(){return userAuthenticationDto;}
    public void setUserAuthenticationDto(UserAuthenticationDto userAuthenticationDto){this.userAuthenticationDto=userAuthenticationDto;}
}
