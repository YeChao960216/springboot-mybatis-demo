package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.User;
import com.example.springbootmybatisgeneratortest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChaceYip
 * @create2018 -02 -02 -14:40
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{id}")
    public User getMysqlgame(@PathVariable("id") Integer id){
        return userService.get(id);
        }
}
