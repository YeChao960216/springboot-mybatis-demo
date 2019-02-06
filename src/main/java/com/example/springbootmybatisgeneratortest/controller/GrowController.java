package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Grow;
import com.example.springbootmybatisgeneratortest.service.GrowService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("grow")
public class GrowController {
    @Autowired
    private GrowService growService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Grow> getgrow(Grow entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "grow_id desc";
        } else if (sort.equals("2")) {
            sort = "grow_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Grow> list = new ArrayList<>(growService.select(entity));
        return new PageInfo<Grow>(list);
    }

    @PutMapping(value = "/put")
    public int putGrow(Grow entity) throws Exception {
        if (growService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteGrow(Grow entity) throws Exception {
        if (growService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postGrow(Grow entity) throws Exception {
        if (growService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
