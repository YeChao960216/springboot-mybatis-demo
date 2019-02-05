package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.UserMapper;
import com.example.springbootmybatisgeneratortest.pojo.User;
import com.example.springbootmybatisgeneratortest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ChaceYip
 * @create2018 -02 -02 -12:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User get(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
