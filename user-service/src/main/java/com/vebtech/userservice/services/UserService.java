package com.vebtech.userservice.services;

import java.util.List;

import com.vebtech.userservice.bean.User;

public interface UserService {

    User create(User user);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);
}
