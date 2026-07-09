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
    private  Long nextId = 1L;

    @Override
    public List<User> fetchAllUsers() {
        return userList;
    }

    public List<User> createUser(User user) {
        user.setId(nextId++);
        userList.add(user);
        return userList;
    }

    @Override
    public User fetchUserById(Long id) {
       for(User user : userList){
           if(user.getId().equals(id)){
               return user;
           }
       }
       return null; // or throw an exception if user not found
    }
}
