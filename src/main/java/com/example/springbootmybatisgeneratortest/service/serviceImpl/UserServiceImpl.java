package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.mapper.UserMapper;
import com.example.springbootmybatisgeneratortest.pojo.User;
import com.example.springbootmybatisgeneratortest.pojo.UserExample;
import com.example.springbootmybatisgeneratortest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User entity) throws Exception {
        return userMapper.insert(entity);
    }

    @Override
    public int update(User entity) throws Exception {
        return userMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public int delete(User entity) throws Exception {
        return userMapper.deleteByPrimaryKey(entity.getUserId());
    }

    @Override
    public List<User> select(User entity) throws Exception {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        if (entity.getUserId() != null) {
            criteria.andUserIdEqualTo(entity.getUserId());
        }
        return userMapper.selectByExample(userExample);
    }
}
