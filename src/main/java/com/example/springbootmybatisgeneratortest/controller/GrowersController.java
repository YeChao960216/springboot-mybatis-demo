package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Growers;
import com.example.springbootmybatisgeneratortest.service.GrowersService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("growers")
public class GrowersController {
    @Autowired
    private GrowersService growersService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Growers> getgrowers(Growers entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "growers_id desc";
        } else if (sort.equals("2")) {
            sort = "growers_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Growers> list = growersService.select(entity);
        return new PageInfo<Growers>(list);
    }

    @PutMapping(value = "/put")
    public int putGrowers(Growers entity) throws Exception {
        if (growersService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteGrowers(Growers entity) throws Exception {
        if (growersService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postGrowers(Growers entity) throws Exception {
        if (growersService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
