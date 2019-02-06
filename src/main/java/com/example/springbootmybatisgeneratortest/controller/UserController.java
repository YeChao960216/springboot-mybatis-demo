package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.User;
import com.example.springbootmybatisgeneratortest.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<User> getuser(User entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "user_id desc";
        } else if (sort.equals("2")) {
            sort = "user_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<User> list = new ArrayList<>(userService.select(entity));
        return new PageInfo<User>(list);
    }

    @PutMapping(value = "/put")
    public int putUser(User entity) throws Exception {
        if (userService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteUser(User entity) throws Exception {
        if (userService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postUser(User entity) throws Exception {
        if (userService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
