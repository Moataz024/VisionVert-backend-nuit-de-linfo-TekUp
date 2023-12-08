package com.tekup.visionvertbackend.service;


import com.tekup.visionvertbackend.entities.User;

import java.util.List;

public interface IUserService {


    User insertUser(User user);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteById(Long id);

    User getById(Long id);
}
