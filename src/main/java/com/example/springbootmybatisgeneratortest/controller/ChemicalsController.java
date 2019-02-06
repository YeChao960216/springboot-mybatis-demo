package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Chemicals;
import com.example.springbootmybatisgeneratortest.service.ChemicalsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chemicals")
public class ChemicalsController {
    @Autowired
    private ChemicalsService chemicalsService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Chemicals> getchemicals(Chemicals entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "chemicals_id desc";
        } else if (sort.equals("2")) {
            sort = "chemicals_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Chemicals> list = chemicalsService.select(entity);
        return new PageInfo<Chemicals>(list);
    }

    @PutMapping(value = "/put")
    public int putChemicals(Chemicals entity) throws Exception {
        if (chemicalsService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteChemicals(Chemicals entity) throws Exception {
        if (chemicalsService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postChemicals(Chemicals entity) throws Exception {
        if (chemicalsService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
