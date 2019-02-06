package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Manufacture;

import java.util.List;

public interface ManufactureService {
    int insert(Manufacture entity) throws Exception;

    int update(Manufacture entity) throws Exception;

    int delete(Manufacture entity) throws Exception;

    List<Manufacture> select(Manufacture entity) throws Exception;
}
