package com.user.UserService.controllers;

import com.user.UserService.entity.User;
import com.user.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;
    //Create
    public ResponseEntity<User> createUser(@RequestBody User user){
        User newUser = service.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }
    //single User
    @GetMapping("/{id}")
    public ResponseEntity<User> getOneUser(@PathVariable int id){
        User user = service.getUserById(id);
        return ResponseEntity.ok(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable User updateUser){
       User user =  service.updateUser(updateUser);
        return ResponseEntity.ok(user);
    }
    //All User

}
