package com.user.UserService.services.implement;

import com.user.UserService.entity.User;
import com.user.UserService.exceptions.ResourceNotFound;
import com.user.UserService.repositories.UserRepository;
import com.user.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    //Add Users
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
//Get all Users
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        User user = userRepository.findById(id).orElseThrow(() -> new  ResourceNotFound("Given Id Not Matched"));
        return user;
    }

    @Override
    public User updateUser(User updateUser) {
        int id =updateUser.getId();
        User user = userRepository.findById(id).orElseThrow(() -> new  ResourceNotFound("Given Id Not Matched"));
        user.setFirstName(updateUser.getFirstName());
        user.setLastName(updateUser.getLastName());
        user.setEmail(updateUser.getEmail());
        user.setPhone(updateUser.getPhone());
        return userRepository.save(user);
    }
}
