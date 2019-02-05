package com.example.springbootmybatisgeneratortest.service.serviceImpl;

import com.example.springbootmybatisgeneratortest.pojo.User;
import com.example.springbootmybatisgeneratortest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void add() {
        User user=new User();
        user.setName("测试");
        userService.add(user);
    }

    @Test
    public void get() {
        System.out.println(userService.get(1));
    }
}