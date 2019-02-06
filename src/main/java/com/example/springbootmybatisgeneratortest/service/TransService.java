package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Trans;

import java.util.List;

public interface TransService {
    int insert(Trans entity) throws Exception;

    int update(Trans entity) throws Exception;

    int delete(Trans entity) throws Exception;

    List<Trans> select(Trans entity) throws Exception;
}
