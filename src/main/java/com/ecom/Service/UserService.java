package com.ecom.Service;

import com.ecom.Entity.User;

import java.util.List;

public interface UserService {
    List<User> fetchAllUsers();
    List<User> createUser(User user);
}
