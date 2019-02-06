package com.example.springbootmybatisgeneratortest.service;

import com.example.springbootmybatisgeneratortest.pojo.Company;

import java.util.List;

public interface CompanyService {
    int insert(Company entity) throws Exception;

    int update(Company entity) throws Exception;

    int delete(Company entity) throws Exception;

    List<Company> select(Company entity) throws Exception;
}
