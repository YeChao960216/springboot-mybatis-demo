package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.User;

public interface UserService {

    void add(User user);

    void delete(int id);

    void update(User user);

    User get(int id);

}
