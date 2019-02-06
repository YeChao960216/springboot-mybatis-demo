package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Grow;

import java.util.List;

public interface GrowService {
    int insert(Grow entity) throws Exception;

    int update(Grow entity) throws Exception;

    int delete(Grow entity) throws Exception;

    List<Grow> select(Grow entity) throws Exception;
}
