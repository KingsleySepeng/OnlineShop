package com.example.springuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springuserservice.service.Interface.LoginHistoryService;

@RestController
@RequestMapping("/login-history")
public class LoginHistoryContoller {
    private final LoginHistoryService loginHistoryService;

    @Autowired
    public LoginHistoryContoller(LoginHistoryService loginHistoryService)
    {this.loginHistoryService=loginHistoryService;}
}
