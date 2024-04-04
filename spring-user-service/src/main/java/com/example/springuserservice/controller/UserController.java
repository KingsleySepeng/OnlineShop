package com.example.springuserservice.controller;

import com.example.springuserservice.service.UserService;
// import com.example.springuserservice.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {
    // private final UserService userService;

    // @Autowired
    // public UserController(UserService userService){
    //     this.userService = userService;
    // }

    // @PostMapping
    // public ResponseEntity<User> createUser(@RequestParam String name){
    //     User user = userService.createUser(name);
    //     return ResponseEntity.ok(user);
    // }

    // @GetMapping("/{id}")
    // public ResponseEntity<User> getUserById(@PathVariable Long id){
    //     User user = userService.getUserById(id);
    //     return ResponseEntity.ok(user);
    // }
}
