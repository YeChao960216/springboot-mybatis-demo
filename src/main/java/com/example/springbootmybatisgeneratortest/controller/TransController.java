package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Trans;
import com.example.springbootmybatisgeneratortest.service.TransService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("trans")
public class TransController {
    @Autowired
    private TransService transService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Trans> gettrans(Trans entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "trans_id desc";
        } else if (sort.equals("2")) {
            sort = "trans_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Trans> list = new ArrayList<>(transService.select(entity));
        return new PageInfo<Trans>(list);
    }

    @PutMapping(value = "/put")
    public int putTrans(Trans entity) throws Exception {
        if (transService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteTrans(Trans entity) throws Exception {
        if (transService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postTrans(Trans entity) throws Exception {
        if (transService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
