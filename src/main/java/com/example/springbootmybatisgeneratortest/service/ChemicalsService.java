package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Chemicals;

import java.util.List;

public interface ChemicalsService {
    int insert(Chemicals entity) throws Exception;

    int update(Chemicals entity) throws Exception;

    int delete(Chemicals entity) throws Exception;

    List<Chemicals> select(Chemicals entity) throws Exception;
}
