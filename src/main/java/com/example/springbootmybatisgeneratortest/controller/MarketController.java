package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.Market;
import com.example.springbootmybatisgeneratortest.service.MarketService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("market")
public class MarketController {
    @Autowired
    private MarketService marketService;

    @GetMapping(value = "/get/{pageNum}/{pageSize}/{sort}")
    public PageInfo<Market> getmarket(Market entity, @PathVariable int pageNum, @PathVariable int pageSize, @PathVariable String sort) throws Exception {
        if (sort.equals("1")) {
            sort = "origin_id desc";
        } else if (sort.equals("2")) {
            sort = "origin_id";
        }
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy(sort);
        List<Market> list = marketService.select(entity);
        return new PageInfo<Market>(list);
    }

    @PutMapping(value = "/put")
    public int putMarket(Market entity) throws Exception {
        if (marketService.update(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @DeleteMapping(value = "/delete")
    public int deleteMarket(Market entity) throws Exception {
        if (marketService.delete(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @PostMapping(value = "/post")
    public int postMarket(Market entity) throws Exception {
        if (marketService.insert(entity) != 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
