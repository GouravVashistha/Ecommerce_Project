package com.ecom.ServiceImpl;

import com.ecom.Entity.User;
import com.ecom.Service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList = new ArrayList<>();

    @Override
    public List<User> fetchAllUsers() {
        return userList;
    }

    public List<User> createUser(User user) {
        userList.add(user);
        return userList;
    }
}
