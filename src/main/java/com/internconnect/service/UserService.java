package com.internconnect.service;

import com.internconnect.model.User;

import java.util.List;

public interface UserService{
    List<User> getUsers();

    User saveUser (User user);

    User getSingleUser (Long id);

    void deleteUser (Long id);

    User updateUser (User user);

    List<User> getUsersByName(String name);

    List<User> getUsersByNameAndAddress(String name, String address);
}
