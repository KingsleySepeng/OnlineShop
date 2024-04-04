package com.example.springuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springuserservice.service.Interface.CustomerService;


@RestController
@RequestMapping("/customers")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {this.customerService=customerService;}

    //create a user

    //read a user

    //update their details

    //delete a customer
}
