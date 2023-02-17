package com.user.UserService.services;

import com.user.UserService.entity.User;

import java.util.List;

public interface UserService {
    //operation

    //create
    User saveUser(User user);
    //getUsers
    List<User> getUsers();
    //getSingleUser
    User getUserById(int id);
    //UpdateSingleUser
    User updateUser(User updateUser);
}
