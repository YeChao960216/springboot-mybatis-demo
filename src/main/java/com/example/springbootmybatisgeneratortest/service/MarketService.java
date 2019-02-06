package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Market;

import java.util.List;

public interface MarketService {
    int insert(Market entity) throws Exception;

    int update(Market entity) throws Exception;

    int delete(Market entity) throws Exception;

    List<Market> select(Market entity) throws Exception;
}
