package com.ecom.Controller;

import com.ecom.Entity.User;
import com.ecom.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/api/users")
    public List<User> getAllUsers(){
        return userService.fetchAllUsers();
    }

    @PostMapping("/api/users")
    public List<User> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/api/users/{id}")
    public User getUserById(@PathVariable Long id){
        // Implementation for fetching user by ID
        return userService.fetchUserById(id);


    }

}
