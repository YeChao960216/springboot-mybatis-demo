package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Company;
import com.example.springbootmybatisgeneratortest.service.CompanyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("company")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Company> getcompany(Company entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "company_id desc";
        } else if (sort.equals("2")) {
            sort = "company_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Company> list = new ArrayList<>(companyService.select(entity));
        return new PageInfo<Company>(list);
    }

    @PutMapping(value = "/put")
    public int putCompany(Company entity) throws Exception {
        if (companyService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteCompany(Company entity) throws Exception {
        if (companyService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postCompany(Company entity) throws Exception {
        if (companyService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
