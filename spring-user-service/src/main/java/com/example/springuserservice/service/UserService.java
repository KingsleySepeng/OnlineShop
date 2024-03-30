package com.example.springuserservice.service;

import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springuserservice.entity.User;
import com.example.springuserservice.repository.UserRepository;

@Service
public class UserService {
   private final UserRepository userRepository;

   @Autowired
   public UserService(UserRepository userRepository){
    this.userRepository = userRepository;
   }

   public User createUser(String name){
    User user = new User();
    user.setName(name);
    user.setCreatedAt(LocalDateTime.now());
    return userRepository.save(user);
   }

   public User getUserById(Long id){
    return userRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("User not found"));
   }
}
