package com.example.springbootmybatisgeneratortest.controller;

import com.example.springbootmybatisgeneratortest.pojo.MysqlGame;
import com.example.springbootmybatisgeneratortest.service.MysqlGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChaceYip
 * @create2018 -02 -02 -14:40
 */
@RestController
public class MysqlGameController {

    @Autowired
    MysqlGameService mysqlGameService;

    @GetMapping(value = "/mysqlgame/{id}")
    public MysqlGame getMysqlgame(@PathVariable("id") Integer id){
        return mysqlGameService.get(id);
        }
}
