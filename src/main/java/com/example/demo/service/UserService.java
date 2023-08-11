package com.example.demo.service;

import com.example.demo.db.dto.User;
import com.example.demo.db.dao.UserDAO;

import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class UserService {

    @Inject
    private UserDAO userDAO;

    public void createUser(String name, Integer age) {
        User newUser = new User();
        newUser.setName(name);
        newUser.setAge(age);

        userDAO.saveUser(newUser);
    }
}

