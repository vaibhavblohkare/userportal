package com.vebtech.userservice.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.vebtech.userservice.bean.User;

public interface UserRepository extends Repository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findOne(int id);

    User save(User user);
}
