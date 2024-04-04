package com.example.springuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springuserservice.service.Interface.UserAuthService;

@RestController
@RequestMapping("/user-auth")
public class UserAuthController {
    private final UserAuthService userAuthService;

    @Autowired
    public UserAuthController(UserAuthService userAuthService)
    {this.userAuthService=userAuthService;}
}
