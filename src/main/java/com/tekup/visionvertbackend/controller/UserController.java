package com.tekup.visionvertbackend.controller;


import com.tekup.visionvertbackend.entities.User;
import com.tekup.visionvertbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/")
    public User insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Long id){
        userService.deleteById(id);
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable("id")Long id){
        return userService.getById(id);
    }

}