package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.User;

import java.util.List;

public interface UserService {
    int insert(User entity) throws Exception;

    int update(User entity) throws Exception;

    int delete(User entity) throws Exception;

    List<User> select(User entity) throws Exception;
}
