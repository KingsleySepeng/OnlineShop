package com.example.springuserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/docker")
    public String docker(){
        return "Welcome Docker To The Spring Home Page! New Change";
    }

    @GetMapping("/spring")
    public String spring(){
        return "Welcome Spring To The Spring Spring page!";
    }
    @GetMapping("/home")
    public String home(){
        return "Welcome To The Spring - Docker Page, Welcome Home!";
    }
     @GetMapping("/new-feat")
    public String feature(){
        return "This is a new bug , big bug!";
    }
}
