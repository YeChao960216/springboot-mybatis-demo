package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.MysqlGame;

public interface MysqlGameService {

    void add(MysqlGame mysqlGame);

    void delete(int id);

    void update(MysqlGame mysqlGame);

    MysqlGame get(int id);

}
