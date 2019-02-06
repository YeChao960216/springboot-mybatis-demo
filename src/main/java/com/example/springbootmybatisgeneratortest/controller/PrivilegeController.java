package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Privilege;
import com.example.springbootmybatisgeneratortest.service.PrivilegeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("privilege")
public class PrivilegeController {
    @Autowired
    private PrivilegeService privilegeService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Privilege> getprivilege(Privilege entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "privilege_id desc";
        } else if (sort.equals("2")) {
            sort = "privilege_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Privilege> list = privilegeService.select(entity);
        return new PageInfo<Privilege>(list);
    }

    @PutMapping(value = "/put")
    public int putPrivilege(Privilege entity) throws Exception {
        if (privilegeService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deletePrivilege(Privilege entity) throws Exception {
        if (privilegeService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postPrivilege(Privilege entity) throws Exception {
        if (privilegeService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
