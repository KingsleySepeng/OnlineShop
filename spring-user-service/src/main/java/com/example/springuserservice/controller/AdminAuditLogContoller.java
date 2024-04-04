package com.example.springuserservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springuserservice.service.Interface.AdminAuditLogService;

@RestController
@RequestMapping("/admin-audit-log")
public class AdminAuditLogContoller {
    private final AdminAuditLogService adminAuditLogService;

    public AdminAuditLogContoller(AdminAuditLogService adminAuditLogService)
    {this.adminAuditLogService=adminAuditLogService;}
}
