package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Manufacture;
import com.example.springbootmybatisgeneratortest.service.ManufactureService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("manufacture")
public class ManufactureController {
    @Autowired
    private ManufactureService manufactureService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Manufacture> getmanufacture(Manufacture entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "manufacture_id desc";
        } else if (sort.equals("2")) {
            sort = "manufacture_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Manufacture> list = new ArrayList<>(manufactureService.select(entity));
        return new PageInfo<Manufacture>(list);
    }

    @PutMapping(value = "/put")
    public int putManufacture(Manufacture entity) throws Exception {
        if (manufactureService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteManufacture(Manufacture entity) throws Exception {
        if (manufactureService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postManufacture(Manufacture entity) throws Exception {
        if (manufactureService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
