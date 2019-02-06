package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Role;
import com.example.springbootmybatisgeneratortest.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Role> getrole(Role entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "role_id desc";
        } else if (sort.equals("2")) {
            sort = "role_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Role> list = roleService.select(entity);
        return new PageInfo<Role>(list);
    }

    @PutMapping(value = "/put")
    public int putRole(Role entity) throws Exception {
        if (roleService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteRole(Role entity) throws Exception {
        if (roleService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postRole(Role entity) throws Exception {
        if (roleService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
