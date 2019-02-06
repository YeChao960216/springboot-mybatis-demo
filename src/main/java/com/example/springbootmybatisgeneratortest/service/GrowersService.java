package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Growers;

import java.util.List;

public interface GrowersService {
    int insert(Growers entity) throws Exception;

    int update(Growers entity) throws Exception;

    int delete(Growers entity) throws Exception;

    List<Growers> select(Growers entity) throws Exception;
}
