package com.springboot.spring_bus.Controllers;

import com.springboot.spring_bus.Services.UserService;
import com.springboot.spring_bus.Schema.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody List<User> user){
        return userService.addUser(user);

    }
    @GetMapping("/getUser/{user_id}")
    public Optional<User> getUser(@PathVariable int user_id){
        Optional<User> user = userService.getUser(user_id);
        if (user == null){
            throw new RuntimeException("User not found"+ user_id);
        }
        else {
            return user;
        }
    }
    @DeleteMapping("/removeUser/{user_id}")
    public String deleteUser(@PathVariable int user_id){

        userService.deleteUser(user_id);
        return "User " +user_id +" deleted";
    }
}